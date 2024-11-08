package interface_exercise;

public class Dog implements Animal, Pet {

	public Dog() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
	     System.out.println(" Dog eats bones.");
	}

	@Override
	public void sleep() {
	     System.out.println(" Dog sleeps quietly.");

	}

}
