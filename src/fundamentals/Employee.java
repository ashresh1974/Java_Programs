package fundamentals;

public class Employee {

	static String companyName = "VCube";

	int empId;
	String empName;
	String empDept;
	long empSalary;

	public static void main(String[] args) {
		System.out.println(companyName + " Employee Details");
		System.out.println("--------------------------------");

		Employee emp1 = new Employee();
		emp1.empId = 101;
		emp1.empName = "Devarakonda Ashresh Kumar";
		emp1.empDept = "Java Developer";
		emp1.empSalary = 100000;

		System.out.println("Employee Id:" + emp1.empId);
		System.out.println("Employee Name:" + emp1.empName);
		System.out.println("Employee Department:" + emp1.empDept);
		System.out.println("Employee Company:" + companyName);
		System.out.println("Employee Salary:" + emp1.empSalary);
		System.out.println("*************************************");

		Employee emp2 = new Employee();
		emp2.empId = 102;
		emp2.empName = "Miryala Yashwanth";
		emp2.empDept = "Java Tester";
		emp2.empSalary = 120000;

		System.out.println("Employee Id:" + emp2.empId);
		System.out.println("Employee Name:" + emp2.empName);
		System.out.println("Employee Department:" + emp2.empDept);
		System.out.println("Employee Company:" + companyName);
		System.out.println("Employee Salary:" + emp2.empSalary);

	}

}
