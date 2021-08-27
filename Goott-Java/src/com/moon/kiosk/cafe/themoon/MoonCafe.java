package com.moon.kiosk.cafe.themoon;

public class MoonCafe {
	public static String VERSION = "Console Kiosk Cafe TheMoon V0.02.00.01";
	
	public static void main(String[] args) {
		System.out.println(VERSION);
		MRun mRun = new MRun();
		mRun.run();
	}
}
