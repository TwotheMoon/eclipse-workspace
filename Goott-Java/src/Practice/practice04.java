package Practice;

public class practice04 {

	public static void main(String[] args) {
		
		String animals[] = {"개", "고양이", "너굴맨"};
		
		for(int i = 0; i < animals.length; i++) {
			if(animals[i].equals("너굴맨")) {
				System.out.println(animals[i].length() + "번째 배열에서 너굴맨 발견");
			}
		}
	}			
}
