package p22;

import java.util.Objects;

public class MRun {
	
	void run() {
		String s1 = "강아지";
		String s2 = null;
		
		System.out.println(Objects.requireNonNull(s1));
		
		try {
			String name = Objects.requireNonNull(s2);
		} catch (Exception e) {
			System.out.println("여기");
			System.out.println(e.getMessage());
		}
		
		try {
			String name = Objects.requireNonNull(s2, "널값");
		} catch (Exception e) {
			System.out.println("여기2");
			System.out.println(e.getMessage());
		}
	}
}


