package p9;
public class MRun {	// 9장. 중첩 클래스(내부 클래스)
	void run() {
		NestedA na = new NestedA("멤버 클래스 고양이");	// 1. 멤버 클래스(인스턴스) - 사용
		na.a();
		
		int x = NestedS.sn;	// 2. 멤버 클래스(정적) - 사용
		NestedS.sa();
		
		class NestedL {	// 3. 로컬 클래스 - 선언부
			NestedL(String s) {
				this.s = s;
			}
			String s;
			void a() { System.out.println("3. 로컬 클래스 - 일반()" + this.s); }
		}		
		NestedL nl = new NestedL("로컬 클래스 고양이");	// 3. 로컬 클래스 - 사용 *주의* 사용 시 선언부 먼저 나와야 함
		nl.a();		
	}
	
	class NestedA {	// 1. 멤버 클래스(인스턴스) - 선언
		NestedA(String s){
			this.s = s;
		}
		String s;
		void a() {	System.out.println("1. 멤버 클래스(인스턴스) - 일반()" + this.s);	}
	}
	
	static class NestedS {	// 2. 멤버 클래스(정적) - 선언
		NestedS(){}
		static String cat = "고양이";
		void a() {	System.out.println("2. 멤버 클래스(정적) - 일반()" + cat);	}
		static int sn = 0;	// 정적 필드 ok
		static void sa() {	System.out.println("2. 멤버 클래스(정적) - static()" + cat); }	// 정적 메소드 ok
	}
}