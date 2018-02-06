import java.util.*;

/**
*Represents the GameConfiguration class that is used to set up the game Sushi-Go
*This class uses methods from the Deck class to create a deck and hands for the players.
*This class creates turns and boards that are specific for each player
*This class uses objects in the Player class to create players
*Players can view the cards in their hand, can select a card to keep and place on their board,
*update the hand to remove the chosen card, and updates the board to reflect the player's choice
*The hands are then switched between players at the end of the turn and the board is displayed
*/

public class GameConfiguration {
	
	private Deck newDeck;
	private LinkedList<String> hand1;
	private LinkedList<String> hand2;
	Hashtable<String, Integer> boardp1;
	Hashtable<String, Integer> boardp2;
	
	/**
	*The GameConfiguration method creates the deck, the boards, and the hands
	*Takes in no parameters and does not return anything
	*/
	
	public GameConfiguration() {
		newDeck = new Deck();
		boardp1 = new Hashtable<String, Integer>();
		boardp2 = new Hashtable<String, Integer>();
		hand1 = new LinkedList<String>();
		hand2 = new LinkedList<String>();
		hand1.addAll(newDeck.setHand());
		hand2.addAll(newDeck.setHand());
	}
	
	/**
	*The getHand method checks if the player is player 1
	*If the player is in fact player 1 they are given hand 1,
	*if not, they are given hand 2
	*@return the respective hand based on whether they are player 1 or not
	*/
	
	public LinkedList<String> getHand(int player) {
		return(player == 1) ? hand1 : hand2;
	}
	
	/**
	*The displayHand method displays the hand to the player
	*@param player 	is the player's number, which determines
	*		whether they are player 1 or 2
	*@param hand	is the hand that is currently assigned to 
	*		the player
	*/
	
	public void displayHand(int player, LinkedList<String> hand) {
			System.out.println("Player " + player + ":" );
			for(int count = 0; count < hand.size(); count++) {
				System.out.println((count + 1) + ")" + "      " + hand.get(count));
			}
	}
	
	/**
	*The updateHands method is used to update the player's hand
	*after they've chosen which card to place on their board
	*This method removes the card they've chosen from their hand
	*@param firstPlayer 	These two parameters identify the 
	*@param secondPlayer	player to distinguish which player 
	*			removed which card
	*/
	
	public void updateHands(Player firstPlayer, Player secondPlayer) {
		hand1.remove(firstPlayer.cardPlayed());
		hand2.remove(secondPlayer.cardPlayed());
	}
	
	/**
	*The updateBoard method is used to update the board based on
	*the card the player played
	*@param player1		these parameters are used to distinguish
	*@param player2		between the two players and the card that
	*			they played
	*This method checks to see if the card played is already on the 
	*respective board
	*If the card was already on the board, then it increments by 1
	*If the card was not on the board, it creates the entry and assigns
	*it the value 1 representing 1 card of that entry
	*/
	
	public void updateBoard(Player player1, Player player2) {
		String card1 = player1.cardPlayed();
		String card2 = player2.cardPlayed();
		if(boardp1.containsKey(card1)) {
			boardp1.replace(card1, (boardp1.get(card1) + 1));
		}
		else {
			boardp1.put(card1, 1);	
		}
		if(boardp2.containsKey(card2)) {
			boardp2.replace(card2, (boardp2.get(card2) + 1));
		}
		else {
			boardp2.put(card2, 1);	
		}
	}
	
	/**
	*The getBoard method is used to create the board used by players
	*to record the cards they wish to keep for points
	*@param player	is used to identify the player so that the board
	*		can be made specifically for them
	*		The board stays with the player throughout the game
	*@return the board based on whether the player is player 1 or not
	*/
	
	public Hashtable<String,Integer> getBoard(int player) {
		return player == 1 ? boardp1 : boardp2;
	}
	
	/**
	*The displayBoard method is used to display the board with the cards
	*that have been added to it by the respective player
	*@param player 	is to distinguish which player is being selected so 
	*		that their board is displayed
	*No value is returned, rather the board is displayed showing that 
	*player's cards
	*/
	
	public void displayBoard(int player) {
		Hashtable<String, Integer> board = new Hashtable<String, Integer>();
		System.out.println("Player "+ player + "'s board:");
		if (player == 1) {
			board = boardp1;
		}
		else if (player == 2) {
			board = boardp2;
		}
		for (String val : ((Hashtable<String,Integer>) board).keySet()) {
		    System.out.println(val + ":" + board.get(val));
		}
	}
}

