package tag05_uebungen;

import javax.swing.JOptionPane;

public class _03_BerechnungVonPrimzahlenMitObergrenze {

	public static void main(String[] args) {
		
		int obergrenze = Integer.parseInt(JOptionPane.showInputDialog("Gib die obere Grenze für die Primzahlenberechnung ein (maximal 10000): "));
		
		if(obergrenze > 10000) {
			JOptionPane.showMessageDialog(null, "Bitte die Obergrenze von 10000 beachten.");
		}
		
		String primzahlen = "";
		int zaehler = 0; 
		
		for(int zahl = 2; zahl <= obergrenze; zahl++) {
			primzahlen += zahl + " ";
			zaehler++;
			
			if(zaehler % 50 == 0) {
				primzahlen += "\n";
				JOptionPane.showMessageDialog(null, "Die Primzahlen zwischen 2 und " + obergrenze + " sind: \n " + primzahlen);
				break;
			}
		}
	}
	
}
