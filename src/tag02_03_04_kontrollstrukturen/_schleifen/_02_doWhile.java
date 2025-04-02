package tag02_03_04_kontrollstrukturen._schleifen;

public class _02_doWhile {

	public static void main(String[] args) {
		// Do-While ist eine Fußgesteuerte Schleife und die einzige ihrer Art.
		
		int zaehler = 0;
		
		do {
			System.out.println("Aktueller Zaehler 2: " + zaehler);
			zaehler++;
		}while (zaehler <= 4);
	}
}
