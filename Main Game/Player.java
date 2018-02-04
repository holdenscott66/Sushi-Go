import java.util.*;


public class Player {
	
	private LinkedList<String> possibleMoves;
	private int selection;
	private Scanner user_input;
	private String card;
	
	
	public LinkedList<String> getPossibleMoves() {
		return possibleMoves;
	}
	
	public void setPossibleMoves(LinkedList<String> hand) {
		possibleMoves = hand;
		
	}
	
	
	public void move(int player) {
		user_input = new Scanner(System.in);
		System.out.println("Player " + player + ", Enter the number of the card you choose:");

		while (true) {
			selection = user_input.nextInt();
			if (selection > (possibleMoves.size() + 1) || selection < 1) {
				System.out.println("Please choose a valid option");
			}
			else {
				card = possibleMoves.get(selection - 1);
				break;
			}
		}

	}
	
	public String cardPlayed() {
		return card;
	}
	
}


