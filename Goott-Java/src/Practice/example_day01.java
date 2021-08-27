package Practice;

public class example_day01 {

	public static void main(String[] args) {
//		dataOfSize();
		dataAndStringTypeSum();
	}
//	public static void dataOfSize() {
//		System.out.println("Byte 최소값 : " + Byte.MIN_VALUE);
//		System.out.println("Byte 최대값 : " + Byte.MAX_VALUE);
//		System.out.println("Short 최소값 : " + Short.MIN_VALUE);
//		System.out.println("Short 최대값 : " + Short.MAX_VALUE);
//		System.out.println("Integer 최소값 : " + Integer.MIN_VALUE);
//		System.out.println("Integer 최대값 : " + Integer.MAX_VALUE);
//		System.out.println("Long 최소값 : " + Long.MIN_VALUE);
//		System.out.println("Long 최대값 : " + Long.MAX_VALUE);
//		System.out.println("Float 최소값 : " + Float.MIN_VALUE);
//		System.out.println("Float 최대값 : " + Float.MAX_VALUE);
//		System.out.println("Double 최소값 : " + Double.MIN_VALUE);
//		System.out.println("Double 최대값 : " + Double.MAX_VALUE);
//	}
	
	public static void dataAndStringTypeSum() {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		byte byteValue3 = (byte)(byteValue1 + byteValue2);
							// 강제 형변환 없이 더하면 int 로 형변환
							// byte타입에 int가 들어갈 수 없으니 오류
		int intValue1 = byteValue1 + byteValue2;
				// 자바는 연산처리할떄 인트 타입을 기본으로 한다.
		System.out.println(intValue1);
		System.out.println(byteValue3);
		
		char charValue1 = 'A'; // 65
		char charValue2 = 1;
		char charValue3 = (char)(charValue1 + charValue2);
						// 강제 형변환 없이 더하면 String 으로 형변환
						// char타입에 String이 들어갈 수 없으니 오류
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4;
		System.out.println(intValue4);
		// int 형 출력시 소수점 제거
		
		int intValue5 = 10;
		//int intValue6 = 10 / 4.0;
		int intValue6 = (int)(10 / 4.0);
		// 역시나 기본이 인트형이기에 double형 오류
		
	}
	
}