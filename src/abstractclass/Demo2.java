package abstractclass;

public class Demo2 extends Demo {

	public static void main(String[] args) {
		 Demo2 d=new Demo2();
		 d.test();
		 d.test2();
		 d.test3();
	}

	public void test3()
	{
		System.out.println("hello");
	}

	@Override
	public void test2() {
		System.out.println("hi");
		
	}
}
