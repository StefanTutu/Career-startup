package com.cgm.classes;

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class ResourceDownloader {
	private String removeSpecialChars(String fileName) {
		int qMarkLocation = fileName.indexOf("?");
		if (qMarkLocation > -1) {
			fileName = fileName.substring(0, qMarkLocation);
		}
		return fileName;
	}

	public void downloadResource(URL resource, String localDestination) {
		try {
			ReadableByteChannel inputStream = Channels.newChannel(resource.openStream());

			localDestination = removeSpecialChars(localDestination);
			File destinationFile = new File(localDestination);
			destinationFile.getParentFile().mkdirs();
			// System.out.println("Creating file: " + localDestination);
			destinationFile.createNewFile();

			FileOutputStream outputStream = new FileOutputStream(destinationFile);
			outputStream.getChannel().transferFrom(inputStream, 0, Long.MAX_VALUE);
			outputStream.close();
			inputStream.close();
		} catch (IOException e) {
			System.out.println("Error downloading resource: " + e.getMessage());
			e.printStackTrace();
		}

	}
}
