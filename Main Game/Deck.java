import java.util.*;

public class Deck {

	private LinkedList<String> deckOfCards;
	private LinkedList<String> hand;
	private Random randCard;
	
	public Deck() {
		deckOfCards = new LinkedList<String>();
		hand = new LinkedList<String>();
		randCard = new Random();
		
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
		
		for(int cardNumber = 0; cardNumber < 26; cardNumber++) {
			deckOfCards.add("MakiRoll");
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
	
	public LinkedList<String> setHand(){
		if (hand.size() == 0) {
			for(int count = 0; count < 10; count ++) {
				int cardNum = randCard.nextInt(deckOfCards.size());
				String newCard = deckOfCards.get(cardNum);
				hand.add(newCard);
				deckOfCards.remove(cardNum);
			}
		}
		else {
			for(int count = 0; count < 10; count ++) {
				int cardNum = randCard.nextInt(deckOfCards.size());
				String newCard = deckOfCards.get(cardNum);
				hand.set(count, newCard);
				deckOfCards.remove(cardNum);
			}
		}
		return hand;
	}
}