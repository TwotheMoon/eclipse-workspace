package com.moon.kiosk.cafe.themoon.display;


import com.moon.kiosk.cafe.themoon.menupan.Menupan;
import com.moon.kiosk.cafe.themoon.settings.Settings;

public class Display {
	public final static String STAR = "★";
	public final static int STAR_COUNT = 32;
	public static void displayMain() {
		displayStarsLine();
		System.out.print(Settings.shopName + "\n");
		displayStarsLine();
		System.out.print(
						"1.	주문하기(매장)\n"
						+"2.	주문하기(포장)\n"
						+"s.	시스템 설정\n"
						+"exit.	프로그램 종료\n"
						+"입력 : "
				);
	}
	
	public static void displayMenuPan(Menupan menuPan) {
		displayMenuPanTitle();
		String orderString;
		for(int i=0;i<menuPan.products.size();i++) {
			orderString = "";
			if(menuPan.orderCounts.get(i) > 0) {
				orderString = String.format("[주문:%3s개]", menuPan.orderCounts.get(i));
			}
			System.out.println(
					String.format("%d. %-10s %,d원 %s", i+1 , menuPan.products.get(i).name, menuPan.products.get(i).price, orderString)
					);
		}
		int totalPayment = menuPan.calculteTotalpayment();
		displayMenuPanTotalPayment(totalPayment);
		displayMenuPanBot();
	}
	public static void displayStarsLine() {
		for(int i=0;i<STAR_COUNT;i++) {
			System.out.print(STAR);
		}
		System.out.println();
	}	
	public static void displayMenuPanTitle() {				
		displayStarsLine();			
		System.out.println(			
				"* 메뉴판 \n"	
				+"*   메뉴번호-메뉴수량을 입력하세요. \n"	
				+"*   예시: 마카롱 3개를 주문 할 경우 \n"	
				+"*        1-3 \n"	
				+"*        을 입력하세요"	
				);	
		displayStarsLine();			
	}				
	public static void displayMenuPanBot() {				
		displayStarsLine();			
		System.out.print(			
				"* c. 카드결제 \n"	
				+"* h. 현금결제 \n"	
				+"* b.   주문취소하고 뒤로가기 \n"	
				+"입력 :"	
				);	
	}		
	
	public static void displayMenuPanStore() {
		displayStarsLine();
		System.out.println("매장 주문");
	}
	public static void displayMenupanPack() {
		displayStarsLine();
		System.out.println("포장 주문");
	}
	
	public static void displayMenuPanTotalPayment(int totalPayment) {
		if(totalPayment != 0) {
			displayStarsLine();
			System.out.println("총 결제 금액: " + totalPayment + "원");
		}
	}
	
	public static void displaySettings() {
		displayStarsLine();
		System.out.println(
				"* 시스템 설정 \n"
				+ "*1. 가게명 변경 \n"
				+ "*b. 뒤로 \n"
				+ "입력:"
				);
	}
}