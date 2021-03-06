import java.util.ArrayList;
import java.util.List;

public class Deck {

	public static ArrayList<Card> deckOfCards = new ArrayList<Card>();
	
	public static void CreateDeck() {
		
		deckOfCards.add(new Card("Lamborghini Aventador","src/LamborginiAventador.jpg", 10, 10, 10, 10, 10));
		deckOfCards.add(new Card("Ferrari 488","src/Ferarri488.jpg", 10, 10, 10, 10, 10));
		deckOfCards.add(new Card("Mclaren 720s","src/Mclaren720S.jpg", 10, 10, 10, 10, 10));
		deckOfCards.add(new Card("Porsche 911 Turbo S","src/911TurboS.jpg", 10, 10, 10, 10, 10));
		deckOfCards.add(new Card("Ford Fiesta","src/FordFiesta.jpg", 10, 10, 10, 10, 10));
		deckOfCards.add(new Card("Liam's Golf","src/LiamGolf.jpg", 10, 10, 10, 10, 10));
		deckOfCards.add(new Card("Nissan GTR","src/NissanGTR.jpg", 10, 10, 10, 10, 10));
		deckOfCards.add(new Card("Toyota GT86","src/GT86.jpg", 10, 10, 10, 10, 10));
		deckOfCards.add(new Card("Porsche Cayman GT4","src/GT4.jpg", 10, 10, 10, 10, 10));
		deckOfCards.add(new Card("Ford Transit","src/FordTransit.jpg", 10, 10, 10, 10, 10));
		deckOfCards.add(new Card("Formula 1","src/Formula1.jpg", 10, 10, 10, 10, 10));
		deckOfCards.add(new Card("C63 AMG","src/C63AMG.jpg", 10, 10, 10, 10, 10));
		deckOfCards.add(new Card("Nissan Micra","src/NissanMicra.jpg", 10, 10, 10, 10, 10));
		deckOfCards.add(new Card("Skoda Citigo","src/SkodaCitigo.jpg", 10, 10, 10, 10, 10));
		deckOfCards.add(new Card("BMW M3","src/BMWM3.jpg", 10, 10, 10, 10, 10));
		deckOfCards.add(new Card("BMW X6","src/BMWX6.jpg", 10, 10, 10, 10, 10));
		deckOfCards.add(new Card("Mclaren Senna","src/MclarenSenna.jpg", 10, 10, 10, 10, 10));
		deckOfCards.add(new Card("Porsche 918","src/Porsche918.jpg", 10, 10, 10, 10, 10));
		deckOfCards.add(new Card("Ferarri LaFerarri","src/FerarriLaferarri.jpg", 10, 10, 10, 10, 10));
		deckOfCards.add(new Card("Bugatti Chrion","src/Chiron.jpg", 10, 10, 10, 10, 10));	
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
			System.out.println(deckOfCards.get(i).m_practicality);
		}
		for(int i = 0; i < deckOfCards.size(); i++) {
			System.out.println(deckOfCards.get(i).m_price);
		}
	}	
}
