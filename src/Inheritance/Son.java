package Inheritance;

public class Son extends Mother {

	public void Look(){
		System.out.println("sons look");
		
	}
	
	public void Nature() {
		
		System.out.println("sons nature");
	}
	
	public static void main(String[] args) {
		 Son s=new Son();
		 s.Look();
		 s.Nature();
		 s.Beauty();
		 s.Money();
	}
	}
