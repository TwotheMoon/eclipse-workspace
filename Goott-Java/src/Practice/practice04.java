package Practice;

public class practice04 {

	public static void main(String[] args) {
		
		String animals[] = {"��", "�����", "�ʱ���"};
		
		for(int i = 0; i < animals.length; i++) {
			if(animals[i].equals("�ʱ���")) {
				System.out.println(animals[i].length() + "��° �迭���� �ʱ��� �߰�");
			}
		}
	}			
}
