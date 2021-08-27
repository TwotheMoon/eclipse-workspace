package p17;

public class Anonymous {
	Person f = new Person() {
		void work() {
			System.out.println("출근");
		}
		void wake() {
			System.out.println("6시 기상");
			work();
		}
	};
	
	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책");
			}
			void wake() {
				System.out.println("7시 기상");
				walk();
			}
		};
	
		localVar.wake();
	}
	
	void m2(Person p) {
		p.wake();
	}
}
