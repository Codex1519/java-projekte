package tag05_uebungen;

import javax.swing.JOptionPane;

public class _01_EinfacherRechner {

	public static void main(String[] args) {
		
		boolean wiederholen = true;
		
		while(wiederholen) {
			double zahl1 = Double.parseDouble(JOptionPane.showInputDialog("Gib die erste Zahl ein: "));
			
			double zahl2 = Double.parseDouble(JOptionPane.showInputDialog("Gib die zweite Zahl ein: "));
			
			String operatorenAuswahl = JOptionPane.showInputDialog(
					"Wähle eine Operation: \n1: Addition\n2: Subtraktion\n3: Multiplikation\n4: Division\n5: Beenden");
			
			double berechnung = 0;
			
			switch (operatorenAuswahl) {
			case "1":
				berechnung = zahl1 + zahl2;
				JOptionPane.showMessageDialog(null,"Ergebnis der Addition: " + berechnung);
				break;
			case "2":
				berechnung = zahl1 - zahl2;
				JOptionPane.showMessageDialog(null, "Ergebnis der Subtraktion " + berechnung);
				break;
			case "3":
				berechnung = zahl1 * zahl2;
				JOptionPane.showMessageDialog(null, "Ergebnis der Multiplikation " + berechnung);
				break;
			case "4": 
				berechnung = zahl1 / zahl2;
				JOptionPane.showMessageDialog(null, "Ergebnis der Division " + berechnung);
				break;
			case "5":
				wiederholen = false;
				JOptionPane.showMessageDialog(null, "Das Programm wird beendet.");
				break;
			
			
			}
		}

	}

}
