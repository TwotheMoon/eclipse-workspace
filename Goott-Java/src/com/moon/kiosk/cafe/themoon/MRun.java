package com.moon.kiosk.cafe.themoon;

import java.util.Scanner;
import java.util.StringTokenizer;

import com.moon.kiosk.cafe.themoon.display.*;
import com.moon.kiosk.cafe.themoon.menupan.Menupan;
import com.moon.kiosk.cafe.themoon.settings.Settings;

public class MRun{
	Scanner sc = new Scanner(System.in);
	String cmd = "";
	Menupan menuPan = new Menupan();
	int orderType = 0;
	int orderCount = 0;
	
	void run() {
		init();
		
		//실 코딩 여기서 할 것임
		boolean isNotEnd =  true;
		while(isNotEnd) {
			Display.displayMain();
			cmd = sc.next(); // sc.next() 하는 순간 콘솔 창에서 우리의 입력을 기다리는 상태가 됨.
			switch(cmd) {
			case "1":
				procOrderStore();
				break;
			case "2":
				procOrderPack();
				break;
			case "s":
				procSettings();
				break;
			case "exit":
				System.out.println("프로그램 종료");
				isNotEnd = false;
				break;
			}
		}
	}
	
	private void init() {
		menuPan.init();
	}

	private void procSettings() {
		boolean isNotEnd = true;
		while (isNotEnd) {
			Display.displaySettings();
			cmd = sc.next();
			switch (cmd) {
			case "1":
				System.out.println("원하시는 가게명을 입력해주세요.");
				sc.nextLine();
				String newShopName = sc.nextLine();
				Settings.shopName = newShopName;
				System.out.println("가게명이 변경되었습니다.");
				break;
			case "b":
				isNotEnd = false;
				break;
			default:
				System.out.println("명령어를 다시 입력해주세요.");
				break;
			}
		}
	}
	
	public void procOrder() {
		
		boolean isNotEnd = true;
		while (isNotEnd) {
			if(orderType == 1) {
				Display.displayMenuPanStore();
			} else {
				Display.displayMenupanPack();			
			}
			Display.displayMenuPan(menuPan);
			cmd = sc.next();
			StringTokenizer st = new StringTokenizer(cmd, "-");
			switch (cmd) {
			case "c":
				++orderCount;
				System.out.println("카드 결제가 완료되었습니다. [메뉴 교환권 번호: " + orderCount + "]");
				menuPan.initOrder();
				isNotEnd = false;
				break;
			case "h":
				++orderCount;
				System.out.println("현금 결제가 완료되었습니다. [메뉴 교환권 번호: " + orderCount + "]");
				isNotEnd = false;
			case "b":
				menuPan.initOrder();
				isNotEnd = false;
				break;
			default:
				if(cmd.contains("-") && st.countTokens() == 2) {
					String menuNumberString = st.nextToken();
					int menuNumber = 0;
					
					try {
						menuNumber = Integer.parseInt(menuNumberString);
					} catch (NumberFormatException e) {
						System.out.println("메뉴번호를 숫자로 다시 입력해주세요.");
						continue;
					}
					String menuConString = st.nextToken();
					int menuCount = 0;
					try {
						menuCount = Integer.parseInt(menuConString);
					} catch (NumberFormatException e) {
						System.out.println("메뉴수량을 숫자로 다시 입력해주세요.");
						continue;
					}
					menuPan.write(menuNumber, menuCount);
				}
				break;
			}
		}
	}


	private void procOrderStore() {
		orderType = 1;
		procOrder();
	}
	private void procOrderPack() {
		orderType = 2;
		procOrder();
	}
	
}
