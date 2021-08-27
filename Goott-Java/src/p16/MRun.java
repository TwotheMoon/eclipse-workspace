package p16;

public class MRun {
	void run() {
		Button btnTel = new Button();
		Button btnSms = new Button();
		btnTel.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("에게 전화를 걸고 있습니다.");
			}
		});
		btnSms.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("에게 문자를 보냈습니다.");
			}
		});
		btnTel.touch();
		btnSms.touch();
	}
}
