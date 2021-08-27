package p15;

public class MRun {
	void run() {
		Button btnTel = new Button();
		Button btnSms = new Button();
		
		btnTel.setOnClickListener(new ListenerTel());
		btnSms.setOnClickListener(new ListenerSms());
		
		btnTel.touch();
		btnSms.touch();
	}
}
