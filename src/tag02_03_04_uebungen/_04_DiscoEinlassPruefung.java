package tag02_03_04_uebungen;

import javax.swing.JOptionPane;

public class _04_DiscoEinlassPruefung {

	public static void main(String[] args) {
		
		// Alter eingeben
		String alter = JOptionPane.showInputDialog("Bist du mindestens 18 Jahre alt ? (j/n)");
		boolean altGenug = alter.toLowerCase().equals("j"); 
		
		// VIP-Status
		if(altGenug) {
			String vipAbfrage = JOptionPane.showInputDialog("Bist du ein VIP? (j/n)");
			boolean vipPositiv = vipAbfrage.toLowerCase().equals("j");
		
		
			// Geschlecht
			String geschlecht = JOptionPane.showInputDialog(" Weiblich oder männlich? (w/m)");
			boolean istWeiblich = geschlecht.toLowerCase().equals("w");
			// Ausgeben der Angebote
			if(istWeiblich && vipPositiv) {
				JOptionPane.showMessageDialog(null, "Herzlich Willkommen ! Ab in die VIP Lounge und kriegst 20% Rabatt auf Getränke");	
			}else if (vipPositiv) {
				JOptionPane.showMessageDialog(null, "Herzlich Willkommen. Hast VIP-Zugang");
			}else if (istWeiblich) {
				JOptionPane.showMessageDialog(null, "Du kriegst 10 % Rabatt auf Getränke");
			}else {
				JOptionPane.showMessageDialog(null, "Willkommen, aber du kriegst nix");
			}
		}else {
			JOptionPane.showMessageDialog(null, "Tut mir nicht Leid, du kommst hier nicht rein");
		}	
	}
}