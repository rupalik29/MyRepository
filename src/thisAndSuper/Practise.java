package thisAndSuper;

public class Practise {

	public static void main(String[] args) {
		Practise p=new Practise();
		p.M();
	}
	public void M() {
		this.M(50);
		System.out.println("method M");
	}
	public void M(int a) {
		this.M(10, 20);
		System.out.println("method M");
	}
	public void M(int b,int c) {
		System.out.println("method M");
	}
}
