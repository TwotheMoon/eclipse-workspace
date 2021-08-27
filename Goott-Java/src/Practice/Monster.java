package Practice;

public class Monster {
	static final int  MONSTER_INIT_HP = 1000;
	static final int  MONSTER_INIT_MP = 500;
	
	String name;
	int hp;
	int mp;
	
	Monster () {
		this.name = "Ǫ��Ǫ��";
		this.hp	= MONSTER_INIT_HP;
		this.mp = MONSTER_INIT_MP;
	}
	
	Monster(String name, int hp, int mp){
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	
	void introduce() {
		System.out.println("����: " + name + " [HP:" + hp + "/MP:" + mp + "]" );
	}
	void attackToPlayer(Player player, int damage) {
		int totalDmg = Dice.dice(damage);
		player.hp = player.hp - totalDmg;
		System.out.println(
				String.format("%s��(��) %s���� %d��ŭ ���ظ� �־����ϴ�."
						,this.name, player.name, totalDmg)
				);
	}
	
//	int sum(int ... ass) {
//		for(int i = 0; i < ass.length; i++) {
//			// �������� ������ �𸣴� �Ű������� ������
//		}
//		return 0;
//	}
}


