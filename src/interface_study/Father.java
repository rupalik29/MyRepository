package interface_study;

public interface Father {
	
	default void care() {
		System.out.println("fathers care");
	}
	default void look() {
		System.out.println("fathers look");
	}
	static void love() {
		System.out.println("fathers love static method");
	}
}
