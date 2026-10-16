package fundamentals;

public class Garbage {

	@Override
	protected void finalize() {
		System.out.println("Finalize method is called");
	}

	void hello() {

		System.out.println("void main class called");
	}

	public static void main(String[] args) {

		System.out.println("Main method started");

		Garbage gc1 = new Garbage();
		System.out.println(gc1);

		Garbage gc2 = new Garbage();
		System.out.println(gc2);

		Garbage gc3 = new Garbage();
		System.out.println(gc3);

		Garbage gc4 = new Garbage();
		System.out.println(gc4);

		gc1 = null;

		gc2 = gc3;

		new Garbage();
		new Garbage().hello();

		System.gc();

		System.out.println("Main method ended");

	}

}
