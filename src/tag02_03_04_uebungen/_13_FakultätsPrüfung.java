package tag02_03_04_uebungen;
import javax.swing.JOptionPane;


public class _13_FakultätsPrüfung {
		public static void main(String[] args) {
						
			int zahl = Integer.parseInt(JOptionPane.showInputDialog("Bitte gib eine Zahl zwischen 0 und 10 ein: "));
			if (zahl < 0) {
				JOptionPane.showMessageDialog(null," Bitte gültige Fakultät eingeben. Fakultäten sind immer >= 0.");
			}
			
			// Die Zahl wird wiederholt durch aufsteigende Divisoren geteilt, 
			// bis entweder eine 1 erreicht wird
			// (dann handelt es sich um eine Fakultät) oder die Zahl nicht mehr ohne Rest teilbar ist.
			int divisor = 1;
			int zahl2 = zahl; // zahl2 zum speichern
			
			while (zahl > 1) {
				divisor++; // Divisor wird bei jedem Durchlauf um 1 erhöht 
				if(zahl % divisor !=0) { // hier wird geprüft ob eingegebene "zahl" ohne Rest teilbar ist.
					break; // wenn nicht null, dann wird die Schleife abgebrochen
				}
				zahl /= divisor; // wenn ohne rest teilbar, dann wird wiederholt bis 1 erreicht wird oder nicht
								 // mehr durch rest teilbar
				
			
				}
				if (zahl == 1) {
					JOptionPane.showMessageDialog(null, zahl2 + "=" + divisor + "!");
				}else {
					JOptionPane.showMessageDialog(null, zahl2 + " ist keine Fakultätszahl." );
				}
				
			}
	}