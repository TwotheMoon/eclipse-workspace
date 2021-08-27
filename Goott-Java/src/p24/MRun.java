package p24;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class MRun {
	
	void run() {
		
		Integer o1 = 1;
		Integer o2 = 1;
		
		System.out.println(Objects.equals(o1, o2));
		System.out.println(Objects.equals(o1, null));
		System.out.println(Objects.equals(null, o2));
		System.out.println(Objects.equals(null, null));
		
		System.out.println();
		
		Integer[] arr1 = {1, 2};
		Integer[] arr2 = {1, 2};
		System.out.println(Objects.equals(arr1, arr2));
		System.out.println(Objects.deepEquals(arr1, arr2));
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(Objects.equals(null, arr2));
		System.out.println(Objects.equals(arr1, null));
		System.out.println(Objects.equals(null, null));
		
		System.out.println();
		
		String s1 = "강아지";
		String s2 = "강아지";
		System.out.println(Objects.equals(s1, s2));
		System.out.println(s1.equals(s2));
	}
}


