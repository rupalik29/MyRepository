package interface_study;

public class Daughter implements Mother, Father {

	public static void main(String[] args) {
		Daughter D= new Daughter();
		D.Money();
		D.look();
		D.care();
		
		
	}
	public void Money() {
		System.out.println("Daughters money");	
		}

	@Override
	public void care() {
		Mother.super.care();
		Father.super.care();
		Mother.love();
		Father.love();
	}

	@Override
	public void look() {
		Mother.super.look();
		Father.super.look();
	}



}
