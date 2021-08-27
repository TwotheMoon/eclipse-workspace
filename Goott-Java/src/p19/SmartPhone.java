package p19;

public class SmartPhone {
	String com;
	String os;
	public SmartPhone(String com, String os) {
		this.com = com;
		this.os = os;
	}
	
	@Override
	public String toString() {
		return com + "," + os;
	}
}
