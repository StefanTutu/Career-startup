package com.cgm.classes;

import com.cgm.childre.Exception1;
import com.cgm.childre.Exception2;
import com.cgm.childre.Exception3;
import com.cgm.childre.Exception4;

public class ExceptionException {


	public String adauga (int count ) throws Exception4 {
		if(count==20)
			throw new Exception4("4");
		return "Exception 4";
	}
	public String adauga1 (int count ) throws Exception3 {
		if(count==40)
			throw new Exception3("3");
		return "Exception 3";
	}
	public String adauga2 (int count ) throws Exception2 {
		if(count==60)
			throw new Exception2("2");
		return "Exception 2";
	}
	public String adauga3 (int count ) throws Exception1 {
		if(count==80)
			throw new Exception1("1");
		return "Exception 1";
	}
	

	
	
}
