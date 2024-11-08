package abstract_exercise;

public class manager extends Person {

	public manager(String name) {
		super(name);
	}

	@Override
	public void wakeup() {
        System.out.println("tell in person " + getName());

	}

}
