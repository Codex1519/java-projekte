package tag07_08_uebungen._10_MitarbeiterKlassemitÜberladenenMethoden;

public class MitarbeiterTest {

	public static void main(String[] args) {
		// Erstellen eines Mitarbeiterobjekts mit dem Default-Konstruktor
		Mitarbeiter mitarbeiter = new Mitarbeiter("EMP001", "Anna Schmidt", "Entwickler", 60000, 5);
	
		Mitarbeiter mitarbeiter1 = new Mitarbeiter();
		mitarbeiter1.zeigemitarbeiterInfo();
		
		System.out.println();
		
		// Erstellen eines Mitarbeiterobjekts mit dem überladenen Konstruktor
	
		Mitarbeiter mitarbeiter2 = new Mitarbeiter("EMP002", "Maria Müller", "Manager");
		mitarbeiter2.setGehalt(75000);
		mitarbeiter2.setErfahrungsjahre(8);
		mitarbeiter2.zeigemitarbeiterInfo();
		
		
		
		// Erstellen eines Mitarbeiterobjektes mit allen Attributen
		Mitarbeiter mitarbeiter3 = new Mitarbeiter();
		mitarbeiter3.zeigemitarbeiterInfo();
		
		System.out.println();
		
		// Test Validierungslogik
		Mitarbeiter mitarbeiter4 = new Mitarbeiter();
		mitarbeiter4.setMitarbeiterID("");
		mitarbeiter4.setGehalt(-1000);
		mitarbeiter4.setErfahrungsjahre(-5);
		
		System.out.println();
		
		
		System.out.println();
		
		mitarbeiter.zeigemitarbeiterInfo();
		
		
		System.out.println();
		
		mitarbeiter.zeigeMitarbeiterInfoOhneGehalt();
		
		System.out.println();
		
		// Berechnung der Boni
		System.out.println("Standardbonus: " + mitarbeiter.berechneBonus());
		System.out.println("Bonus mit Faktor 0,15: " + mitarbeiter.berechneBonus(0.15));
		System.out.println("Bous mit Faktor 0,15 und Sonderzulage 1000: " + mitarbeiter.berechneBonus(0.15,1000));
							
	}
}
