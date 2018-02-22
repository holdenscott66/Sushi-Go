/**
*PVPGame represents the actual gameplay. In this class is the play method that calls
*objects created from other classes to create the players, the hands, the boards, the 
*checks needed to determine whether a move is valid, and the scoring at the end of the game
*/

public class GamePlay {
	private Player[] players;
	int numPlayers;
	GameConfiguration game;
	
	/**
	*The PVPGame method is the constructor that creates the players, the GameConfiguration 
	*object for the rules, and the hands
	*/

	public GamePlay(GameConfiguration config) {
		game = config;
		players = game.getPlayers();
		numPlayers = players.length;
		if(numPlayers == 2)
			twoPlayer();
	}

	/**
	*The play method is used to play the game
	*There is a counter that keeps a track of the turns
	*The play method runs while the hand size of both players are greater than 0
	*Once both players' hands are holding 0 cards, then the game ends and the boards are
	*displayed
	*Once this method is finished running, then the final score is displayed
	*/

	public void twoPlayer() {
		int turn = 0;
		while ((game.getHand(0).size() > 0) && (game.getHand(1).size() > 0)) {
			if(turn % 2 == 0) {
					players[0].setPossibleMoves(game.getHand(0));
					players[1].setPossibleMoves(game.getHand(1));
					game.displayHand(players[0], 0);
					players[0].move();
					game.updateHand(0, 0);
					game.displayHand(players[1], 1);
					players[1].move();
					game.updateHand(1, 1);
			}
			else if(turn % 2 == 1) {
					players[0].setPossibleMoves(game.getHand(1));
					players[1].setPossibleMoves(game.getHand(0));
					game.displayHand(players[0], 1);
					players[0].move();
					game.updateHand(0, 1);
					game.displayHand(players[1], 0);
					players[1].move();
					game.updateHand(1, 0);
			}
			turn++;
			System.out.println("*********************************************************");
			for(int x = 0; x < numPlayers; x++) {
				game.displayBoard(players[x]);
				System.out.println("*********************************************************");
			}	
		}
		
		new FinalScore(game, players[0]);
		new FinalScore(game, players[1]);
	}
}
