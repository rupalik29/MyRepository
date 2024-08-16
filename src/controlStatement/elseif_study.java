package controlStatement;

public class elseif_study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.If your marks greater than or equal to 60 then you are 1st class.
//If your marks greater than or equal to 50 then you are 2st class.
//If your marks greater than or equal to 40 then you are just pass.
//else you are fail. 
		
		int marks=99;
		if(marks>=60)
		{
			System.out.println(" you are 1st class");
		}
		else if (marks>=50)
		{
			System.out.println("you are 2st class");
		}
		else if(marks>=40)
		{
			System.out.println("you are just pass");
		}
		else
		{
			System.out.println("you are fail");
		}
//2.If signal is red then stop.
//If signal is yellow then wait.
		//else go.
   String signal="green";
   if(signal=="red")
   {
	   System.out.println("stop");
   }
   else if(signal=="yellow")
   {
	   System.out.println("wait");
   }
	else
	{
		System.out.println("go");
	}
   
	}
}
