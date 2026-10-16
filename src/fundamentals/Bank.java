package fundamentals;

public class Bank {
	static String bankName = "HDFC Bank Pvt Ltd";
	static String ifscCode = "HDFC0283209";

	String cname;
	long accNum;
	double bal;

	void display() {

		System.out.println("Account Holder Name :" + cname);
		System.out.println("Account Number :" + accNum);
		System.out.println(bankName);
		System.out.println(ifscCode);
		System.out.println("Account Number :" + bal);
		System.out.println("**********************");
		System.out.println(Thread.currentThread());

		BankTask ashresh = new BankTask();
		ashresh.cname = "Devarakonda Ashresh Kumar";
		ashresh.accNum = 400320898;
		ashresh.bal = 14000.52;

		BankTask yashu = new BankTask();
		yashu.cname = "Miryala Yashwanth";
		yashu.accNum = 40032655;
		yashu.bal = 11930.52;

		BankTask buddu = new BankTask();
		buddu.cname = "Chata Vinay Kumar";
		buddu.accNum = 40032654;
		buddu.bal = 12330.52;

		ashresh.display();

		yashu.display();

		buddu.display();
	}

	public static void main(String[] args) {

		System.out.println("Welcome to HDFC Bank");
		System.out.println("**********************");

		System.out.println("**********************");
		System.out.println();

	}

}
