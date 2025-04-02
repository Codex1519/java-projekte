package tag07_08_uebungen._08_Yves;

public class MitarbeiterTest {

	public static void main(String[] args) {
		// Erstellen eines Mitarbeiterobjekts mit dem Default-Konstruktor
		Mitarbeiter mitarbeiter1 = new Mitarbeiter();
		mitarbeiter1.setMitarbeiterID("EMP001");
		mitarbeiter1.setName("Max Mustermann");
		mitarbeiter1.setPosition("Entwickler");
		mitarbeiter1.setGehalt(50000);
		mitarbeiter1.setErfahrungsjahre(5);
		mitarbeiter1.zeigemitarbeiterInfo();
		
		System.out.println();
		
		// Erstellen eines Mitarbeiterobjekts mit dem überladenen Konstruktor
	
		Mitarbeiter mitarbeiter2 = new Mitarbeiter("EMP002", "Maria Müller", "Manager");
		mitarbeiter2.setGehalt(7500);
		mitarbeiter2.setErfahrungsjahre(8);
		mitarbeiter2.zeigemitarbeiterInfo();
		
		System.out.println();
		
		// Erstellen eines Mitarbeiterobjektes mit allen Attributen
		Mitarbeiter mitarbeiter3 = new Mitarbeiter("EMP003", "John Doe", "Designer", 45000, 3);
		mitarbeiter3.zeigemitarbeiterInfo();
		
		System.out.println();
		
		// Test Validierungslogik
		Mitarbeiter mitarbeiter4 = new Mitarbeiter();
		mitarbeiter4.setMitarbeiterID("");
		mitarbeiter4.setGehalt(-1000);
		mitarbeiter4.setErfahrungsjahre(-5);
	}
}
