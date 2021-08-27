package p30;

public class MRun {
	
	void run() {
		String o = "Java Programming";
		String l = o.toLowerCase();
		String u = o.toUpperCase();
		System.out.println(l);
		System.out.println(u);
		
		String s1 = "Java Programming";
		String s2 = "JAVA Programming";
		
		String l1 = s1.toLowerCase();
		String l2 = s2.toLowerCase();
		System.out.println(l1.equals(l2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
	}
}


