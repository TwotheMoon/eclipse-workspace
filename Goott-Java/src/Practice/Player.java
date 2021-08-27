package Practice;

public class Player {
	static final int PLAYER_INIT_HP = 9999;
	static final int PLAYER_INIT_MP = 9999;
	static final int ATTACK_TO_MONSTER_PLUS_DMG = 2;
	
	String name;
	int hp;
	int mp;
	
	Player(){
		this.name = "�̴���";
		this.hp = PLAYER_INIT_HP;
		this.mp = PLAYER_INIT_MP;
	}
	
	Player(String name, int hp, int mp){
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	
	void introduce() {
		System.out.println("����: " + name + " [HP:" + hp + "/MP:" + mp + "]" );
	}
	void attackToMonster(Monster monster, int demage) {
		int totalDmg = Dice.dice(demage, ATTACK_TO_MONSTER_PLUS_DMG);
		monster.hp = monster.hp - totalDmg;
		System.out.println(
						String.format("%s��(��) %s���� %d��ŭ ���ظ� �־����ϴ�."
								,name, monster.name,  totalDmg)
					);
	}
	void healSelf(Player player, int ranHeal) {
		int heal = hp + ranHeal;
		hp = heal;
		System.out.println(
				String.format("%s(��)�� %d��ŭ HPȸ�� ����"
				,player.name, ranHeal)
				);
	}

}
