package fundamentals;

public class Test2 {

	public static void user() {
		System.out.println("Hi user");
	}

	void user3() {

		System.out.println("Hi user3");
	}

	public static void main(String[] args) {

		System.out.println("Hi");
		user();
		user1();
		user2();

		Test2 obj = new Test2();
		obj.user3();
		obj.user4();

		int sum = sum(5, 10);
		System.out.println("Sum a + b = " + sum);

		int re = sum(15, 25);
		System.out.println("Sum a + b = " + re);

		int result2 = obj.sum(10, 20, 30);
		System.out.println(result2);

		String add = add("Hello ", "Java");
		System.out.println(add);

		String result = add("Hello ", "MySQL");
		System.out.println(result);

		String result1 = obj.add("Hello ", "Java ", "World");
		System.out.println(result1);

	}

	public static void user1() {
		System.out.println("Hi user1");
	}

	static void user2() {
		System.out.println("Hi user2");
	}

	void user4() {
		System.out.println("Hi user4");
	}

	static int sum(int a, int b) {
		int result = a + b;
		return result;
	}

	int sum(int a, int b, int c) {
		int sum = a + b + c;
		return sum;
	}

	String add(String x, String y, String z) {
		String str = x + y + z;
		return str;
	}

	static String add(String a, String b) {
		String result = a + b;
		return result;
	}
}
