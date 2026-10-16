package fundamentals;

public class Test4 {

	static void main1() {
		System.out.println("Static Method 1");
		main2();
	}

	static void main2() {
		System.out.println("Static Method 2");
		Test4 obj = new Test4();
		obj.main3();

	}

	void main3() {
		System.out.println("Instance Method 1");
		Test4 obj = new Test4();
		obj.main4();
		

	}

	void main4() {
		System.out.println("Instance Method 2");
	}

	public static void main(String[] args) {

		main1();
	}

}
