package variableTypes;

public class study_2 {
	
	public static void main(String[] args) {
		
		System.out.println("the value of a is "+Variable.a);//global variable from another class
		
	Variable s= new Variable();
	s.test();//local variable from another class
	}

}

