package Practice;

import java.util.Calendar;
import java.util.jar.Attributes.Name;

public class example_day04 {

	public static void main(String[] args) {
		// 열거타입 변수;
//		Week today;
//		today = Week.SATURDAY;
//		
//		Week reservationDay = Week.SUNDAY;
//		
//		Week birthday = null;
//		
//		if(today.equals(today)) {
//			System.out.println("맞음");
//		}
		Week today = null;
		
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONDAY) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(week);
		
		switch (week) {
		case 1 : today = Week.SUNDAY; break;
		case 2 : today = Week.MONDAY; break;
		case 3 : today = Week.TUESDAY; break;
		case 4 : today = Week.WENDESDAY; break;
		case 5 : today = Week.THURSDAY; break;
		case 6 : today = Week.FRIDAY; break;
		case 7 : today = Week.SATURDAY; break;
		}
		
		System.out.println("오늘 요일 " + today);
		
		if(today == Week.TUESDAY) {
			System.out.println("화요일에는 축구를 합니다.");
		} else if (today == Week.WENDESDAY) {
			System.out.println("수요일에는 야구를 합니다.");
		} else {
			System.out.println("다른 요일에는 공부를 합니다.");
		}
		
		//System.out.println(today.name());	//	객체의 이름 출력
		//System.out.println(today.ordinal());	// 몇번쨰 인지 출력
		Week day1 = Week.MONDAY;
		Week day2 = Week.WENDESDAY;
		
		System.out.println(day1.compareTo(day2));	// 두 객체의 차이
		System.out.println(day2.compareTo(day1));
		System.out.println(Week.valueOf("SATURDAY"));	// 객체에 속성 대입
		
		Week days[] = Week.values();	// 객체 배열로 만들고 리턴까지 해줌
		for(Week day3 : days) {
			System.out.println(day3);
		}
	}

}
