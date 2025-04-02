package tag05_uebungen;

import javax.swing.JOptionPane;

public class _01_01_EinfacherRechnerYvesTesch {

	public static void main(String[] args) {
		
		boolean wiederhole = true;
		
		while(wiederhole) {
			double zahl1 = Double.parseDouble(JOptionPane.showInputDialog("Gib die erste Zahl ein"));
			double zahl2 = Double.parseDouble(JOptionPane.showInputDialog("Gib die zweite Zahl ein"));
			
			int auswahl = Integer.parseInt(JOptionPane.showInputDialog("Wähle eine Operation:\n1: Addition\n2: Subtrakion\n3: Multiplikation\n4: Division\n5: Beenden"));
			
			
			double ergebnis = 0;
			switch(auswahl) {
			case 1: // Addition
				ergebnis = zahl1 + zahl2;
				JOptionPane.showMessageDialog(null, "Ergebnis der Addition: " +ergebnis );
			case 2: 
				ergebnis = zahl1 - zahl2;
				JOptionPane.showMessageDialog(null, "Ergebnis der Subtraktion: " + ergebnis);
			case 3 : 
				if(zahl2 != 0) {
				ergebnis = zahl1 * zahl2;
				JOptionPane.showMessageDialog(null, "Ergbenis der Multiplikation: " +ergebnis);
				} else {
					JOptionPane.showMessageDialog(null, "Division durch 0 ist nicht erlaubt.");
				}
			case 4:
				ergebnis = zahl1 / zahl2;
				JOptionPane.showMessageDialog(null, "Ergebnis der Division: " + ergebnis);
			case 5:
				wiederhole = false;
				JOptionPane.showMessageDialog(null, "Programm wird beendet.");
			default: 
				JOptionPane.showInputDialog("Ungültige Auswahl. Bitte erneut eingeben");
			}
			if (wiederhole) {
				String antwort = JOptionPane.showInputDialog("Neustarten?");
				if(antwort.equalsIgnoreCase("Nein"));
				wiederhole = false;
				JOptionPane.showMessageDialog(null,"Das Programm wird beendet.");
				
			}
			String antwort = JOptionPane.showInputDialog("Neustarten?");
			if(antwort.equalsIgnoreCase("Nein"));
			wiederhole = false;
			JOptionPane.showMessageDialog(null,"Das Programm wird beendet.");
			
		}
		

	}

}
