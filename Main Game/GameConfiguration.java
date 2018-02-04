import java.util.*;

public class GameConfiguration {
	
	private Deck newDeck;
	private LinkedList<String> hand1;
	private LinkedList<String> hand2;
	Hashtable<String, Integer> boardp1;
	Hashtable<String, Integer> boardp2;
	
	public GameConfiguration() {
		newDeck = new Deck();
		boardp1 = new Hashtable<String, Integer>();
		boardp2 = new Hashtable<String, Integer>();
		hand1 = new LinkedList<String>();
		hand2 = new LinkedList<String>();
		hand1.addAll(newDeck.setHand());
		hand2.addAll(newDeck.setHand());
	}
	
	public LinkedList<String> getHand(int player) {
		return(player == 1) ? hand1 : hand2;
	}
	
	public void displayHand(int player, LinkedList<String> hand) {
			System.out.println("Player " + player + ":" );
			for(int count = 0; count < hand.size(); count++) {
				System.out.println((count + 1) + ")" + "      " + hand.get(count));
			}
	}
	
	public void updateHands(Player firstPlayer, Player secondPlayer) {
		hand1.remove(firstPlayer.cardPlayed());
		hand2.remove(secondPlayer.cardPlayed());
	}
	
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
	
	public Hashtable<String,Integer> getBoard(int player) {
		return player == 1 ? boardp1 : boardp2;
	}
	
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

