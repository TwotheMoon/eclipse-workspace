package p7;

import java.util.ArrayList;

public class MRun {

	public void run() {
		ArrayList<Rc> rc = new ArrayList<>();
		rc.add(new Tv());
		rc.add(new Light());
		rc.add(new AirCon());
		rc.add(new Boiler());
		
		for(int i = 0; i < rc.size(); i++) {
			rc.get(i).turnOn();
		}
	
	}

}
