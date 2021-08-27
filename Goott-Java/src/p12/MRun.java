package p12;

public class MRun {
	int n;
	void m1() {
		System.out.println("일반 메소드");
	}
	static int n2;
	static void m2() {
		System.out.println("정적 메소드");
	}
	
	void run() {
		B b = new B();
		b.m();
		
		C c = new C();
		c.m();
	}
	
	class B{
		void m() {
			n = 1;
			m1();
			
			n2 = 2;
			m2();
		}
	}
	
	static class C{
		void m() {
			//n = 1;
			//m1();
			
			n2 = 2;
			m2();
		}
	}
}
