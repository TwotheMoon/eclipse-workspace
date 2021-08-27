package com.EternalFantasy.obj;

import com.EternalFantasy.util.Dice;

public class Player extends Character {
	final static int PLAYER_DEFAULT_HP = 200;
	static final int PLAYER_DEFAULT_MP = 100;
	final static int DAGGER_DEFAULT_BONUS_DAMAGE = 6;
	final static int DAGGER_DEFAULT_BONUS_DAMAGE_MUL = 2;
	final static int PLAYER_HEAL_DEFAULT_START = 1;
	final static int PLAYER_HEAL_DEFAULT_END = 2;
	final static int PLAYER_HEAL_DEFAULT_EX = 0;
	
	//외부에서 씀
	public final static int PLAYER_BASE_DAMAGE = 30;
	
//	String name;
	int hp;
	int mp;
	public Player() {
		this("홍길동", PLAYER_DEFAULT_HP, PLAYER_DEFAULT_MP);
	}
	public Player(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	public void introduce() {
		System.out.print("{" + name + "}[HP:" + hp + "/MP:" + mp + "]");
	}
	public void attackToMonster(Monster m, int damage) {
		int totalDamage = damage + Dice.dice(DAGGER_DEFAULT_BONUS_DAMAGE,DAGGER_DEFAULT_BONUS_DAMAGE_MUL); 
		m.hp = m.hp - totalDamage;
		System.out.println(
				String.format("%s이(가) %s에게 %d 의 피해를 주었습니다."
						,name
						,m.name
						,totalDamage)				
				);		
	}
	public void healSelf() {
		int totalHeal = Dice.dice(
				PLAYER_HEAL_DEFAULT_START
				, PLAYER_HEAL_DEFAULT_END
				, PLAYER_HEAL_DEFAULT_EX); 
		hp = hp + totalHeal;
		System.out.println(
				String.format("%s의 체력이 %d 회복됐습니다."
						,name
						,totalHeal)				
				);				
	}
}