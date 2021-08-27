package p3;

public class MRun {

	public void run() {

		//case. 이러면 그냥 죽음
//		runSub();
		
		//case. 이래야 삼
		try {
			runSub();
		} catch(Exception e) {
			System.out.println("익셉 났음");
		}
		
	}
	
//	private void runSub(){
	private void runSub() throws Exception{
		B b = new B();
		b = null;
		b.hashCode();
			//case. NullPointerException:
			
//			B b = new B();
//			b = null;
//			b.hashCode();
			
			//case. ArrayIndexOutOfBoundsException:
			
//			String ss[] = {"고양이","개"};
//			System.out.println(ss[3]);
			
			//case. IndexOutOfBoundsException:
			
//			ArrayList<String> al = new ArrayList<String>();
//			al.add("고양이");
//			al.add("너굴맨");
//			System.out.println(al.get(3));
			
			//case. NumberFormatException:
			
//			int nCat = Integer.parseInt("고양이");
			
			////	멀티 캐치
//		} catch(NullPointerException|ArrayIndexOutOfBoundsException e) {	// 다중 캐치
//			System.out.println("NullPointerException 나 ArrayIndexOutOfBoundsException 났음");
//		} catch(IndexOutOfBoundsException|NumberFormatException e) {	// 다중 캐치
//			System.out.println("IndexOutOfBoundsException 나 NumberFormatException 났음");
//		} catch(Exception e) {	// 다중 캐치
//			System.out.println("Exception 났음");
//		}		
	}

}
