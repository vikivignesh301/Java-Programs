package javapractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collection {
	
	public static void main(String[] args) {
			
		int[] a = new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=20;
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(30);
		l.add(40);
		l.add(40);
		
		Set<Integer> s = new HashSet<Integer>();
		s.add(50);
		s.add(60);
		s.add(60);
		
		Map<String,Integer> m = new HashMap<String,Integer>();
		m.put("iphone", 10);
		m.put("oneplus", 20);
		m.put("nokia", 10);
		
		System.out.println(a[2]);
		System.out.println(l);
		System.out.println(s);
		System.out.println(m);
		
		
	}

}
