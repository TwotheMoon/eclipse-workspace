package p33;

public class MRun {
	
	void run() {
		String t = "홍길동&이수홈,박연수,김자바-최영호";
		String names[] = t.split("&|,|-");
		
		for(String s : names) {
			System.out.println(s);
		}
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}
}


