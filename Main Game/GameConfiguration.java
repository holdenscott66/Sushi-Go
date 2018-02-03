import java.util.*;

public class GameConfiguration {
	private Deck newDeck;
	private LinkedList<String> hand1;
	private LinkedList<String> hand2;
	private LinkedList<String> boardp1;
	private LinkedList<String> boardp2;
	
	public GameConfiguration() {
		newDeck = new Deck();
		hand1 = new LinkedList();
		hand2 = new LinkedList();
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
				System.out.println((count + 1) + ")" + "      "+ hand.get(count));
			}
	}
	
	public void updateHands(Player firstPlayer, Player secondPlayer) {
		hand1.remove(firstPlayer.move());
		hand2.remove(secondPlayer.move());
	}
	
	public void updateBoard(Player player1, Player player2) {
		boardp1.add(player1.move());
		boardp2.add(player2.move());
	}
	
	public void displayBoard(){
		
	}
	
	public void gameOver() {
		
	}
	
	public void finalScore() {
		int tempura, sashimi, dumpling, wasabiNigiri, pudding, maki;
		
	}
}

