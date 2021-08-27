package p1;

import java.util.Scanner;

public class Count {
	
	public static void main(String[] args) {
		
		System.out.println("정숫값 입력: ");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
	
		if(count <= 0) {
			System.out.println("양의 정숫값 입력");
		} else {
			for(int i = 0; i < count; i++) {
				System.out.println(count - i);
			}
			System.out.println("발사");
		}
	}
	
}
