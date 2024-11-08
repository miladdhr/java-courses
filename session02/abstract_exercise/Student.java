package abstract_exercise;

public class Student extends Person {

	public Student(String name) {
		super(name);
	}

	@Override
	public void wakeup() {
        System.out.println(" Call wake up" + getName());

	}

}
