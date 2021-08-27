package p23;

import java.util.Objects;

public class MRun {
	
	void run() {
		String s1 = "고양이";
		String s2 = null;
		System.out.println(Objects.toString(s1));
		System.out.println(Objects.toString(s2));
		System.out.println(Objects.toString(s2, "무명"));
	}
}


