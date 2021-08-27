package com.Lotto;

public class LottoPlay {
	private final static LottoPlay singleton = new LottoPlay();
	
	private LottoPlay() {}
	
	public static LottoPlay getInstance(){
		return singleton;
	}
	
	public void run() {
		int lotto[] = new int[6];
		
		for(int i = 0; i < 6; i++) {
			int random = (int)(Math.random() * 45 + 1);
			lotto[i] = random;
		}
		
		System.out.print("당첨번호 : ");
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
}
