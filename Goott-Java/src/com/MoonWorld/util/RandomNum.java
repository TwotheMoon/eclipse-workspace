package com.MoonWorld.util;

import java.util.Random;

public class RandomNum {
	
	public int random(int damage){
		int randDmg = (int)(Math.random() * damage) + 1;
		return randDmg;
	}
	
	public int random(int startNum, int endNum) {
		int randHeal = new Random().nextInt(endNum - startNum) + startNum;
		return randHeal;
	}

}
