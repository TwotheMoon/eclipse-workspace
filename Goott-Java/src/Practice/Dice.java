package Practice;

import java.util.Random;

public class Dice {
	static final int RANDOM_ZERO_TO_PLUS = 1;
	
	static int dice(int rangEnd) {
		int randDmg = (int)(Math.random() * rangEnd + RANDOM_ZERO_TO_PLUS);
		return randDmg;
	}
	
	static int dice(int rangEnd, int plusDmg) {
		int randDmgPlus = (int)(dice(rangEnd) * plusDmg);
		return randDmgPlus;
	}
	
	static int dice(int startRange, int endRange, int ex) {
		int ranHeal = new Random().nextInt(endRange - startRange) + startRange;
		return ranHeal;
	}
	
}
