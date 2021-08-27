package p41;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class MRun {
	
	void run() {
		List<String> list = new ArrayList<String>();
		List<String> list2 = new Vector<String>();
		List<String> list3 = new LinkedList<String>();
	
		list.add("개");
		list.add(1, "고양이");
		System.out.println(list.size());
		
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		list.remove(0);
		for(String s : list) {
			System.out.println(s);
		}
		list.remove("고양이");
		System.out.println(list.size());
		
		System.out.println("==== 셋 ====");
		
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new LinkedHashSet<String>();
		Set<String> set3 = new TreeSet<String>();
		
		set1.add("개");
		set1.add("고양이");
		set1.add("고양이");
		set1.add("닭");
		set1.add("너굴맨");

		for(String s : set1) {
			System.out.println(s);
		}
		
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		Map<Integer, String> map2 = new Hashtable<Integer, String>();
		Map<Integer, String> map3 = new TreeMap<Integer, String>();

		
	}
}


