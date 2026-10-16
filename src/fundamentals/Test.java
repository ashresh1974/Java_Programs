package fundamentals;

public class Test {

	// Instance variables
	int a = 10;
	String name = "Ashu";

	public static void main(String[] args) {

		System.out.println("public static void main(String[] args)");

		// Calling static method
		main();

		// Creating an object
		Test obj = new Test();

		// Calling non-static methods
		obj.main0();
		obj.main1();
		obj.main2();

		// Accessing instance variables
		System.out.println("--------------------");
		System.out.println("Instance variable a = " + obj.a);
		System.out.println("Instance variable name = " + obj.name);

		// Local variable in main method
		int local = 100;
		System.out.println(local + local);
		System.out.println("--------------------");

		obj.thread();

	}

	static void main() {
		System.out.println("--------------------");
		System.out.println("static void main started()");
		System.out.println("static void main ended()");
		System.out.println("--------------------");
	}

	void main0() {
		System.out.println("--------------------");
		System.out.println("******void main0()******");
		System.out.println("--------------------");
	}

	void main1() {
		// Local variable
		int b = 20;
		System.out.println("--------------------");
		System.out.println("void main1() statred");
		System.out.println("Instance variable a = " + a);
		System.out.println("Instance variable name = " + name);
		System.out.println("Local variable b = " + b);
		System.out.println("void main1() ended");
		System.out.println("--------------------");
	}

	void main2() {
		// Local variable
		int c = 30;
		System.out.println("--------------------");
		System.out.println("void main2() started");
		System.out.println("Local variable c = " + c);
		System.out.println("void main2() ended");
		System.out.println("--------------------");
	}

	void thread() {
		System.out.println("--------------------");
		System.out.println(Thread.currentThread());
		System.out.println("--------------------");

	}
}