package controlStatement;

public class Nested_if_study {

	public static void main(String[] args) {
		String UN="Velocity";
		String PSWD="12345";
		
		if(UN=="Velocity"){
			System.out.println("Correct username,Pls login");
			if(PSWD=="12345") {
				System.out.println("Login successfull");
			}else {
				System.out.println("Password incorrect,enter correct password");
			}
			}else {
			System.out.println("incorrect Username");
		}
		
		

	}

}
