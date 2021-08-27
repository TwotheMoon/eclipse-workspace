package com.MoonWorld.obj;

public abstract class GameObj {
	private String name;

	
	public String getName() {		// getters and setters
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public GameObj(String name){
		this.name = name;
	}
	
	public void introduce() {
		System.out.println(name);
	}
	
	public abstract void desc();
	

	
}
