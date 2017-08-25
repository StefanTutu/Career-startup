package com.cgm.main;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.cgm.childre.Exception1;
import com.cgm.childre.Exception2;
import com.cgm.childre.Exception3;
import com.cgm.childre.Exception4;
import com.cgm.childre.TemperatureException;
import com.cgm.childre.TooColdException;
import com.cgm.childre.TooHotException;
import com.cgm.classes.ExceptionException;
import com.cgm.classes.FileReaders;

public class MainException {

	public static void main(String[] args) throws Exception4,Exception3, Exception2,Exception1, TemperatureException, TooHotException, TooColdException {
		
		ExceptionException ex = new ExceptionException();
		
//		
//		ex.adauga3(80);
//		
//		ex.adauga2(60);
//		
//		ex.adauga1(40);
//		
//		ex.adauga(20);
		
		
		try {
		final int tooCold = 65;
	    final int tooHot = 85;
	    int temperature = 40;
	        if (temperature <= tooCold) {
	            throw new TooColdException(temperature);
	        }
	        else if (temperature >= tooHot) {
	            throw new TooHotException(temperature);
	        }
	        
	        try {
	            int i = (int) (Math.random() * 4.0);
	            switch (i) {
	            case 0:
	                throw new TooHotException(i);
	            case 1:
	                throw new TooColdException(i);
	            default:
	                throw new TemperatureException(i);
	            }
	        }
	        catch (TooHotException e) {
	            System.out.println("This coffee is too hot.");
	   
	        }
		}
		catch (Exception e) {
			System.out.println("Caffe temperature");
			e.printStackTrace();
		}
	     
	        
	        
	   // NullPointerException
		try {
	    Object obj = null;
	    obj.hashCode();
	    }
		catch (Exception e) {
			System.out.println("Error NullPointerException");
			e.printStackTrace();
		}
	    
		//ArithmeticException (for division by 0)
		try {
	    int count=0;
	    int pay=10;
	    double rest=pay/count;
	    }
		catch (Exception e) {
			System.out.println("Error ArithmeticException");
			e.printStackTrace();
		}
	    
		try {
		//NumberFormatException(for parsing an integer)
	    String text = " asd";
	    Integer value = Integer.parseInt(text);
			}
		catch (Exception e) {
			System.out.println("Error Number Format Exception");
			e.printStackTrace();
		}
	    
	    //NotSerializableException (for serialization of an object)
		try {
	    String filename = "time.ser";
        	if(args.length > 0){
            filename = args[0];
        }
		
        MainException time = new MainException();
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        
            fos = new FileOutputStream(filename);
            out = new ObjectOutputStream(fos);
            out.writeObject(time);
            out.close();
      
        }
        catch (Exception e) {
        	System.out.println("Error NoSerializable");
        	e.printStackTrace();
		}

	}

}
