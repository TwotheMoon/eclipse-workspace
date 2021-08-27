package com.MoonWorld.obj;

public abstract class Character extends GameObj{
//	String name; GameObj 상속 받고 Player, Monster 클래스 상속 줌
	String race;
	
	public Character(String name) {
		super(name); //명시 하지는 않지만 부모클래스(GameObj) 에서 호출  
		
	}
	
	public void desc(){
		
	}
}

