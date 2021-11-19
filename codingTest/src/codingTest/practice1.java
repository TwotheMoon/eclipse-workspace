package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice1 {

	public static void main(String[] args) throws IOException  {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			int n = Integer.parseInt(br.readLine());
			br.close();
			
			int result = n * (n + 1) / 2;
			
			System.out.println(result);
	
			for(int i = 1; i <= 9; i++) {
				System.out.println( i + "단");
				for(int j = 1; j <= 9; j++) {
					System.out.println(i + " X " + j + " = " + (i * j));
				}
			}
	}
}
