import java.util.ArrayList;
import java.util.Random;

public class Deck {

	private static ArrayList<String> deckOfCards = new ArrayList();
	private static ArrayList<String> hand = new ArrayList();
	
	public static void createDeck(){
		
		for(int cardNumber = 0; cardNumber < 4; cardNumber++) {
			deckOfCards.add("Chopsticks");
		}
		
		for(int cardNumber = 0; cardNumber < 14; cardNumber++) {
			deckOfCards.add("Dumpling");
		}
		
		for(int cardNumber = 0; cardNumber < 5; cardNumber++) {
			deckOfCards.add("EggNigiri");
		}
		
		for(int cardNumber = 0; cardNumber < 10; cardNumber++) {
			deckOfCards.add("SalmonNigiri");
			
		}
		
		for(int cardNumber = 0; cardNumber < 5; cardNumber++) {
			deckOfCards.add("SquidNigiri");
		}
		
		for(int cardNumber = 0; cardNumber < 6; cardNumber++) {
			deckOfCards.add("MakiRoll1");
		}
		
		for(int cardNumber = 0; cardNumber < 12; cardNumber++) {
			deckOfCards.add("MakiRoll2");
			
		}
		
		for(int cardNumber = 0; cardNumber < 8; cardNumber++) {
			deckOfCards.add("MakiRoll3");
		}
		
		for(int cardNumber = 0; cardNumber < 14; cardNumber++) {
			deckOfCards.add("Sashimi");
		}
		
		for(int cardNumber = 0; cardNumber < 14; cardNumber++) {
			deckOfCards.add("Tempura");
		}
		
		for(int cardNumber = 0; cardNumber < 6; cardNumber++) {
			deckOfCards.add("Wasabi");
		}
			
		for(int cardNumber = 0; cardNumber < 10; cardNumber++) {
			deckOfCards.add("Pudding");
		}
				
	}
	
	public static ArrayList<String> setHand(){
		
		Random randCard = new Random();
		
		for(int count = 0; count < 10; count ++) {
			int cardNum = randCard.nextInt(deckOfCards.size());
			hand.add(deckOfCards.get(cardNum));
			deckOfCards.remove(cardNum);
		}
		
		return hand;
	}
		

}
