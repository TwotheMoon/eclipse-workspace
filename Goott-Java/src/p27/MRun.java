package p27;

public class MRun {
	
	void run() {
		String s = "자바 프로그래밍";
		int index = s.indexOf("프로그래밍");
		System.out.println(index + " 인덱스 부터 출력:");

		int index2 = s.indexOf("자바");
		System.out.println(index2 + " 인덱스 부터 출력:");
	
		int index3 = s.indexOf("jsp");
		System.out.println(index3 + " 인덱스 부터 출력:");
		
		String result = (index2 != -1)? "자바 책 아님" : (index3 + " 인덱스 부터 출력");
		
		System.out.println(result);
	
	}
}


