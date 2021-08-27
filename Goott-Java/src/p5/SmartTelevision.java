package p5;

public class SmartTelevision implements RemoteControl, Searchable{
	private int volume;
	
	public void turnOn() {
		System.out.println("TV 켬");
	}
	
	public void turnOff() {
		System.out.println("TV 끔");
	}
	
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
	
	public void search(String searchWord) {
		System.out.println("구글에서 " + searchWord + " 검색");
	}


}
