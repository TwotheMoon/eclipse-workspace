package Practice;

import java.util.Calendar;
import java.util.jar.Attributes.Name;

public class example_day04 {

	public static void main(String[] args) {
		// ����Ÿ�� ����;
//		Week today;
//		today = Week.SATURDAY;
//		
//		Week reservationDay = Week.SUNDAY;
//		
//		Week birthday = null;
//		
//		if(today.equals(today)) {
//			System.out.println("����");
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
		
		System.out.println("���� ���� " + today);
		
		if(today == Week.TUESDAY) {
			System.out.println("ȭ���Ͽ��� �౸�� �մϴ�.");
		} else if (today == Week.WENDESDAY) {
			System.out.println("�����Ͽ��� �߱��� �մϴ�.");
		} else {
			System.out.println("�ٸ� ���Ͽ��� ���θ� �մϴ�.");
		}
		
		//System.out.println(today.name());	//	��ü�� �̸� ���
		//System.out.println(today.ordinal());	// ����� ���� ���
		Week day1 = Week.MONDAY;
		Week day2 = Week.WENDESDAY;
		
		System.out.println(day1.compareTo(day2));	// �� ��ü�� ����
		System.out.println(day2.compareTo(day1));
		System.out.println(Week.valueOf("SATURDAY"));	// ��ü�� �Ӽ� ����
		
		Week days[] = Week.values();	// ��ü �迭�� ����� ���ϱ��� ����
		for(Week day3 : days) {
			System.out.println(day3);
		}
	}

}
