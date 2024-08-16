package constructor;

public class CS2 {

	int a=10;
	int b=20;
	
	public void addition () {
		int sum= a+b;
		System.out.println("addition is " +sum);
	}
	
	public void substraction() {
		int sub=a-b;
		System.out.println("subraction is " +sub);
	}
	public void multiplication() {
		int mul=a*b;
		System.out.println("multication is " +mul);
	}
	public void division() {
		
		int div=a/b;
		System.out.println("division is " +div);
	}
	
	
	
	public static void main(String[] args) {
		CS2 z =new CS2();
		z.addition();
		z.substraction();
		z.multiplication();
		z.division();
		
		CS3 r=new CS3();
		r.test1();

	}

}
