package fundamentals;

public class Cricketer {

	String name;
	int jerseyno;
	int highestScore;

	static String boardName = "BCC";
	static String countryName = "India";

	public static void main(String[] args) {

		Cricketer msd = new Cricketer();
		msd.name = "MS Dhoni";
		msd.jerseyno = 7;
		msd.highestScore = 210;

		Cricketer virat = new Cricketer();
		virat.name = "Virat kholi";
		virat.jerseyno = 18;
		virat.highestScore = 300;

		Cricketer hitman = new Cricketer();
		hitman.name = "Rohit Sharma";
		hitman.jerseyno = 38;
		hitman.highestScore = 372;

		System.out.println("Cricketer Details");
		System.out.println("Cricketer Country Id:" + boardName);
		System.out.println("Cricketer Name:" + msd.name);
		System.out.println("Cricketer Name:" + msd.jerseyno);
		System.out.println("Cricketer Name:" + msd.highestScore);

		System.out.println("-----------------------------");

		System.out.println("Cricketer Details");
		System.out.println("Cricketer Country Id:" + boardName);
		System.out.println("Cricketer Name:" + virat.name);
		System.out.println("Cricketer Name:" + virat.jerseyno);
		System.out.println("Cricketer Name:" + virat.highestScore);

		System.out.println("-----------------------------");

		System.out.println("Cricketer Details");
		System.out.println("Cricketer Country Id:" + boardName);
		System.out.println("Cricketer Name:" + hitman.name);
		System.out.println("Cricketer Name:" + hitman.jerseyno);
		System.out.println("Cricketer Name:" + hitman.highestScore);

	}

	static String greeting = "Thank You";

	void main() {
		System.out.println(greeting);
	}

}
