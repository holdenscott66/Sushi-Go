import java.util.*;


public class Deck {

	private LinkedList<String> deckOfCards;
	private LinkedList<String> hand1, hand2;
	private Random randCard;
	
	public Deck() {
		deckOfCards = new LinkedList();
		hand1 = new LinkedList();
		hand2 = new LinkedList();
		randCard = new Random();
		
		
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
	
	public LinkedList<String> setHand1(){
		for(int count = 0; count < 10; count ++) {
			int cardNum = randCard.nextInt(deckOfCards.size());
			String newCard = deckOfCards.get(cardNum);
			hand1.add(newCard);
			deckOfCards.remove(cardNum);
		}
		
		return hand1;
	}
	
	public LinkedList<String> setHand2(){
		for(int count = 0; count < 10; count ++) {
			int cardNum = randCard.nextInt(deckOfCards.size());
			String newCard = deckOfCards.get(cardNum);
			hand2.add(newCard);
			deckOfCards.remove(cardNum);
		}
		
		return hand2;
	}
		
		

}
