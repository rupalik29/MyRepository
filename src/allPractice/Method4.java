package allPractice;

public class Method4 {
	
	public static void main(String[] args) {
		addition();
		substraction();
	Method4 method4=new Method4();
	method4.multiplication();
	}

	public static void addition ()
	{
		//addition of a+b
		int a=10;
		int b=50;
		int sum=a+b;
		System.out.println("addition is "+sum);
	}
	
	public static void substraction() {
		//subtraction of a+b
		int a=10;
		int b=5;
		int sub=a-b;
		System.out.println("subraction is "+sub);
	}
	
	public void multiplication()
	{
		//mul of a*b
		int a=10;
		int b=6;
		int mul=a*b;
		System.out.println("multiplication is " +mul);
		System.out.println("==========================================================");
	}
	
	 
	
}
