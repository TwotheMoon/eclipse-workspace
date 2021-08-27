package p7;

public class Boiler implements Rc{
	@Override
	public void turnOn() {
		System.out.println("보일러 " + ON);
	}
}
