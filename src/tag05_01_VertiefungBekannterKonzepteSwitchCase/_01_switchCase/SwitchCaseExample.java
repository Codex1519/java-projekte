package tag05_01_VertiefungBekannterKonzepteSwitchCase._01_switchCase;

public class SwitchCaseExample {

	public static void main(String[] args) {
		// Switch Case Alternative für if-else-if - Konstruktionen
		
		// Wird genutzt um die Lesbarkeit von langen if-else-if - Kontruktionen zu verbessern
		
		// Sind potentiell effizienter als if-else-if, weil die JVM direkt weiß, ob ein Case existiert,
		// oder nicht.
		
		// Verwendbare Datentypen sind: 
		// Ganzzahlen: byte, short, int (alle außer long)
		// char
		// String
		// Enum
		
		int jahreszeit = 2;
		
		switch (jahreszeit) {
		case 1: 
			System.out.println("Frühling");
			break;
		case 2:
			System.out.println("Sommer");
			break;
		case 3:
			System.out.println("Herbst");
			break;
		case 4:
			System.out.println("Winter");
			break;
		default:
			System.out.println("Ungültige Jahreszahl.");
		}
	}
}
