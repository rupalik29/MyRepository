package practiseFromStart;

public class Constructor {

	public static void main(String[] args) {
		Constructor Cst=new Constructor();
		Constructor Cst1=new Constructor(10);
		CT ct =new CT(10);
		
		}
	 
	public Constructor() {
		System.out.println("this is constructor without parameter");
	}
	
	
	public Constructor(int a) {
		System.out.println("this is constructor with parameter" +a);
	}
	
}
