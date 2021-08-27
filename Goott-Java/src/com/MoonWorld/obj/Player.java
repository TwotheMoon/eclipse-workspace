package com.MoonWorld.obj;

public class Player extends Character{
	static final int HP_DEFAULT_NUM = 0;
	static final int MP_DEFAULT_NUM = 0;
	
	
//	String name;  Character 클래스 상속 받음
	int mp;
	int hp;
	
//	public Player(){
//		getName();
//		this.hp = HP_DEFAULT_NUM;
//		this.mp = MP_DEFAULT_NUM;
//	}
	
	public Player(String name, int hp, int mp){
		super(name);
		setName(name); 
		this.hp = hp;
		this.mp = mp;
	}
	
	public void introduce() {
		//super.introduce();	// <- Character <- GameObj에 introduce();메소드 호출
		// 오버라이드 재정의 매소드 호출법
		System.out.println(
				String.format("유저:%s HP:%d MP:%d"
						,getName(), hp, mp )
				);
	}
	
	public void attackToMonster(Monster monster, int damage) {
		
		monster.hp = monster.hp - damage;
		System.out.println(
				String.format("%s(이)가 %s에게 %d만큼 데미지를 줌"
						, getName(), monster.getName(), damage)
				);
	}
	
	public void healSelf(Player player, int heal) {
		player.hp = player.hp + heal;
		System.out.println(
				String.format("%s(이)가 %s에게 %d만큼 힐링 시전"
						, getName(), getName(), heal)
				);
	}
	
	public void desc() {
		System.out.println("플레이어가 서있다.");
	}
}
