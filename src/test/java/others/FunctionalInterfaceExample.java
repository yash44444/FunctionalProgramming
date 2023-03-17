package others;

@FunctionalInterface
public interface FunctionalInterfaceExample {
	
	public void print();
	
	default void scan() {
		System.out.println("this is scan");
	}

}

// Functional interface have only 1 abstract method n any number of default or static methods.
// To restrict users to create any more abstract methods, we annotate the interface by FunctionalInterface.