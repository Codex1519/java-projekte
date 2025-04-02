package tag02_03_04_uebungen;

import javax.swing.JOptionPane;

public class _03_01Alterskategorisierung {

	public static void main(String[] args) {
		
		int alter = Integer.parseInt(JOptionPane.showInputDialog("Gib dein Alter ein: "));
		String kategorie;
		
		
		if(alter < 0 || alter > 90) {
			JOptionPane.showMessageDialog(null,"Ungültige Eingabe: Das Alter darf nicht über 90  und unter 0 sein.");
		}else {
			String Kategorie;
			if (alter <= 12) {
				kategorie = "Kind";
			}else if (alter <= 19) {
				kategorie = "Teenager";
			}else if (alter <= 64) {
				kategorie = "Erwachsener";
			}else {
				kategorie = "Senior";
			}
			JOptionPane.showMessageDialog(null, "Du bist ein " + kategorie + ". ");
		}

	}

}
