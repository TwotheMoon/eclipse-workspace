package com.EternalFantasy.util;

public class Time {
	
	public static void delay(int sec) {
		long lsec = (long)(sec * 1000);
		try {
			Thread.sleep(lsec);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
