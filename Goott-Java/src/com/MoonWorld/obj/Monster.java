package com.MoonWorld.obj;

public class Monster extends Character{
	static final int HP_DEFAULT_NUM = 0;
	static final int MP_DEFAULT_NUM = 0;
	
//	String name;  Character 클래스 상속 받음	
	int hp;
	int mp;
//	
//	public Monster(){
//		getName();
//		this.hp = HP_DEFAULT_NUM;
//		this.mp = MP_DEFAULT_NUM;
//	}
	
	public Monster(String name, int hp, int mp){
		super(name);	
		setName(name);
		this.hp = hp;
		this.mp = mp;
	}
	
	public void introduce() {
		System.out.println(
				String.format("몬스터:%s HP:%d MP:%d"
						, getName(), hp, mp)
				);
	}
	
	public void attacToPlayer(Player player, int damage) {
		player.hp = player.hp - damage;
		System.out.println(
				String.format("%s(이)가 %s에게 %d만큼 데미지를 줌"
						, getName(), player.getName(), damage)
				);
	}
	public void desc() {
		System.out.println("몬스터가 서있다.");
	}
}
