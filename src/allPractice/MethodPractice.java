package allPractice;

public class MethodPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display();
		Method2.Demo();//static method from another class
		Method2 M2=new Method2();
		M2.Demo2();
		
		//Classname objectname= new classname();---syntax
		
	MethodPractice D1= new MethodPractice ();//obj creation
	D1.Display2();//call method
		
	}
	
	public static void Display()
	{
		System.out.println("HI this is static regular method");
		
	}

	public void Display2()
	{
		System.out.println("Hi this is non static regular method");
	}
}
