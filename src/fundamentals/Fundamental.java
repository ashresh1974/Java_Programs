package fundamentals;

public class Fundamental {

	public static void main(String[] args) throws ClassNotFoundException {

		System.out.println(Class.forName("java.lang.System"));
		System.out.println(Class.forName("java.lang.Class"));


		System.out.println(Class.forName("fundamentals.Bank"));
		System.out.println(Class.forName("fundamentals.Employee"));
		
		System.out.println(Class.forName("com.mysql.cj.jdbc.Driver"));
		

		System.out.println("");
	}
}