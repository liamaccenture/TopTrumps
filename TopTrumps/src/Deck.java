import java.util.ArrayList;
import java.util.List;

public class Deck {

	public static ArrayList<Card> deckOfCards = new ArrayList<Card>();
	
	public static void CreateDeck() {
		
		deckOfCards.add(new Card("Lamborghini Aventador","src/aventador.jpg"));
		
	}
	
	public static void PrintCardSize() {
		
		for(int i = 0; i < deckOfCards.size(); i++) {
			
			System.out.println(deckOfCards.get(i).m_name);
			
		}
		
	}
	
}
