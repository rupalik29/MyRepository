package practiseFromStart;

public class CT {

	public static void main(String[] args) {
		CT ct=new CT();
		CT ct1=new CT(500);
	}
	public CT() {
		System.out.println("without paramter");
	}
	public CT(int a) {
		System.out.println("with parameter" +a);
	}

}
