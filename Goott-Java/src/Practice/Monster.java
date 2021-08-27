package Practice;

public class Monster {
	static final int  MONSTER_INIT_HP = 1000;
	static final int  MONSTER_INIT_MP = 500;
	
	String name;
	int hp;
	int mp;
	
	Monster () {
		this.name = "푸케푸케";
		this.hp	= MONSTER_INIT_HP;
		this.mp = MONSTER_INIT_MP;
	}
	
	Monster(String name, int hp, int mp){
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	
	void introduce() {
		System.out.println("몬스터: " + name + " [HP:" + hp + "/MP:" + mp + "]" );
	}
	void attackToPlayer(Player player, int damage) {
		int totalDmg = Dice.dice(damage);
		player.hp = player.hp - totalDmg;
		System.out.println(
				String.format("%s이(가) %s에게 %d만큼 피해를 주었습니다."
						,this.name, player.name, totalDmg)
				);
	}
	
//	int sum(int ... ass) {
//		for(int i = 0; i < ass.length; i++) {
//			// 여러개의 갯수를 모르는 매개변수를 받을떄
//		}
//		return 0;
//	}
}


