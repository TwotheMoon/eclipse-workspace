package com.EternalFantasy;

import com.EternalFantasy.obj.Monster;
import com.EternalFantasy.obj.Player;
import com.EternalFantasy.util.Time;

public class EternalFantasyPlay {
	private static EternalFantasyPlay singletone = new EternalFantasyPlay();
	private EternalFantasyPlay() {}
	
	public static EternalFantasyPlay getInstance() {
		return singletone;
	}
	
	public void play() {
		
		Player player = new Player();
		Monster monster = new Monster();
		miniStatDisplay(player, monster);
		
		Time.delay(1);
		monster.attackToPlayer(player, Monster.MONSTER_BASE_DAMAGE);
		player.attackToMonster(monster, Player.PLAYER_BASE_DAMAGE);
		
		Time.delay(1);
		miniStatDisplay(player, monster);
		player.healSelf();
		miniStatDisplay(player, monster);
	}
	
	private static void miniStatDisplay(Player p, Monster m) {
		p.introduce();
		m.introduce();		
		System.out.print("\n");
	}
	
}
