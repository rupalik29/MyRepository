package interface_study;

public class Study_child1 implements Study,Study_2 {

	public static void main(String[] args) {
		Study_child1 child=new Study_child1();
		child.demo();
		child.test1();
		child.test2();
		child.test3();
		child.test4();
	}
	
	@Override
	public void test3() {
	System.out.println("mother property 3");
		
	}

	@Override
	public void test4() {
		System.out.println("mother property 4");
		
	}

	@Override
	public void test1() {
		System.out.println("father property 1");
		
	}

	@Override
	public void test2() {
		System.out.println("father property 2");
		
		
	}
 public void demo() {
	 System.out.println("child property");
 }
 
}
