/**
 * 
 */
import java.util.*;

/**
*The Start class represents the beginning of the game where the user has a list of
*options they can choose from that involve playing the game and viewing the rules
*The user will select an option based on their input
*This is how the game will begin
*/

public class Start {

	private static Scanner user_input;

	public static void main(String[] args) {
		
		user_input = new Scanner(System.in);
		
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
	/**
	*The playerVSplayer method runs when the user decides to play a human vs human
	*game of Sushi Go
	*Selection player vs player initializes this method and the object PVPGame is 
	*called from the PVPGame class
	*/
	
	public static void playerVSplayer() {
		PvPGame game = new PvPGame();		
		game.play();
	}
	
	/**
	*playerVSeasy is the option to play against an easy ai
	*This will be implemented at a later date
	*/
	
	public static void playerVSeasy() {
		
	}
	
	/**
	*playerVShard is the option to play against an easy ai
	*This will be implemented at a later date
	*/
	public static void playerVShard() {
		
	}
}
