package com.cgm.Assignment6.classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PerformanceLog {
	private long startTime;
	private long endTime;
	//private String listTypeUsed;
	private String periodName;
	private String outputFileName;
	
	public PerformanceLog(String outputFileName, String listTypeUsed) {
		this.outputFileName = outputFileName;
		try {
			FileWriter fileWriter = new FileWriter(outputFileName, true);
			BufferedWriter writer = new BufferedWriter(fileWriter);
			
			writer.write(System.getProperty("line.separator") + "List type: " + listTypeUsed + ". Timer started! " + System.getProperty("line.separator"));
			
			writer.flush();
			writer.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void start(String periodName) {
		this.periodName = periodName;
		startTime = System.nanoTime();
	}
	
	public void stop() {
		endTime = System.nanoTime() - startTime;
		periodName += ": " + endTime + "ns" + System.getProperty("line.separator");
		
		try {
			FileWriter fileWriter = new FileWriter(outputFileName, true);
			BufferedWriter writer = new BufferedWriter(fileWriter);
			
			writer.write(periodName);
			
			writer.flush();
			writer.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		periodName = null;
	}
	
	
}
