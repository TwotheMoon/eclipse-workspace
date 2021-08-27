package p34;

import java.util.StringTokenizer;

public class MRun {
	
	void run() {
		String t = "홍길동/이수홍/박연수";
		StringTokenizer st = new StringTokenizer(t, "/");
		int countTokens = st.countTokens();
		for(int i = 0; i < countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println();
		st = new StringTokenizer(t, "/");
		while (st.hasMoreElements()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}


