import java.util.ArrayList;

public class GameConfiguration {
	
	private static ArrayList<String> hand1 = Deck.generateHand();
	private static ArrayList<String> hand2 = Deck.generateHand();
	private static ArrayList<String> boardp1;
	private static ArrayList<String> boardp2;
	
	public static ArrayList<String> getHand1() {
		return hand1;
	}
	
	public static ArrayList<String> getHand2() {
		return hand2;
	}
	
	public static void update() {
		hand1 = null;
		hand2 = null;
		boardp1 = null;
		boardp2 = null;
		
	}
	
	public static void displayBoard(){
		
	}
	
	public static void gameOver() {
		
	}
	
	public static void finalScore() {
		int tempura, sashimi, dumpling, wasabiNigiri, pudding, maki;
		
	}
}

