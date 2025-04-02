package tag00_uebungen._01;

import javax.swing.JOptionPane;

public class AufgabeGrundrechenarten {

	public static void main(String[] args) {
		// 1.0 
		
		int zahl1 = 16;
		int zahl2 = 4;
		
		final double PI = 3.14;
		
		// Berechnungen durchführen
		
		int addition = zahl1 + zahl2;
		int subtraktion = zahl1 - zahl2;
		int multiplikation = zahl1 * zahl2;
		int division = zahl1 / zahl2;
		double multiplikationPI = zahl1 * PI;
		
		// Ergebnise in der Konsole ausgeben
		
//		System.out.println("Ergebnis der Subtraktion: " + subtraktion);
//		System.out.println("Ergebnis der Multiplikation: " + multiplikation);
//		System.out.println("Ergebnis der Division: " + division);
//		System.out.println("Ergebnis der Multiplikation mit Pi: " + multiplikationPI);
		
		//JOptionPane.showMessageDialog(null, "Ergebnis der Addition: " + addition);
		
		JOptionPane.showMessageDialog(null, "Ergebnis der Addition: " + addition + "\n"
                + "Ergebnis der Subtraktion: " + subtraktion + "\n"
                + "Ergebnis der Multiplikation: " + multiplikation + "\n"
                + "Ergebnis der Division: " + division + "\n"
                + "Multiplikation mit Konstante PI: " + multiplikationPI);
	
				
	}

}
