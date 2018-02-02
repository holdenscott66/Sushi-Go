import java.util.ArrayList;

public class GameConfiguration {
	
	private static ArrayList<String> hand1 = Deck.setHand();
	private static ArrayList<String> hand2 = Deck.setHand();
	private static ArrayList<String> boardp1;
	private static ArrayList<String> boardp2;
	
	public static ArrayList<String> getHand1() {
		return hand1;
	}
	
	public static ArrayList<String> getHand2() {
		return hand2;
	}
	
	public static void updateHands(Player firstPlayer, Player secondPlayer) {
		hand1.remove(firstPlayer.move());
		hand2.remove(secondPlayer.move());
	}
	
	public static void updateBoard(Player player1, Player player2) {
		boardp1.add(player1.move());
		boardp2.add(player2.move());
	}
	
	public static void displayBoard(){
		
	}
	
	public static void gameOver() {
		
	}
	
	public static void finalScore() {
		int tempura, sashimi, dumpling, wasabiNigiri, pudding, maki;
		
	}
}

