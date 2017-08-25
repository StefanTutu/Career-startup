package com.cgm.main;

import com.cgm.classes.WebPageDownloader;

public class Main {
	public static void main(String[] args) {
		String rootUrl = "http://www.info.uaic.ro/";
		Thread spiderDownloader = new WebPageDownloader(rootUrl);
		
		spiderDownloader.start();
	}
}
