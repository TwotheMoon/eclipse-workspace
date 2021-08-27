package p29;

public class MRun {
	private static final String lAST_PATTERN = "(.{6}$)";
	
	void run() {
		String ssn = "940215-1067111";
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
		
		String securityNum = ssn.substring(8);
		String replaceNum = secondNum.replace(securityNum, "******");
		System.out.println(firstNum + "-" + replaceNum);
		
		System.out.println(ssn.replaceAll(lAST_PATTERN, "******" ));
		}
		
}




