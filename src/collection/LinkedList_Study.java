package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_Study {

	public static void main(String[] args) {
		
		LinkedList<Object> ll= new LinkedList<Object>();
		ll.add("Rohit");
		ll.add(45);
		ll.add('M');
		ll.add("Rohit");
		ll.add(null);
		ll.add(true);
		ll.add(45.45f);
		System.out.println(ll);
		System.out.println(ll.get(1));
		System.out.println(ll.element());
		System.out.println(ll);
		System.out.println("==================");
		System.out.println(ll.peek());//same as element
		System.out.println(ll);
		System.out.println(ll.pop());//remove 1st element
		System.out.println(ll);
		System.out.println(ll.poll());//same as pop
		System.out.println(ll);
		ll.push("Mumbai");//add object at start
		System.out.println(ll);
		
		System.out.println("=======for===========");
		
		for(int i=0;i<=ll.size()-1;i++) {
			System.out.println(ll.get(i));
		}
		System.out.println("=========for each=========");
	
		for(Object b:ll) {
			System.out.println(b);
		}
		System.out.println("========iterator==========");
	
		Iterator<Object> f= ll.iterator();
		while(f.hasNext()) {
			System.out.println(f.next());
		}
		
		System.out.println("==========List Iterator=========");
		
		ListIterator<Object> g= ll.listIterator();
		while(g.hasNext()) {
			System.out.println(g.next());
		}
		System.out.println("==========reverse=========");
		
		while(g.hasPrevious()) {
			System.out.println(g.previous());
		}
		
		System.out.println("=========for=reverse=========");
		for(int j=ll.size()-1;j>=0;j--) {
			System.out.println(ll.get(j));
		}
	
	}

}
