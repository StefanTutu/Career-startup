package com.cgm.classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile {
	
	public void readFile() {
		try {
			File file = new File("C:\\Users\\stefan.tutu\\Downloads\\Matrix1.txt");
			FileReader fr;

			fr = new FileReader(file);

			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				if (line.contains("Hello")) {
					System.out.println(line);
				}
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			// log error
		} catch (IOException e) {
			// log error
		}
	}
	
	public void readFileJ8String() {
		try {
			String content = new String(Files.readAllBytes(Paths.get("C:\\Users\\stefan.tutu\\Downloads\\Matrix1.txt")));
			System.out.println(content);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			String content = new String(Files.readAllBytes(Paths.get("C:\\Users\\stefan.tutu\\Downloads\\Matrix2.txt")));
			System.out.println(content);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
