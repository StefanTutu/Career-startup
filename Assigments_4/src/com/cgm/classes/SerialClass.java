package com.cgm.classes;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class SerialClass implements Serializable {

	private Date currentTime;

    public SerialClass() {
        currentTime = Calendar.getInstance().getTime();
    }

    public Date getCurrentTime() {
        return currentTime;
    }
}
