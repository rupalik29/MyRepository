package constructor;

public class study1 {

	public study1() {
		System.out.println("this is a constructor");
	}
	
	public study1(int a) {
		
		System.out.println("this is parameterised constructor");
		System.out.println(50);
		
	}
	
	public study1(String a) {
		System.out.println("this is parameterised constructor");
		System.out.println("this is "+a);
	}
	public study1(int s,int f) {
		
	System.out.println("this is parameterised constructor "+s+ ""+f);
	}
	public static void main(String[] args) {
		study1 S1=new study1();
		study1 S2=new study1(50);
		study1 S3=new study1("Roopali");
		study1 S4= new study1(10 , 20);
		
		
			

	}

}
