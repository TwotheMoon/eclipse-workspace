package com.MoonWorld.obj;

public class Weapon extends Item {
	public Weapon(String name){
		super("무기");
	}
	public void desc() {
		System.out.println("한 자루 검이 놓여있다");
	}
	
	public void hit() {
		System.out.println("검으로 때렸다.");
	}
}
