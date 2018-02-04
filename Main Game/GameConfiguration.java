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
	
	public void finalScore(int player) {
		//int tempura = 0, sashimi = 0, dumpling = 0, wasabiNigiri = 0, pudding = 0, maki = 0;
		Hashtable<String, Integer> score = new Hashtable<String, Integer>();
		LinkedList<String> board = new LinkedList<String>();
		int finalScore,chopsticks, dumpling, eggNigiri, salmonNigiri, squidNigiri, makiRoll1,
		makiRoll2, makiRoll3, sashimi, tempura, wasabi, pudding;
		
		if (player == 1) {
			board = boardp1;
		}
		
		else if (player == 2) {
			board = boardp2;
		}
		for(String card: board) {
			if(score.containsKey(card)) {
				score.replace(card, (score.get(card) + 1));
			}
			else {
				score.put(card, 1);	
			}
		}
		System.out.println("Player " + player + "'s cards:");
		for (String val : ((Hashtable<String,Integer>) score).keySet()) {
		    System.out.println(val + ":" + score.get(val));
		}
		switch(score.getOrDefault("Dumpling", 0)) {
		case 1:
			dumpling = 1;
			break;
		case 2:
			dumpling = 3;
			break;
		case 3:
			dumpling = 6;
			break;
		case 4:
			dumpling = 10;
			break;
		case 5:
			dumpling = 15;
			break;
		default:
			dumpling = 0;
			break;
		}
		
		sashimi = (score.getOrDefault("Sashimi", 0) / 3) * 10;
		tempura = (score.getOrDefault("Tempura", 0) / 2) * 5;
		
		finalScore = dumpling + sashimi + tempura;
		
		System.out.println("Player " + player + "'s score: " + finalScore);
		score.clear();
		
	}
}

