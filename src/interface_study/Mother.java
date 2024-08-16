package interface_study;

public interface Mother {

	default void care() {
		System.out.println("mothers care");
	}
	default void look() {
		System.out.println("mothers look");
	}
	static void love() {
		System.out.println("Mothers love static method");
	}
}
