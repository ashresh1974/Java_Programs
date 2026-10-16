package fundamentals;

public class Test3 {

	static {
		System.out.println("Static block 1");
		main();
		{
			System.out.println("Instance block 1");
			main();
		}
	}

	static void main() {
		{
			System.out.println("Instance block in static method");
		}
	}

	void main1() {
		{
			System.out.println("Instance block in instance method");
		}
	}

	public static void main(String[] args) {

		main();

		Test3 obj = new Test3();
		obj.main1();
	}

	static {
		System.out.println("Static block 2");
		{
			System.out.println("Instance block 2");
		}
	}

}
