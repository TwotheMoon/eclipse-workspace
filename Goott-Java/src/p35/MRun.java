package p35;

public class MRun {
	
	void run() {
		StringBuffer sb = new StringBuffer();
		sb.append("고양이");
		sb.append("는");
		sb.append("야옹");
		System.out.println(sb.toString());
		sb.insert(4, " ");
		System.out.println(sb.toString());
		sb.setCharAt(0, '개');
		sb.setCharAt(1, '냥');
		sb.setCharAt(3, '도');
		System.out.println(sb.toString());
		sb.replace(5, 7, "어흥");
		System.out.println(sb.toString());
		sb.delete(0, 1);
		System.out.println(sb.toString());
		System.out.println("몇자?: " + sb.length());
		String s = sb.toString();
		System.out.println(s);
	}
}


