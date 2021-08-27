package com.MoonWorld;

import com.MoonWorld.obj.*;
import com.MoonWorld.obj.Character;
import com.MoonWorld.util.*;

public class MoonWorldPlay {
	// 싱글톤 사용 하기 정적 필드
	private static MoonWorldPlay singleton = new MoonWorldPlay();
	// 생성자
	private MoonWorldPlay() {}
	// 정적 메소드
	static MoonWorldPlay getInstance() {
		return singleton;
	}
	
	void play() {
		final int MOON_DEFAULT_DMG = 100; 
		final int SLIME_DEFAULT_DMG = 100; 
		final int DEFAULT_HEAL_MIN_NUM = 15;
		final int DEFAULT_HEAL_NAX_NUM = 19;
		
		Player moon = new Player("이더문", 9999, 9999); 
		Monster slime = new Monster("슬라임", 1000, 1000);
		RandomNum randNum = new RandomNum();
		
		Weapon sword = new Weapon("한손검");
		Player playerMoon = moon;
		Monster monsterSlime = slime;
		
		
		GameObj objArr[] = {playerMoon,monsterSlime,sword};
		for(int i = 0; i < objArr.length; i++) {
			objArr[i].desc();
			if(objArr[i] instanceof Weapon) {
				Weapon ww = (Weapon)objArr[i];
				ww.hit();
			}
		}
		test(sword);
		

		miniDisplay(moon, slime);
		slime.attacToPlayer(moon, randNum.random(SLIME_DEFAULT_DMG));
		Time.sleepSet(1);
		
		miniDisplay(moon, slime);
		moon.attackToMonster(slime, randNum.random(MOON_DEFAULT_DMG));
		miniDisplay(moon, slime);
		Time.sleepSet(1);
		
		moon.healSelf(moon, randNum.random(DEFAULT_HEAL_MIN_NUM, DEFAULT_HEAL_NAX_NUM));
		miniDisplay(moon, slime);
	}
	
	private void miniDisplay(Player p, Monster m) {
		p.introduce();
		m.introduce();
		System.out.println();
	}
	public static void test(GameObj g) {
		g.desc();
	}
	
}
