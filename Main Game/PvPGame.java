import java.util.*;

public class PvPGame {
	//Variables
	private Player p1;
	private Player p2; 
	private GameConfiguration G1;
	private LinkedList<String> hand1;
	private LinkedList<String> hand2;
	
	
	//constructor
	
	public PvPGame() {
		p1 = new Player();
		p2 = new Player();
		G1 = new GameConfiguration();
		hand1 = new LinkedList<String>(); 
		hand2 = new LinkedList<String>(); 
	}
	
	public void setup() {
		//hand1.addAll(GameConfiguration.getHand1());
		//hand2.addAll(GameConfiguration.getHand2());
		hand1 = G1.getHand1();
		hand2 = G1.getHand2();
		G1.displayBoard();
	}
	
	public void play() {
		int turn = 0;
		
		for(int count = 0; count < hand2.size(); count++) {
		//while ((hand1.size() >= 0) && (hand2.size() >=0)) {
			
			G1.displayBoard();
			
			if(turn % 2 == 0) {
				p1.setPossibleMoves(hand1);
				p2.setPossibleMoves(hand2);
				G1.displayHand("1", hand1);
				
				G1.displayHand("2", hand2);
				p1.move();
				p2.move();
				G1.updateHands(p1, p2);
				G1.updateBoard(p1, p2);
				
			}
			
			else if(turn % 2 == 1) {
				p1.setPossibleMoves(hand2);
				p2.setPossibleMoves(hand1);
				G1.displayHand("1", hand2);
				p1.move();
				G1.displayHand("2", hand1);
				p2.move();
				G1.updateHands(p2, p1);
				G1.updateBoard(p1, p2);
				
				
				
			}
			
			turn++;
		}
		G1.finalScore();
		
	}
	
	

}
