package constructor;

public class CS1 {

	public CS1() {
		System.out.println("this is a constructor");
	}
	public CS1(int z) {
		System.out.println("this is parameterised constructor "+z);
	}
	public CS1(String c) {
		System.out.println("this is parameterised constructor "+c);
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		CS1 a=new CS1();
		CS1 a1=new CS1(100);
		CS1 a2=new CS1("Rohit");
		
		
		

	}

}
