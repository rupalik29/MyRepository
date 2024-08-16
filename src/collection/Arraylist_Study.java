package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist_Study {

	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<Object>();
		al.add("Roopali");
		al.add("Ritesh");
		al.add("Komal");
		al.add(true);
		al.add('C');
		al.add(20);
		al.add(11.12f);
		al.add(null);
		al.add(null);
		al.add("Ritesh");
		System.out.println(al);
		System.out.println(al.contains(20));
		System.out.println(al.clone());
		System.out.println(al.contains(21));
		System.out.println(al.equals(al));
		System.out.println(al.containsAll(al));
		System.out.println(al.get(6));
		System.out.println(al.getFirst());
		System.out.println(al.getLast());
		System.out.println(al.indexOf("Ritesh"));
		System.out.println(al.lastIndexOf("Ritesh"));
		System.out.println(al.remove(1));
		System.out.println(al);
		System.out.println(al.removeFirst());
		System.out.println(al);
		System.out.println(al.size());
		al.addFirst("Roopali");
		System.out.println(al);
		System.out.println("==========traversing through arraylist=================");
		System.out.println("============for loop===========");
		for(int a=0;a<=al.size()-1;a++) {
			System.out.println(al.get(a));
		}
		System.out.println("============decending for loop===========");
		for(int b=al.size()-1;b>=0;b--) {
			System.out.println(al.get(b));
		}
		System.out.println("============for each/advance/dynamic loop===========");
		for(Object c:al) {
			System.out.println(c);
		}
		System.out.println("============iterator===========");
		Iterator<Object> d = al.iterator();
		while(d.hasNext()) {
			System.out.println(d.next());
		}
		System.out.println("============list iterator===========");
		ListIterator<Object> e=al.listIterator();
		while(e.hasNext()) {
			System.out.println(e.next());
		}
		System.out.println("============ decending list iterator===========");
		while(e.hasPrevious()) {
			System.out.println(e.previous());
		}
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
