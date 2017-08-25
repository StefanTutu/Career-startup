package com.cgm.classes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebPageDownloader extends Thread {
	private URL url;
	private int depth;
	private String destinationFolder = "downloads\\";
	private String assetsFolder = "assets\\";
	private boolean isIndexPage;

	public WebPageDownloader(String url) {
		this.depth = 2;
		try {
			this.url = new URL(url);
		} catch (MalformedURLException e) {
			System.out.println("Unable to load URL " + e.getMessage());
		}
		isIndexPage = true;
	}

	public WebPageDownloader(String url, int depth) {
		try {
			if (url.endsWith("/")) {
				url = url.substring(0, url.length() - 2);
			}
			this.url = new URL(url);
		} catch (MalformedURLException e) {
			System.out.println("Unable to load URL " + e.getMessage());
		}
		this.depth = depth;
		this.isIndexPage = false;
	}

	private URL normalizeURL(String urlToBeProcessed) {
		if (urlToBeProcessed.startsWith("/")) {
			urlToBeProcessed = this.url.getHost() + urlToBeProcessed;
		}
		if (!urlToBeProcessed.startsWith("http://") && !urlToBeProcessed.startsWith("https://")) {
			urlToBeProcessed = "http://" + urlToBeProcessed;
		}
		try {
			return new URL(urlToBeProcessed);
		} catch (MalformedURLException e) {
			System.out.println("Error normalizing URL: " + e.getMessage());
			// e.printStackTrace();
			return null;
		}
	}

	private String downloadToLocalFile(String remoteFile) {
		String localFile = assetsFolder + getNameFromPath(remoteFile);
		ResourceDownloader downloader = new ResourceDownloader();
		downloader.downloadResource(normalizeURL(remoteFile), destinationFolder + localFile);
		return localFile;
	}

	private String getNameFromPath(String filePath) {
		File externalFile = new File(filePath);
		return externalFile.getName();
	}

	@Override
	public void run() {
		String remoteFileName = getNameFromPath(url.getFile());
		if (remoteFileName == "" || remoteFileName == null) {
			remoteFileName = "index";
		}
		String outputFileName = destinationFolder + ((isIndexPage) ? ("index") : (remoteFileName));
		int qMarkLocation = outputFileName.indexOf("?");
		if (qMarkLocation > -1) {
			outputFileName = outputFileName.substring(0, qMarkLocation);
		}
		if (!outputFileName.endsWith(".html") && !outputFileName.endsWith(".htm")) {
			outputFileName += ".html";
		}

		try {
			Document html = Jsoup.connect(url.toString()).get();
			Elements media = html.select("[src]");
			Elements imports = html.select("link[href]");
			Elements links = html.select("[href]");
			URL urlToBeProcessed;

			for (Element mediaFile : media) {
				urlToBeProcessed = normalizeURL(mediaFile.attr("src"));
				if (urlToBeProcessed.getHost().equals(url.getHost())) {
					mediaFile.attr("src", downloadToLocalFile(urlToBeProcessed.getFile()));
				}
			}

			for (Element importedFile : imports) {
				urlToBeProcessed = normalizeURL(importedFile.attr("href"));
				if (urlToBeProcessed.getHost().equals(url.getHost())) {
					importedFile.attr("href", downloadToLocalFile(urlToBeProcessed.getFile()));
				}
			}

			// System.out.println("Depth: " + depth);
			if (depth > 1) {
				String localFileName;
				for (Element link : links) {
					System.out.println("Parsing anchor: " + link.outerHtml());

					urlToBeProcessed = normalizeURL(link.attr("href"));
					if (urlToBeProcessed.getHost().equals(url.getHost())) {
						localFileName = getNameFromPath(urlToBeProcessed.getFile());
						link.attr("href", localFileName + ".html");

						// System.out.println("Parsed anchor: " + link.outerHtml());
						// Thread childThread = new Thread(new
						// WebPageDownloader(urlToBeProcessed.toString(), depth - 1));
						// childThread.start();

						WebPageDownloader newDownloader = new WebPageDownloader(urlToBeProcessed.toString(), depth - 1);
						newDownloader.run();
					}
				}
			}

			FileWriter destinationFileWriter = new FileWriter(outputFileName);
			BufferedWriter destinationFile = new BufferedWriter(destinationFileWriter);
			System.out.println("Writing file: " + outputFileName);
			destinationFile.write(html.toString());
			destinationFile.close();

		} catch (IOException e) {
			System.out.println("Unable to parse url: " + e.getMessage());
		}
	}
}
