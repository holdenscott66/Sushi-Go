import java.util.*;

/**
*Represents the player class in the game
*This class creates the instance of the player that is assigned to the user
*The player class will include the method for possibleMoves that determine
*whether a move is allowed or not
*This class also includes the card that is played
*/

public class Player {
	
	private LinkedList<String> possibleMoves;
	private int selection;
	private Scanner user_input;
	private String card;
	
	/**
	*The getPossibleMoves method is the getter for the possibleMoves
	*variable after it has been set
	*@return possibleMoves that is set b the setter method setPossibleMoves
	*/
	
	public LinkedList<String> getPossibleMoves() {
		return possibleMoves;
	}
	
	/**
	*The setPossibleMoves is a method that assogms the possibleMoves variable 
	*to the hand parameter
	*@param hand 	is from the Deck class and has the cards that are in the 
	*		player's hand that are used to determine what the player's
	*		possible moves are
	*/
	
	public void setPossibleMoves(LinkedList<String> hand) {
		possibleMoves = hand;
	}
	
	/**
	*The move method asks the player which card they choose to place on their
	*board
	*This method checks to see if the user input is possible with the hand they have
	*@param player	is used to determine which player is making a move and what hand
	*		the player has to figure out if their move is possible
	*/
	
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
	
	/**
	*The method cardPlayed just returns the card that is played
	*@return 	the card that is chosen to be placed on the board
	*/
	
	public String cardPlayed() {
		return card;
	}
}
