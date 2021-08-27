package com.EternalFantasy.obj;

import com.EternalFantasy.util.Dice;

public class Monster extends Character{
	final static int MONSTER_DEFAULT_HP = 100;
	final static int MONSTER_DEFAULT_MP = 30;
	final static int GOBLIN_HAND_DAMAGE = 4;
	
	//외부에서 씀
	public final static int MONSTER_BASE_DAMAGE = 20;
	
//	String name;
	int hp;
	int mp;
	public Monster() {
		this("고블린", MONSTER_DEFAULT_HP, MONSTER_DEFAULT_MP);
	}
	public Monster(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	public void introduce() {
		System.out.print("{" + name + "}[HP:" + hp + "/MP:" + mp + "]");
	}
	public void attackToPlayer(Player p, int damage) {
		int totalDamage = damage + Dice.dice(GOBLIN_HAND_DAMAGE);  		
		p.hp = p.hp - totalDamage;
//		p.hp = p.hp - damage - Dice.dice(GOBLIN_HAND_DAMAGE);

		String s = String.format("%s이(가) %s에게 %d 의 피해를 주었습니다."
				,name
				,p.name
				,totalDamage);		
		System.out.println(s);				
	}
}