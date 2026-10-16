package fundamentals;

public class Student {

	int studentID;
	String studentName;
	String courseName;
	int marks;
	String principalName;

	static String collegeName = "VCube";

	static Student sname = new Student();

	static void displayStudentDetails() {

		sname.studentID = 10231;
		sname.studentName = "Devarakonda Ashresh Kumar";
		sname.courseName = "Java Full Stack";
		sname.marks = 97;

		System.out.println("Student Id: " + sname.studentID);
		System.out.println("Student Name: " + sname.studentName);
		System.out.println("Course Name: " + sname.courseName);
		System.out.println("Marks: " + sname.marks);
		System.out.println("--------------------------------");

		sname.studentID = 10239;
		sname.studentName = "Miryala Yashwanth ";
		sname.courseName = "Java Full Stack";
		sname.marks = 96;

		System.out.println("Student Id: " + sname.studentID);
		System.out.println("Student Name: " + sname.studentName);
		System.out.println("Course Name: " + sname.courseName);
		System.out.println("Marks: " + sname.marks);
		System.out.println("--------------------------------");

	}

	void displayCollegeDetails() {

		System.out.println("College Name: " + collegeName);

		System.out.println("Principal Name: " + principalName);
		System.out.println("***************************************");

	}

	void changePrincipal() {

		System.out.println("New Principal Name: " + principalName);
		System.out.println("***************************************");

	}

	public static void main(String[] args) {

		sname.principalName = "Mr. Srikanth";
		sname.displayCollegeDetails();

		displayStudentDetails();

		sname.principalName = "Mr. Vishwa";
		sname.changePrincipal();

		sname.displayCollegeDetails();

	}

}
