package controlStatement;

public class ifElse_Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.If your marks greater than 40 then you arepass.
		//else you are fail.
		
	int marks=80;
	if(marks>40)
	{
		System.out.println("You are pass");
	}
	else
	{
		System.out.println("You are fail");
	}
//2.If you are male(m/f) then turn right.
	//else turn left.
	char male='m';
	if(male=='m')
	{
		System.out.println("turn right");
	}else
	{
		System.out.println("turn left");
	}
	
//3.If signal is red then stop.
	//else go.
	String signal="red";
	if(signal=="red")
	{
		System.out.println("stop");
	}
	else
	{
		System.out.println("go");
	}

	
	
	
	}

}
