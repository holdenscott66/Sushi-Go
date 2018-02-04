import java.util.*;

public class GameConfiguration {
	private Deck newDeck;
	private LinkedList<String> hand1;
	private LinkedList<String> hand2;
	private LinkedList<String> boardp1;
	private LinkedList<String> boardp2;
	
	
	public GameConfiguration() {
		newDeck = new Deck();
		boardp1 = new LinkedList<String>();
		boardp2 = new LinkedList<String>();
		hand1 = new LinkedList<String>();
		hand2 = new LinkedList<String>();
		hand1.addAll(newDeck.setHand());
		hand2.addAll(newDeck.setHand());
	}
	
	public LinkedList<String> getHand1() {
		return hand1;
	}
	
	public LinkedList<String> getHand2() {
		return hand2;
	}
	
	public void displayHand(String player, LinkedList<String> hand) {
		 
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
		boardp1.add(player1.cardPlayed());
		boardp2.add(player2.cardPlayed());
	}
	
	public void displayBoard(){
		System.out.println("Player 1's Board: "); 
		if (boardp1.size() == 0) {
			System.out.println("Board is Empty");
		}	
		else {
			for (int count = 0; count < boardp1.size(); count ++) {
				System.out.println((count + 1) + ")" + "	" + boardp1.get(count));	
			}
		}
			
		System.out.println("Player 2's Board: ");	   
		if (boardp2.size() == 0) {
			System.out.println("Board is Empty");
		}
		else {
			for (int count = 0; count < boardp2.size(); count ++) {
				System.out.println((count + 1) + ")" + "	" + boardp2.get(count));
			}
		}
	}
	
	public void gameOver() {
		
	}
	
	public void finalScore(int player) {
		//int tempura = 0, sashimi = 0, dumpling = 0, wasabiNigiri = 0, pudding = 0, maki = 0;
		Hashtable<String, Integer> score = new Hashtable<String, Integer>(10);
		LinkedList<String> board = new LinkedList<String>();
		
		/*score.put("Sashimi", 0);
		score.put("Chopsticks", 0);
		score.put("Dumping", 0);
		score.put("EggNigiri", 0);
		score.put("SalmonNigiri", 0);
		score.put("SquidNigiri", 0);
		score.put("MakiRoll1", 0);
		score.put("MakiRoll2", 0);
		score.put("MakiRoll3", 0);
		score.put("Tempura", 0);
		score.put("Wasabi", 0);
		score.put("Pudding", 0);
		*/
		
		if (player == 1) {
			board = boardp1;	
		}
		
		else if (player == 2) {
			board = boardp2;
		}
		
		
		
		
	}
}

