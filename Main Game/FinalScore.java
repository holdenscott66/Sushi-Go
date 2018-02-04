import java.util.*;

public class FinalScore {
	Hashtable<String, Integer> playerBoard;
	Hashtable<String, Integer> opponentBoard;
	int finalScore, dumpling, eggNigiri, salmonNigiri, squidNigiri, makiRoll, 
	sashimi, tempura, wasabi, pudding;
	
	public FinalScore(GameConfiguration game, int player) {
		if (player == 1) {
			playerBoard = game.getBoard(1);
			opponentBoard = game.getBoard(2);
		}
		else if (player == 2) {
			playerBoard = game.getBoard(2);
			opponentBoard = game.getBoard(1);
		}
		dumplingScore();
		puddingScore();
		makiRollScore();
		sashimiScore();
		tempuraScore();
		nigiriScore();
		wasabiNigiriScore();
		displayScore(player);
	}
	
	public void dumplingScore() {
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
	}
	
	public void puddingScore() {
		if(playerBoard.getOrDefault("Pudding", 0) > opponentBoard.getOrDefault("Pudding", 0))
			pudding = 6;
		else if(playerBoard.getOrDefault("Pudding", 0) < opponentBoard.getOrDefault("Pudding", 0))
			pudding = -6;
		else
			pudding = 0;
	}
	
	public void makiRollScore() {
		if(playerBoard.getOrDefault("MakiRoll", 0) > opponentBoard.getOrDefault("MakiRoll", 0))
			makiRoll = 5;
		else
			makiRoll = 0;
	}
	
	public void sashimiScore() {
		sashimi = (playerBoard.getOrDefault("Sashimi", 0) / 3) * 10;
	}
	
	public void tempuraScore() {
		tempura = (playerBoard.getOrDefault("Tempura", 0) / 2) * 5;
	}
	
	public void nigiriScore() {
		
	}
	
	public void wasabiNigiriScore() {
		
	}
	
	public void displayScore(int player) {
		finalScore = dumpling + sashimi + tempura + pudding + makiRoll;
		System.out.println("Player " + player + "'s score: " + finalScore);
	}
}

