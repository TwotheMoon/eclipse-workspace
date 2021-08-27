package p11;

public class MRun {
	void run() {
		MRun.m2();
	}
	
	B f1 = new B();
	C f2 = new C();
	void m1() {
		B v1 = new B();
		C v2 = new C();
	}
	static void m2() {
		//B v1 = new B();
		C v2 = new C();
		
		N n = new N();
		n.run();
	}
	
	class B{}
	static class C{}
}
