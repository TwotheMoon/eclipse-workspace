package p20;

import java.util.Comparator;
import java.util.Objects;

public class MRun {
	void run() {
		Student s1 = new Student(1);
		Student s2 = new Student(1);
		Student s3 = new Student(2);
		
		int r = Objects.compare(s1, s2, new StudentComparator());
		System.out.println(r);
		r = Objects.compare(s1, s3, new StudentComparator());
		System.out.println(r);
		
	}
	
	static class Student {
		int sno;
		Student(int sno){
			this.sno = sno;
		}
	}
	
	static class StudentComparator implements Comparator<Student> {
		
		@Override
		public int compare(Student o1, Student o2) {
	
			return Integer.compare(o1.sno, o2.sno);

//			if(o1.sno < o2.sno)return -1;
//			else if(o1.sno == o2.sno)return 0;
//			else return 1;
			
		}
	}
}
