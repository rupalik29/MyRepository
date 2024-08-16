package collection;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_study {
	public static void main(String[] args) {
		Vector<Object> v =new Vector<Object>();
		v.add("Mumbai");
		v.add("R");
		v.add(20);
		v.add(null);
		v.add(22.22);
		v.add(null);
		v.add(true);
		System.out.println(v);
		v.add(0, "banglore");
		System.out.println(v);
		v.addFirst("MH");
		System.out.println(v);
		v.addLast(100);
		System.out.println(v);
		//v.clear();
		
		System.out.println("=======traversing through vector======");
		
		System.out.println("======for loop=====");
		for(int i=0;i<=v.size()-1;i++) {
			System.out.println(v.elementAt(i));
		}
		System.out.println("==========for each loop======");
		for( Object a:v) {
			System.out.println(a);
			}
		System.out.println("=======iterator=======");
		Iterator<Object> b=v.iterator();
		while(b.hasNext()) {
			System.out.println(b.next());
		}
		System.out.println("=======list iterator======");
		ListIterator<Object> c= v.listIterator();
		while(c.hasNext()) {
			System.out.println(c.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
		
}
