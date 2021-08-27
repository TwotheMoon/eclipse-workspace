package Practice;


public class practice05 {

	public static void main(String[] args) {
		Monster pukepuke = new Monster();
		pukepuke.introduce();
		
		Monster rathalos = new Monster("리오레우스", 500, 300);
		rathalos.introduce();
		
		Player theMoon = new Player();
		theMoon.introduce();
		
		Player mari = new Player("마리", 50, 300);
		mari.introduce();
		
		pukepuke.attackToPlayer(theMoon, 20);
		theMoon.introduce();
		
		theMoon.attackToMonster(pukepuke, 50);
		pukepuke.introduce();
	}
}
