package p2;

import p1.A;

public class D extends A{
	public D() {
		super();	// protected 이지만 상속받아 O
		s = "고양이";	// protected 이지만 상속받아 O
		m();		// protected 이지만 상속받아 O
		
	}
}
