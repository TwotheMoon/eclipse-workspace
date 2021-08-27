package p25;

public class MRun {
	
	void run() {
		long startTime = System.nanoTime();
		System.out.println(startTime);
		
		int sum = 0;
		for(int i = 1; i <= 1000000; i++) {
			sum += i;
		}
		
		long endTime = System.nanoTime();
		System.out.println("1~백만까지의 합: " + sum);
		System.out.println("걸린 시간 :" + (endTime - startTime) + " 나노초");
	}
}


