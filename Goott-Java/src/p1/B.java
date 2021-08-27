package p1;

public class B{
	public void m() {
		A a = new A();	// protected o
		a.s = "강아지";	// protected o
		a.m();			// protected o
	}
}
