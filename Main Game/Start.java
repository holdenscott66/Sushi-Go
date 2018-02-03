/**
 * 
 */
import java.util.*;

public class Start {

	public static void main(String[] args) {
		
		
		//variables 
		Scanner user_input = new Scanner(System.in);
		
		
		System.out.println("Sushi GO!");
		System.out.println("1) Player vs Player");
		System.out.println("2) Player vs Easy Computer");
		System.out.println("3) Player vs Hard Computer");
		System.out.println("4) Rules");
		System.out.print("Please Choose One of the Options: ");
		
		
		boolean isPositive = true;
		while (isPositive) {
			int selection = user_input.nextInt();
			if (selection > 4 || selection < 1) {
				System.out.print("Please choose one of the options (1-4): ");	
			}
			else {
				switch (selection) {
					case 1:
						
						playerVSplayer();
						isPositive = false;
						break;
					case 2: 
						playerVSeasy();
						isPositive = false;
						break;
					case 3: 
						playerVShard();
						isPositive = false;
						break;
					default:
						System.out.println("RULES");
						break;
					}
			}
		}
		
	}
	
	public static void playerVSplayer() {
		PvPGame game = new PvPGame();		
		game.setup();
		game.play();
		
	}
	
	public static void playerVSeasy() {
		
	}
	
	public static void playerVShard() {
		
	}

}