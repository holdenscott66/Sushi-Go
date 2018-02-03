import java.util.*;


public class Player {
	
	private LinkedList<String> possibleMoves;
	private int selection;
	
	public LinkedList<String> getPossibleMoves() {
		return possibleMoves;
	}
	
	public void setPossibleMoves(LinkedList<String> hand) {
		possibleMoves = hand;
		
	}
	
	
	public String move() {
		Scanner user_input = new Scanner(System.in);
		System.out.print("Enter the number of the card you choose:");
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
