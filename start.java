import java.util.Scanner;
public class start {

	public static void main(String[] args) {
		System.out.println("Sushi GO!");
		System.out.println("1) Player vs Player");
		System.out.println("2) Player vs A.I.");
		System.out.println("3) Rules");
		System.out.print("Please Choose One of the Options: ");
		boolean isPositive = true;
		while (isPositive) {
			Scanner user_input = new Scanner(System.in);
			int selection = user_input.nextInt();
			if (selection > 3 || selection < 1) {
				System.out.println("Please choose one of the options (1-3)");
			}
			else {
				switch (selection) {
				case 1: System.out.println("Option 1");
				isPositive = false;
				break;
				case 2: System.out.println("Option 2");
				isPositive = false;
				break;
				case 3: System.out.println("Option 3");
				isPositive = false;
				break;
				}
			}
		}
	}

}
