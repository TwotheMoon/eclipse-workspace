package p10;

public class Nested {
	
	
	public static class NestedS {	
		private String s;
	
		// 2. 멤버 클래스(정적) - 선언
		NestedS(){}
		NestedS(String s){
			this.s = s;
		}
		void a() {	System.out.println("2. 멤버 클래스(정적) - 일반(): " + s);	}
	}
}
