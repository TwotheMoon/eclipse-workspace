package p42;

public class Util {
	
	static public <T> Box<T> boxing(T t){
		Box<T> box = new Box<>();
		box.set(t);
		return box;
		}
}
