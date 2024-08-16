package accessSpecifier;

public class ProPract {

		public static void main(String[] args) {
		ProPract a=new ProPract();
		a.display();
		a.display1();
		a.display2();
		}
	
	private void display() {
		System.out.println("This is private method");
	}
	void display1() {
		System.out.println("This is default method");
	}
	protected void display2() {
		System.out.println("This is protected method");
	}
	
}


