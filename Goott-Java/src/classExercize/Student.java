package classExercize;

public class Student {
	// �ʵ�	DTO
	String name = "";
	int age = 100; 
	long no = 0L;

	
	// �⺻ ������	
	Student(){
		this.name = "ȫ�浿";
		this.age = 1000;
		this.no = 1;
		// == this("ȫ�浿" , 1000, 1);
	}
	
	// �� ������
	Student(int age){
		this.age = age;
	}
	
	// �� ������ (�Ű����� ���� Ÿ��)
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Student(String name, long no){
//		this.name = name;
//		this.no = no;
		
		this(name, 999, no);	// name, no ���� �ް� age�� 999 ����
	}
	
	Student(String name, int age, long no){
		this.name = name;
		this.age = age;
		this.no = no;
	}
	
	
	
	// �޼ҵ� (�Լ�) DAO
	void introduce() {
		System.out.println("[�л���ȣ: " + no + "] �̸��� " + name + " ���̴� " + age );
	}
	
	void test (int x) {
		age = x;
	}
}
