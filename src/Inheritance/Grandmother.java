package Inheritance;

public class Grandmother extends Son{

	public void Bunglow() {
		System.out.println("grannys Bunglow");
	}
	
	public void Skills() {
		System.out.println("grannys skill");
	}
	public static void main(String[] args) {
		Grandmother g= new Grandmother();
		g.Beauty();
		g.Money();
		g.Look();
		g.Nature();
		g.Bunglow();
		g.Skills();
	}
	
	
}
