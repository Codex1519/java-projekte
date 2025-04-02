package tag02_03_04_uebungen;

import javax.swing.JOptionPane;

public class _03_00Alterskategorisierung {

	public static void main(String[] args) {
		
		int alter = Integer.parseInt(JOptionPane.showInputDialog("Gib dein Alter ein: "));
		
		// Aufgabe 1.1 Zusatz
		int maxAlter = 90;
		
		if(alter < 0 || alter > maxAlter) {
			JOptionPane.showMessageDialog(null,"Ungültige Eingabe: Das Alter darf nicht über 90  und unter 0 sein.");
		}else {
		
		
			if(alter >= 0 && alter <= 12) {
				JOptionPane.showMessageDialog(null, "Du bist ein Kind.");
			}else if(alter >= 13 && alter <= 19) {
				JOptionPane.showMessageDialog(null, "Du bist ein Teenager.");
			}else if (alter >= 20 && alter <= 64) {
				JOptionPane.showMessageDialog(null, "Du bist ein Erwachsener");
			}else if (alter >= 65) {
				JOptionPane.showMessageDialog(null, "Du bist ein Senior");
			}
		}
	}

}
