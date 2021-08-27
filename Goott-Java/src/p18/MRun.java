package p18;

public class MRun {
	void run() {
		
		Member o1 = new Member("blue");
		Member o2 = new Member("blue");
		Member o3 = new Member("red");
		
		if(o1.equals(o2)) {
			System.out.println("같음");
		} else {
			System.out.println("같지 않음");
		}
		if(o1.equals(o3)) {
			System.err.println("같음");
		} else {
			System.out.println("같지 않음");
		}
	}
}
