package thisAndSuper;

public class ThisandSuper {

	public static void main(String[] args) {
		ThisandSuper TS=new ThisandSuper();
		TS.test();
	}
 public void test(){
	 this.test1(10);
	 System.out.println("test method");
 }
 public void test1(int a) {
	 this.test2(50);
	 System.out.println("test1 method");
 }
 public void test2(int b) {
	 System.out.println("test2 method");
 }
}
