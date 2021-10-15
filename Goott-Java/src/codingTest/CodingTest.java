package codingTest;

public class CodingTest {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i = 0; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);

		sumNum();
		System.out.println();
		
		gogodan();
	}
	// 등차수열
	public static void sumNum() {
		int n = 10;
		
		int result = n * (n + 1) / 2;
		System.out.println(result);
	}
	
	// for문을 이용해 구구단
	public static void gogodan() {
		for(int i = 1; i <= 9; i++) {
			System.out.println(i + "단");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + " = " + i * j);
			}
		}
		
	}
}
