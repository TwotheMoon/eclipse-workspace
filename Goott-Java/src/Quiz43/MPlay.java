package Quiz43;
import java.util.Scanner;
public class MPlay {
	Scanner sc = new Scanner(System.in);
	String cmd = "";
	Food biNeng;	// 비냉
	Food mulNeng;	// 물냉
	int biNengCount = 0;
	int mulNengCount = 0;
	int orderNo = 0;
	
	public void run() {
		initData();
		displayEnter();
		boolean isNotEnd = true;
		while(isNotEnd) {
			dispGuide();
			cmd = sc.next(); // sc.next() 하는 순간 콘솔 창에서 우리의 입력을 기다리는 상태가 됨.
			switch (cmd) {
			case "1":
				procNewOrder();
				break;
			case "2":
				procOrderCheck();
				break;
			case "e":
				isNotEnd = false;
				break;
			default:
				System.out.println("없는 명령입니다.");
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
	void procNewOrder() {
		showMenues();
		
		boolean isNotEnd = true;
		while(isNotEnd) {
			dispGuide1();
			cmd = sc.next(); // sc.next() 하는 순간 콘솔 창에서 우리의 입력을 기다리는 상태가 됨.
			switch (cmd) {
			case "1":
				procNewOrderMulNeng();
				break;
			case "2":
				procNewOrderBiNeng();
				break;
			case "b":
				isNotEnd = false;
				break;
			default:
				System.out.println("없는 명령입니다.");
				break;
			}
		}
	}
	void procOrderCheck() {
		showOrder();
		boolean isNotEnd = true;
		while(isNotEnd) {
			dispGuide2();
			cmd = sc.next(); // sc.next() 하는 순간 콘솔 창에서 우리의 입력을 기다리는 상태가 됨.
			switch (cmd) {
			case "1":
				procPayment();
				break;
			case "2":
				procOrderReset();
				break;
			case "b":
				isNotEnd = false;
				break;
			default:
				System.out.println("없는 명령입니다.");
				break;
			}
		}
	}
	void procNewOrderMulNeng() {
		mulNengCount++;
		System.out.println("물냉 수량 :"+mulNengCount);
	}
	void procNewOrderBiNeng() {
		biNengCount++;
		System.out.println("비냉 수량 :"+biNengCount);
	}
	void procPayment() {
		orderNo++;
		showReceipt();
		clearData();
		
	}
	void procOrderReset() {
		System.out.println("주문 작성이 리셋되었습니다. 다시 주문 해 주세요.");
		clearData();		
	}
	void dispGuide() {
		System.out.print(
				"*******************\n"
				+"1. 주문하기 \n"
				+"2. 주문확인 \n"
				+"e. KIOSK 프로그램 종료 \n"
				+"*******************\n"
				+"명령: "
				);
	}
	void dispGuide1() {
		System.out.print(
				"***** 주문하기 *****\n"
						+"1. 물냉 추가 \n"
						+"2. 비냉 추가 \n"
						+"b. 뒤로가기 \n"
						+"*******************\n"
						+"명령: "
				);
	}	
	void dispGuide2() {
		System.out.print(
				"***** 메뉴 2 *****\n"
						+"1. 결제 \n"
						+"2. 주문내역 리셋 \n"
						+"b. 뒤로가기 \n"
						+"*******************\n"
						+"명령: "
				);
	}
	void displayEnter() {
		System.out.println(
				"*************************"
				+"* 성모 냉면 KIOSK * "
				+"*************************"				
				);
	}
	void initData() {
		biNeng = new Food("비빔 냉면",7000);
		mulNeng = new Food("물 냉면",6500);
	}
	void showMenues() {
		System.out.println(
				"----------------- 메뉴판 --------------- \n"
				+ String.format("%20s%20s", biNeng.name, biNeng.getPriceWon()) + "\n"
				+ String.format("%20s%20s", mulNeng.name, mulNeng.getPriceWon()) + "\n"
				+"----------------- 메뉴판 --------------- \n"
				);
	}
	void showOrder() {
		System.out.println(
				"----------------- 주문확인 --------------- \n"
				+ String.format("%20s수량:%10d가격:%20s", mulNeng.name, mulNengCount, mulNeng.price * mulNengCount +"원") + "\n"
				+ String.format("%20s수량:%10d가격:%20s", biNeng.name, biNengCount, biNeng.price * biNengCount +"원") + "\n"
				+ String.format("결제 할 금액 : %20s", (mulNeng.price * mulNengCount + biNeng.price * biNengCount) + "원\n")
				+"----------------- 주문확인 --------------- \n"
				);
	}
	void clearData() {
		biNengCount = 0;
		mulNengCount = 0;
	}
	
	void showReceipt() {
		System.out.println("결제 되었습니다.");
		System.out.println(
				"----------------- 메뉴 교환권 --------------- \n"
				+ String.format("주문번호: %20d", orderNo) + "\n"
				+ String.format("%20s수량:%10d가격:%20s", mulNeng.name, mulNengCount, mulNeng.price * mulNengCount +"원") + "\n"
				+ String.format("%20s수량:%10d가격:%20s", mulNeng.name, mulNengCount, mulNeng.price * mulNengCount +"원") + "\n"
				+ String.format("결제 금액: %20s", (mulNeng.price * mulNengCount + biNeng.price * biNengCount) + "원\n")
				+"----------------- 메뉴 교환권 --------------- \n"
				);
	}
}
