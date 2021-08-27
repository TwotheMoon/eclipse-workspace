package Practice;

public class Player {
	static final int PLAYER_INIT_HP = 9999;
	static final int PLAYER_INIT_MP = 9999;
	static final int ATTACK_TO_MONSTER_PLUS_DMG = 2;
	
	String name;
	int hp;
	int mp;
	
	Player(){
		this.name = "이더문";
		this.hp = PLAYER_INIT_HP;
		this.mp = PLAYER_INIT_MP;
	}
	
	Player(String name, int hp, int mp){
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	
	void introduce() {
		System.out.println("유저: " + name + " [HP:" + hp + "/MP:" + mp + "]" );
	}
	void attackToMonster(Monster monster, int demage) {
		int totalDmg = Dice.dice(demage, ATTACK_TO_MONSTER_PLUS_DMG);
		monster.hp = monster.hp - totalDmg;
		System.out.println(
						String.format("%s이(가) %s에게 %d만큼 피해를 주었습니다."
								,name, monster.name,  totalDmg)
					);
	}
	void healSelf(Player player, int ranHeal) {
		int heal = hp + ranHeal;
		hp = heal;
		System.out.println(
				String.format("%s(은)는 %d만큼 HP회복 시전"
				,player.name, ranHeal)
				);
	}

}
