package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset_Study {

	public static void main(String[] args) {
		
		HashSet<Object> h = new HashSet<Object>();
		h.add("Rohit");
		h.add(45);
		h.add('M');
		h.add(null);
		h.add(null);
		h.add(45.45f);
		h.add(true);
		h.add("Rohit");
		System.out.println(h);
		
		System.out.println(h.contains(45));
		System.out.println(h.isEmpty());
		System.out.println(h.remove('M'));
		System.out.println(h);
		System.out.println(h.size());
		System.out.println(h.addAll(h));//same datatype
		System.out.println(h.clone());
		h.add("sharma");
		System.out.println(h);
		
		
		System.out.println("==========for each/dynamic/advance for loop================");
		for(Object a:h) {
			System.out.println(a);
		}
		System.out.println("=============Iterator===========================");
		
	Iterator<Object> z=h.iterator();
	while(z.hasNext()) {
		System.out.println(z.next());
	}
	} 
	

}
