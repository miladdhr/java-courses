package abstract_exercise;

public class Teacher extends Person {

	public Teacher(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void wakeup() {
        System.out.println(" send SMS " + getName());

	}

}
