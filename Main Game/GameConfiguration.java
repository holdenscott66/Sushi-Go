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
	
	public LinkedList<String> getHand1() {
		return hand1;
	}
	
	public LinkedList<String> getHand2() {
		return hand2;
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
	
	public void finalScore(int player) {
		Hashtable<String, Integer> playerBoard = new Hashtable<String, Integer>();
		Hashtable<String, Integer> opponentBoard = new Hashtable<String, Integer>();
		int finalScore, dumpling, eggNigiri, salmonNigiri, squidNigiri, makiRoll, 
		sashimi, tempura, wasabi, pudding;
		
		if (player == 1) {
			playerBoard = boardp1;
			opponentBoard = boardp2;
		}
		else if (player == 2) {
			playerBoard = boardp2;
			opponentBoard = boardp1;
		}
		//dumpling score
		switch(playerBoard.getOrDefault("Dumpling", 0)) {
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
		//pudding score
		if(playerBoard.getOrDefault("Pudding", 0) > opponentBoard.getOrDefault("Pudding", 0))
			pudding = 6;
		else if(playerBoard.getOrDefault("Pudding", 0) < opponentBoard.getOrDefault("Pudding", 0))
			pudding = -6;
		else
			pudding = 0;
		//makiroll score
		if(playerBoard.getOrDefault("MakiRoll", 0) > opponentBoard.getOrDefault("MakiRoll", 0))
			makiRoll = 5;
		else
			makiRoll = 0;
		//
		//sashimi score
		sashimi = (playerBoard.getOrDefault("Sashimi", 0) / 3) * 10;
		//tempura score
		tempura = (playerBoard.getOrDefault("Tempura", 0) / 2) * 5;
		
		finalScore = dumpling + sashimi + tempura + pudding + makiRoll;
		
		System.out.println("Player " + player + "'s score: " + finalScore);
		playerBoard.clear();
		finalScore = 0;
		
		
	}
}

