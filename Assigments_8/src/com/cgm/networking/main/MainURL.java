package com.cgm.networking.main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.cgm.networking.classes.GetImages;
import com.cgm.networking.classes.URLJsoup;
import com.cgm.networking.classes.URLJsoupSecond;

public class MainURL {

	public static void main(String[] args) throws Exception {

		Document doc = Jsoup.connect("http://www.uaic.ro")
				.userAgent("Mozilla/5.0 (Windows; U; WindowsNT 5.1; en-US; rv1.8.1.6) Gecko/20070725 Firefox/2.0.0.6")
				.timeout(6000)
				.get();
		Document doc2 = Jsoup.connect("http://www.uaic.ro/despre-uaic/")
				.userAgent("Mozilla/5.0 (Windows; U; WindowsNT 5.1; en-US; rv1.8.1.6) Gecko/20070725 Firefox/2.0.0.6")
				.timeout(6000)
				.get();
		
		// URL connect
		//URLConnection.urlConnect();
		//URLAbout.urlConnect();
		
		GetImages.urlImages();
		//URLJsoup.urlConnect();
		URLJsoup jsoup = new URLJsoup();
		jsoup.getJavaScript(doc);
		jsoup.getCSS(doc);
		jsoup.media(doc);
		
		URLJsoupSecond.urlConnect();
		URLJsoupSecond jsoup2 = new URLJsoupSecond();
		jsoup2.getJavaScript(doc2);
		jsoup2.getCSS(doc2);
		
	}

}
