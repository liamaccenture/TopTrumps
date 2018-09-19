import java.util.ArrayList;
import java.util.List;

public class Deck {

	public static ArrayList<Card> deckOfCards = new ArrayList<Card>();
	
	public static void CreateDeck() {
		
		deckOfCards.add(new Card("Lamborghini Aventador","src/LamborginiAventador.jpg"));
		deckOfCards.add(new Card("Ferrari 488","src/Ferarri488.jpg"));
		deckOfCards.add(new Card("Mclaren 720s","src/Mclaren720S.jpg"));
		deckOfCards.add(new Card("Porsche 911 Turbo S","src/911TurboS.jpg"));
		deckOfCards.add(new Card("Ford Fiesta","src/FordFiesta.jpg"));
		deckOfCards.add(new Card("Liam's Golf","src/LiamGolf.jpg"));
		deckOfCards.add(new Card("Nissan GTR","src/NissanGTR.jpg"));
		deckOfCards.add(new Card("Toyota GT86","src/GT86.jpg"));
		deckOfCards.add(new Card("Porsche Cayman GT4","src/GT4.jpg"));
		deckOfCards.add(new Card("Ford Transit","src/FordTransit.jpg"));
		deckOfCards.add(new Card("Formula 1","src/Formula1.jpg"));
		deckOfCards.add(new Card("C63 AMG","src/C63AMG.jpg"));
		deckOfCards.add(new Card("Nissan Micra","src/NissanMicra.jpg"));
		deckOfCards.add(new Card("Skoda Citigo","src/SkodaCitigo.jpg"));
		deckOfCards.add(new Card("BMW M3","src/BMWM3.jpg"));
		deckOfCards.add(new Card("BMW X6","src/BMWX6.jpg"));
		deckOfCards.add(new Card("Mclaren Senna","src/MclarenSenna.jpg"));
		deckOfCards.add(new Card("Porsche 918","src/Porsche918.jpg"));
		deckOfCards.add(new Card("Ferarri LaFerarri","src/FerarriLaferarri.jpg"));
		deckOfCards.add(new Card("Bugatti Chrion","src/Chiron.jpg"));	
	}
	public static void PrintCardSize() {
		
		for(int i = 0; i < deckOfCards.size(); i++) {
			System.out.println(deckOfCards.get(i).m_name);
		}
		for(int i = 0; i < deckOfCards.size(); i++) {
			System.out.println(deckOfCards.get(i).m_handling);
		}
		for(int i = 0; i < deckOfCards.size(); i++) {
			System.out.println(deckOfCards.get(i).m_function);
		}
		for(int i = 0; i < deckOfCards.size(); i++) {
			System.out.println(deckOfCards.get(i).m_popularity);
		}
		for(int i = 0; i < deckOfCards.size(); i++) {
			System.out.println(deckOfCards.get(i).m_price);
		}
	}	
}
