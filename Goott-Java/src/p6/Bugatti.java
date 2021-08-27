package p6;

public class Bugatti implements BugattiEngin{
	public void enginStart() {
		System.out.println(MODEL_NAME + "시동 ON");
	}

	@Override
	public void enginStop() {
		System.out.println(MODEL_NAME + "시동 OFF");
	}
}
