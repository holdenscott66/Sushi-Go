import java.util.ArrayList;
import java.util.Scanner;


public class Player {
	
	private ArrayList<String> possibleMoves;
	private int selection;
	
	public ArrayList<String> getPossibleMoves() {
		return possibleMoves;
	}
	
	public void setPossibleMoves(ArrayList<String> hand) {
		possibleMoves = hand;
		
	}
	
	public String move() {
		Scanner user_input = new Scanner(System.in);
		boolean isPositive = true;
		while (isPositive) {
			selection = user_input.nextInt();
			int selection = user_input.nextInt();
			if (selection > (possibleMoves.size() + 1) || selection < 1) {
				System.out.println("Please choose a valid option");
			}
		}
		return possibleMoves.get(selection - 1);
	}
	
}
