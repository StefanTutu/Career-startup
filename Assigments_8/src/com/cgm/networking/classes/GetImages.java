package com.cgm.networking.classes;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GetImages {

	private static final String folderPath = "C://Users//stefan.tutu//Downloads//Site//Images";

	public static void urlImages() throws Exception {

		Document doc = Jsoup.connect("http://www.uaic.ro/").get();

		try {
			Elements images = doc.getElementsByTag("img");

			for (Element el : images) {
				System.out.println("src" + el.attr("abs:src"));

				// for each element get the srs url
				String src = el.absUrl("src");
				System.out.println("Image Found!");

				System.out.println("src attribute is : " + src);
				getImages(src);

			}
		} catch (IOException ex) {
			System.err.println("Error!!!!");
			Logger.getLogger(GetImages.class.getName()).log(Level.SEVERE, null, ex);
		}
		System.out.println("Get all the images from the site!");

	}

	private static void getImages(String src) throws IOException {

		@SuppressWarnings("unused")
		String folder = null;

		// Exctract the name of the image from the src attribute
		try {
			int indexname = src.lastIndexOf("/");
			if (indexname == src.length()) {
				src = src.substring(1, indexname);
			}

			indexname = src.lastIndexOf("/");
			String name = src.substring(indexname, src.length());
			System.out.println(name);

			// Open a URL Stream
			URL url = new URL(src);
			InputStream in = url.openStream();
			OutputStream out = new BufferedOutputStream(new FileOutputStream(folderPath + name));
			for (int b; (b = in.read()) != -1;) {
				out.write(b);
			}
			out.close();
			in.close();
		} catch (Exception e) {
			System.err.println("Finish");
		}

	}

}
