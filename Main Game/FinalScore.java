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
		wasabiNigiriScore();
		nigiriScore();
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
		squidNigiri = squidNigiri + (playerBoard.getOrDefault("squidNigiri", 0) * 3);
		salmonNigiri = salmonNigiri + (playerBoard.getOrDefault("SalmonNigiri", 0) * 2);
		eggNigiri = eggNigiri + (playerBoard.getOrDefault("EggNigiri", 0) * 1);
	}
	
	public void wasabiNigiriScore() {
		squidNigiri = 0;
		salmonNigiri = 0;
		eggNigiri = 0;
		while(playerBoard.getOrDefault("Wasabi", 0) > 0) {
			if(playerBoard.getOrDefault("SquidNigiri", 0) > 0) {
				squidNigiri = squidNigiri + 9;
				playerBoard.replace("Wasabi", (playerBoard.get("Wasabi") - 1));
				playerBoard.replace("SquidNigiri", (playerBoard.get("SquidNigiri") - 1));
			}
			else if (playerBoard.getOrDefault("SalmonNigiri", 0) > 0) {
				salmonNigiri = salmonNigiri + 6;
				playerBoard.replace("Wasabi", (playerBoard.get("Wasabi") - 1));
				playerBoard.replace("SalmonNigiri", (playerBoard.get("SalmonNigiri") - 1));
			}
			else if(playerBoard.getOrDefault("EggNigiri", 0) > 0) {
				eggNigiri = eggNigiri + 3;
				playerBoard.replace("Wasabi", (playerBoard.get("Wasabi") - 1));
				playerBoard.replace("EggNigiri", (playerBoard.get("EggNigiri") - 1));
			}
			else
				playerBoard.replace("Wasabi", 0);
		}
	}
	
	public void displayScore(int player) {
		finalScore = dumpling + sashimi + tempura + pudding + makiRoll + squidNigiri + salmonNigiri + eggNigiri;
		System.out.println("Player " + player + "'s score: " + finalScore);
	}
}

