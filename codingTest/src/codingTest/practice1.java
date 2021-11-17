package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class practice1 {

	public static void main(String[] args) throws IOException  {

	
	for(int i = 1; i <= 9; i++) {
		System.out.println( i + "단");
		for(int j = 1; j <= 9; j++) {
			System.out.println(i + "X" + j + "=" + i * j);
			}
		}
	
	}
}
