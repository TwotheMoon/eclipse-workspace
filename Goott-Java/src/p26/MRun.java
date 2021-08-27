package p26;

public class MRun {
	
	void run() {
		Cat cat = new Cat();
		Class c = cat.getClass();
		System.out.println(c.getName());
		System.out.println(c.getSimpleName());
		System.out.println(c.getPackage().getName());
		
		System.out.println();
		
		try {
			Class c2 = Class.forName("p26.Cat");
			System.out.println(c2.getName());
			System.out.println(c2.getSimpleName());
			System.out.println(c2.getPackage().getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}


