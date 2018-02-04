import java.util.*;

public class FinalScore {
	Hashtable<String, Integer> playerBoard;
	Hashtable<String, Integer> opponentBoard;
	private int finalScore;
	
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
		wasabiNigiriScore();
		nigiriScore();
		System.out.println("Player " + player + "'s score: " + finalScore);
	}
	
	private void dumplingScore() {
		switch(playerBoard.getOrDefault("Dumpling", 0)) {
		case 1:
			finalScore += 1;
			break;
		case 2:
			finalScore += 3;
			break;
		case 3:
			finalScore += 6;
			break;
		case 4:
			finalScore += 10;
			break;
		case 5:
			finalScore += 15;
			break;
		default:
			finalScore += 0;
			break;
		}
	}
	
	private void puddingScore() {
		if(playerBoard.getOrDefault("Pudding", 0) > opponentBoard.getOrDefault("Pudding", 0))
			finalScore += 6;
		else if(playerBoard.getOrDefault("Pudding", 0) < opponentBoard.getOrDefault("Pudding", 0))
			finalScore += -6;
		else
			finalScore += 0;
	}
	
	private void makiRollScore() {
		if(playerBoard.getOrDefault("MakiRoll", 0) > opponentBoard.getOrDefault("MakiRoll", 0))
			finalScore += 5;
		else
			finalScore += 0;
	}
	
	private void sashimiScore() {
		finalScore += (playerBoard.getOrDefault("Sashimi", 0) / 3) * 10;
	}
	
	private void tempuraScore() {
		finalScore += (playerBoard.getOrDefault("Tempura", 0) / 2) * 5;
	}
	
	private void nigiriScore() {
		finalScore += (playerBoard.getOrDefault("squidNigiri", 0) * 3);
		finalScore += (playerBoard.getOrDefault("SalmonNigiri", 0) * 2);
		finalScore += (playerBoard.getOrDefault("EggNigiri", 0) * 1);
	}
	
	private void wasabiNigiriScore() {
		while(playerBoard.getOrDefault("Wasabi", 0) > 0) {
			if(playerBoard.getOrDefault("SquidNigiri", 0) > 0) {
				finalScore += 9;
				playerBoard.replace("Wasabi", (playerBoard.get("Wasabi") - 1));
				playerBoard.replace("SquidNigiri", (playerBoard.get("SquidNigiri") - 1));
			}
			else if (playerBoard.getOrDefault("SalmonNigiri", 0) > 0) {
				finalScore += 6;
				playerBoard.replace("Wasabi", (playerBoard.get("Wasabi") - 1));
				playerBoard.replace("SalmonNigiri", (playerBoard.get("SalmonNigiri") - 1));
			}
			else if(playerBoard.getOrDefault("EggNigiri", 0) > 0) {
				finalScore += 3;
				playerBoard.replace("Wasabi", (playerBoard.get("Wasabi") - 1));
				playerBoard.replace("EggNigiri", (playerBoard.get("EggNigiri") - 1));
			}
			else
				playerBoard.replace("Wasabi", 0);
		}
	}
}