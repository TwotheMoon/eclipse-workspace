package p13;

public class MRun {
	int n = 0;
	void cat() {
		System.out.println("");
	}
	
	void runBeforeJava7(final int finalProblemArg) {
		final int finalProblem = 0;
		
		class L{
			void m() {
				System.out.println("외부 클래스 필드값 참조 : " + n);
				cat();
				
				System.out.println("java7: 로컬 클래스 내 () 에서 로컬 클래스 필드 변수 출력 :"+finalProblem);
				System.out.println("java7: 로컬 클래스 내 () 에서 로컬 클래스를 감싼 ()가 받은 매개 변수 값 출력 :"+finalProblemArg);	
			}
		}
	}
	
	void runAfterJava8(int finalProblemArg) {
		int finalProblem = 0;
		//finalProblem = 100; 밑에서 에러
		//finalProblemArg = 200; 밑에서 에러
	
		class L{
			void m() {
				System.out.println("외부클래스 필드값 참조 : " + n);
				cat();
				
				System.out.println("java7: 로컬 클래스 내 () 에서 로컬 클래스 필드 변수 출력 :"+finalProblem);
				System.out.println("java7: 로컬 클래스 내 () 에서 로컬 클래스를 감싼 ()가 받은 매개 변수 값 출력 :"+finalProblemArg);	
			}
		}
		L l = new L();
		l.m();
	}
}
