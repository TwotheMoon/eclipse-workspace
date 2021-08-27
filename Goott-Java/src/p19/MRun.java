package p19;

public class MRun {
	void run(){
		SmartPhone sp = new SmartPhone("구글", "안드로이드");
		
		System.out.println(sp.toString());
		System.out.println(sp);	// 자동으로 toString();
	}
}
