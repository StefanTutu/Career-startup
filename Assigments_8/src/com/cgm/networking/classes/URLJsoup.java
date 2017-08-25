package com.cgm.networking.classes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class URLJsoup {

	private static final String folderPath = "C://Users//stefan.tutu//Downloads//Site";

	public static void urlConnect() throws Exception {

		// Document doc = Jsoup.connect("http://www.uaic.ro").get();
		Document doc = Jsoup.connect("http://www.uaic.ro")
				.userAgent("Mozilla/5.0 (Windows; U; WindowsNT 5.1; en-US; rv1.8.1.6) Gecko/20070725 Firefox/2.0.0.6")
				// .timeout(6000)
				.get();
		Element content = doc.getElementById("content");
		// String title = doc.title();
		// System.out.println("Title: " + title);
		//
		System.out.println("Content " + content);

		Elements links = doc.select("a[href]");

		for (Element link : links) {
			System.out.println("\nlink : " + link.attr("href"));
			System.out.println("text: " + link.text());

		}

		// save to this filename
		String fileName = "C://Users//stefan.tutu//Downloads//Site//main.html";
		File file = new File(fileName);

		if (!file.exists()) {
			file.createNewFile();
		}

		// use FileWriter to write file
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		try {
			bw.write(doc.toString());
		} catch (IOException e) {
			System.err.println("Error" + e);
		}
		System.out.println("Get HTML from main page !");
	}

	public void getCSS(Document doc) {

		try {
			Element style = doc.select("style").first();
			Matcher cssMatcher = Pattern.compile("[.](\\w+)\\s*[{]([^}]+)[}]").matcher(style.html());
			String fileName = "C://Users//stefan.tutu//Downloads//Site//css//index.css";
			File file = new File(fileName);

			if (!file.exists()) {
				file.createNewFile();
			}

			// use FileWriter to write file
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			try {
				// bw.write(doc.toString());
				bw.write("Style `" + cssMatcher.group(1) + "`: " + cssMatcher.group(2));
			} catch (IOException e) {
				System.err.println("Error" + e);
			}
			System.out.println("Style `" + cssMatcher.group(1) + "`: " + cssMatcher.group(2));

		} catch (Exception e) {
			System.err.println("Error" + e);
		}
		System.out.println("Get Css from main page !");
	}

	public void getJavaScript(Document doc) {
		try {
			Element script = doc.select("script").first(); // Get the script
															// part

			Pattern p = Pattern.compile("(?is)key=\"(.+?)\""); // Regex for the
																// value of the
																// key
			Matcher m = p.matcher(script.html());

			String fileName = "C://Users//stefan.tutu//Downloads//Site//js//index.js";
			File file = new File(fileName);

			if (!file.exists()) {
				file.createNewFile();
			}

			// use FileWriter to write file
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			try {
				// bw.write(doc.toString());
				bw.write("Script " + m.group());
			} catch (IOException e) {
				System.err.println("Error" + e);
			}
			System.out.println(m.group()); // the whole key ('key = value')
			System.out.println(m.group(1)); // value only

		} catch (Exception e) {
			System.err.println("Error" + e);
		}
		System.out.println("Get JavaScript from main page !");
	}

	public void media(Document doc) throws IOException {
		Elements media = doc.select("[src]");
		System.out.println("\nMedia:" + media.size());
		for (Element src : media) {
			if (src.tagName().equals("img"))
				System.out.println(src.tagName() + " " + src.attr("abs:src") + src.attr("width") + src.attr("height"));
			else
				System.out.println(src.tagName() + " " + src.attr("abs:src"));
			// save to this filename
			String fileName = "C://Users//stefan.tutu//Downloads//Site//javascript.js";
			File file = new File(fileName);

			if (!file.exists()) {
				file.createNewFile();
			}

			// use FileWriter to write file
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			try {
				bw.write(src.attr("abs:src"));
			} catch (IOException e) {
				System.err.println("Error" + e);
			}
		}
	}

	// //let's add attribute rel="nofollow" to all the links
	// doc.select("a[href]").attr("rel", "nofollow");
	// //System.out.println(doc.html());
	//
	// //change div class="class1" to class2
	// doc.select("div.class1").attr("class", "class2");
	// //System.out.println(doc.html());
	//
	// //change the HTML value of first h1 element
	// doc.select("h1").first().html("Welcome to JournalDev.com");
	// doc.select("h1").first().append("!!");
	// //System.out.println(doc.html());
}