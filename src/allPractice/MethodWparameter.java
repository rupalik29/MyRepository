package allPractice;

public class MethodWparameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//method with parameter
		
		Display(10, 20);
		Display(55, 66);
		Display(1, 2);
		
		//non static reg method wid parameter create obj
		MethodWparameter display2=new MethodWparameter();
		display2.Display2(5, 2);
		
	}

	
	
	
	
	public static void Display( int a,int b) {
	int sum =a+b; //variable declaration+initialization
	System.out.println("addition is "+sum);
	
}
	public  void Display2( int a,int b) {
		int sum =a+b; //variable declaration+initialization
		System.out.println("addition is "+sum);
}
}