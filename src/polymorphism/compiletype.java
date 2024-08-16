package polymorphism;

public class compiletype {

	public static void main(String[] args) {
		compiletype c=new compiletype();
		c.test();
		c.test(5);
	}

	public void test() {
		System.out.println("hi komal");
	}
	
	public void test(int a) {
		System.out.println("hi roopali " +a);

	}
}
