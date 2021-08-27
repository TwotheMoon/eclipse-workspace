package com.MoonWorld.util;

public class Time {
	
	public static void sleepSet(int sec) {
		long lsec = (long)(sec * 1000);
		try {
			Thread.sleep(lsec);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
