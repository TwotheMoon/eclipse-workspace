package p38;

public class MRun {
	
	void run() {
		System.out.println("n까지의 합 재귀함수 " + factorial(5));
		System.out.println("n까지의 합 등차수열 " + factorial2(5));
	}
	
	int factorial(int num) {
		if(num == 1) {
			return 1;
		} else {
			return num + factorial(num - 1);
		}
	}
	
	int factorial2(int num) {
		int r = (num * (num + 1)) / 2 ;
		return r;
	}
}


