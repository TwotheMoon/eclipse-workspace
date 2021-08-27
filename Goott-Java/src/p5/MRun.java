package p5;

public class MRun {
	void run() {
		SmartTelevision tv = new SmartTelevision();
//		tv.turnOn();
//		tv.setVolume(7);
//		tv.turnOff();
		
		RemoteControl rc = new RemoteControl() {
			private int volume = 0;
			@Override
			public void turnOn() {
				System.out.println("TV 켬");
			}
			
			@Override
			public void turnOff() {
				System.out.println("TV 끔");				
			}
			
			@Override
			public void setVolume(int volume) {
				if(volume > MAX_VOLUME) {
					volume = MAX_VOLUME;
				} else if (volume < MIN_VOLUME) {
					volume = MIN_VOLUME;
				} else {
					this.volume = volume;
				}
				System.out.println("현재 볼륨: " + this.volume);
			}
		};
		rc.turnOn();
		rc.setVolume(7);
		rc.turnOff();
	
		RemoteControl rcSmartTv = new SmartTelevision();
		rcSmartTv.turnOn();
		rcSmartTv.setVolume(7);
		rcSmartTv.turnOff();
		
		SmartTelevision st = (SmartTelevision)rcSmartTv;
		st.search("강아지");
	}
	
}
