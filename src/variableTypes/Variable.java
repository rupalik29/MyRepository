package variableTypes;

public class Variable {
 
	static int z=10;
	static int a=100;
	static int h=50;
	static int g=9;
		int m=60;
		
	public static void main(String[] args) {
		
		System.out.println("the vaue of z is "+z);
		System.out.println("the value of a is "+a);
		System.out.println("the value of h is "+h);
		System.out.println("the value of g is "+g);
	
		
		Variable V= new Variable();
		V.test();
		
	}
	
		public void test() {
			
			int c=10;
			System.out.println("the value of c is " +c);
			System.out.println("subrataction of c-m is" +(m-c));
			
		}

	
	
	
	}
