package com.EternalFantasy.util;

public class Dice {
	final static int DICE_BASE_VALUE = 1;
	final static int START_END_RANGE_ADD_VALUE = 1;
	/* 정적 메소드 선언 : 1~rangeEnd 의 랜덤 수 리턴 */
	public static int dice(int rangeEnd) {
		int n = (int)(Math.random() * rangeEnd + DICE_BASE_VALUE);			
		return n;
	}
	/* 정적 오버로딩 메소드 선언 : 1~rangeEnd 의 랜덤 수에 mul 곱한 값 리턴 */
	public static int dice(int rangeEnd, int mul) {
		int n = (int)(Math.random() * rangeEnd + DICE_BASE_VALUE) * mul;		
		return n;
	}
	/* 정적 오버로딩 메소드 선언 : a~b 의 랜덤 수 리턴 */	
	public static int dice(int startRange, int endRange, int ex) {
		int randomRange = endRange - startRange + START_END_RANGE_ADD_VALUE;
		int n = (int)(Math.random() * randomRange + startRange);		
		return n;
	}
}