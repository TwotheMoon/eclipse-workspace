package Practice;

public class practice06 {

	public static void main(String[] args) {
		final int PUKEPUEK_PIXED_DMG = 100;
		final int THEMOON_PIXED_DMG = 200;
		final int MIN_LENGTH_RANDOM = 15;
		final int MAX_LENGTH_RANDOM = 19;
		final int EX_VALUE = 0;
		
		Monster pukepuke = new Monster();
		Player theMoon = new Player();
		
		chractersMiniStatDisplay(theMoon, pukepuke);
		pukepuke.attackToPlayer(theMoon, PUKEPUEK_PIXED_DMG);
		theMoon.attackToMonster(pukepuke, THEMOON_PIXED_DMG);
		chractersMiniStatDisplay(theMoon, pukepuke);
		theMoon.healSelf(theMoon, Dice.dice(MIN_LENGTH_RANDOM, MAX_LENGTH_RANDOM, EX_VALUE));
		chractersMiniStatDisplay(theMoon, pukepuke);
	}
	
	public static void chractersMiniStatDisplay(Player p, Monster m) {
		p.introduce();
		m.introduce();
		System.out.println("\n");
	}
}
