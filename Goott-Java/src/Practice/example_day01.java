package Practice;

public class example_day01 {

	public static void main(String[] args) {
//		dataOfSize();
		dataAndStringTypeSum();
	}
//	public static void dataOfSize() {
//		System.out.println("Byte �ּҰ� : " + Byte.MIN_VALUE);
//		System.out.println("Byte �ִ밪 : " + Byte.MAX_VALUE);
//		System.out.println("Short �ּҰ� : " + Short.MIN_VALUE);
//		System.out.println("Short �ִ밪 : " + Short.MAX_VALUE);
//		System.out.println("Integer �ּҰ� : " + Integer.MIN_VALUE);
//		System.out.println("Integer �ִ밪 : " + Integer.MAX_VALUE);
//		System.out.println("Long �ּҰ� : " + Long.MIN_VALUE);
//		System.out.println("Long �ִ밪 : " + Long.MAX_VALUE);
//		System.out.println("Float �ּҰ� : " + Float.MIN_VALUE);
//		System.out.println("Float �ִ밪 : " + Float.MAX_VALUE);
//		System.out.println("Double �ּҰ� : " + Double.MIN_VALUE);
//		System.out.println("Double �ִ밪 : " + Double.MAX_VALUE);
//	}
	
	public static void dataAndStringTypeSum() {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		byte byteValue3 = (byte)(byteValue1 + byteValue2);
							// ���� ����ȯ ���� ���ϸ� int �� ����ȯ
							// byteŸ�Կ� int�� �� �� ������ ����
		int intValue1 = byteValue1 + byteValue2;
				// �ڹٴ� ����ó���ҋ� ��Ʈ Ÿ���� �⺻���� �Ѵ�.
		System.out.println(intValue1);
		System.out.println(byteValue3);
		
		char charValue1 = 'A'; // 65
		char charValue2 = 1;
		char charValue3 = (char)(charValue1 + charValue2);
						// ���� ����ȯ ���� ���ϸ� String ���� ����ȯ
						// charŸ�Կ� String�� �� �� ������ ����
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4;
		System.out.println(intValue4);
		// int �� ��½� �Ҽ��� ����
		
		int intValue5 = 10;
		//int intValue6 = 10 / 4.0;
		int intValue6 = (int)(10 / 4.0);
		// ���ó� �⺻�� ��Ʈ���̱⿡ double�� ����
		
	}
	
}