package classExercize;

public class Student {
	// 필드	DTO
	String name = "";
	int age = 100; 
	long no = 0L;

	
	// 기본 생성자	
	Student(){
		this.name = "홍길동";
		this.age = 1000;
		this.no = 1;
		// == this("홍길동" , 1000, 1);
	}
	
	// 빈 생성자
	Student(int age){
		this.age = age;
	}
	
	// 빈 생성자 (매개변수 여러 타입)
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Student(String name, long no){
//		this.name = name;
//		this.no = no;
		
		this(name, 999, no);	// name, no 값만 받고 age는 999 고정
	}
	
	Student(String name, int age, long no){
		this.name = name;
		this.age = age;
		this.no = no;
	}
	
	
	
	// 메소드 (함수) DAO
	void introduce() {
		System.out.println("[학생번호: " + no + "] 이름은 " + name + " 나이는 " + age );
	}
	
	void test (int x) {
		age = x;
	}
}
