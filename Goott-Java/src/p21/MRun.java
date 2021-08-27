package p21;

import java.util.Objects;

public class MRun {
	
	void run() {
		S s1 = new S(1, "강아지");
		S s2 = new S(1, "강아지");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
	}
	
	static class S {
		int n;
		String name;
		public S(int n, String name) {
			super();
			this.n = n;
			this.name = name;
		}
		
		public int hashCode() {
			return Objects.hash(n, name);
		}
	}
}


