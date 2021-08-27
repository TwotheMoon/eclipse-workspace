package p14;

public class MRun {
	int n = 100;
	void run() {
		N n= new N();
		n.runNest();
	}
	void test() {
		System.out.println("외부");
	}
	
	class N {
		int n = 200;
		void test() {
			System.out.println("내부");
		}
		void runNest() {
			System.out.println(MRun.this.n);
			System.out.println(this.n);
			MRun.this.test();
			this.test();
			test();
		}
	}
}
