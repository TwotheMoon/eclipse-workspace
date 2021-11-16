package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class practice1 {

	public static void main(String[] args) throws IOException  {

	
	for(int i = 2; i <= 9; i++) {
		System.out.println(i + "단");
		for(int j = 1; j <= 9; j++) {
			System.out.println(i + "X" + j + "=" + i * j);
		}
	}
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	
	int n = Integer.parseInt(st.nextToken());
	int result = 0;
	
	for(int i = 0; i <= n; i++) {
		result += i;
	}
	
	System.out.println(result);
	
	int result2 = n * (n + 1) / 2;
	System.out.println(result2);
	}
}
