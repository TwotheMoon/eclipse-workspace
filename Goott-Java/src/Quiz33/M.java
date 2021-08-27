package Quiz33;

public class M{
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;	// 자동 형변환
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;	// 직계 가족 O
		C c1 = e;
		
		//B b3 = e;	// 직계 가족 X
		//C c2 = d;
		
		// 각각 상속에 대한 오버라이딩
		a1.sound();
		a2.sound();
		a3.sound();
		a4.sound();
		
		A as[] = {a1, a2, a3, a4};
		for(int i = 0; i < as.length; i++) {
			as[i].sound();
		}
	} 
}
