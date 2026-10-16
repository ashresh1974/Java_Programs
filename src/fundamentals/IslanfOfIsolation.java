package fundamentals;

class A {
	B b;

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method is called a");
	}

}

class B {
	A a;

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method is called b");
	}

}

public class IslanfOfIsolation {

	public static void main(String[] args) {

		System.out.println("Main method started");
		A a1 = new A();
		B b1 = new B();

		a1.b = b1;
		b1.a = a1;

		a1 = null;
		b1 = null;

		System.gc();

		System.out.println("Main method ended");

	}

}
