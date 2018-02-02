import java.util.ArrayList;

public class PvPGame {
	
	private static Player p1 = new Player();
	private static Player p2 = new Player();
	private static ArrayList<String> hand1;
	private static ArrayList<String> hand2;
	
	public static void setup() {
		hand1 = GameConfiguration.getHand1();
		hand2 = GameConfiguration.getHand2();
		GameConfiguration.displayBoard();
	}
	
	public static void play() {
	
		while (true) {
			
		}
		
	}
	
	

}
