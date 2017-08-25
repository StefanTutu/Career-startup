package com.cgm.networking.classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;

public class URLConnection {

	public static void urlConnect() throws Exception {
		BufferedReader br = null;
		try {
			URL url = new URL("http://www.uaic.ro/");
			InputStream in = url.openStream();
			br = new BufferedReader(new InputStreamReader(in));

			// save to this filename
			String fileName = "C://Users//stefan.tutu//Downloads//Site//index.html";
			File file = new File(fileName);

			if (!file.exists()) {
				file.createNewFile();
			}

			// use FileWriter to write file
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);

			String linie;

			while ((linie = br.readLine()) != null) {
				//System.out.println(linie);
				bw.write(linie);
			}
//			org.jsoup.nodes.Document doc = Jsoup.parse(linie);
//			org.jsoup.nodes.Element style = doc.select("style").first();
//			Matcher cssMatcher = Pattern.compile("[.](\\w+)\\s*[{]([^}]+)[}]").matcher(style.html());
//
//			while (cssMatcher.find()) {
//				System.out.println("Style `" + cssMatcher.group(1) + "`: " + cssMatcher.group(2));
//			}

			bw.close();
			br.close();

			System.out.println("Done");

		} catch (Exception e) {
			System.err.println("You should log this error!");
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
