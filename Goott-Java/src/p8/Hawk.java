package p8;

public class Hawk extends Living implements LandMovable, Flying{
	String hawk = "독수리";
	@Override
	public void landMove() {
	}
	@Override
	public void fly() {
		System.out.println(hawk + " 날아서 이동합니다.");
	}
}
