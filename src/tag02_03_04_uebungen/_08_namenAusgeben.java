package tag02_03_04_uebungen;

import javax.swing.JOptionPane;

public class _08_namenAusgeben {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Gib den Namen ein, der wiederholt werden soll: ");
		
		int anzahlWiederholungen = Integer.parseInt(JOptionPane.showInputDialog("Bitte gib die Anzahl der Wiederholungen ein: "));
		
		// Prüfen der Wiederholungen zwischen 0 und 30
		
		if (anzahlWiederholungen < 0 || anzahlWiederholungen > 30) {
			JOptionPane.showMessageDialog(null, "Die Anzahl der Wiederholungen muss zwischen 0 und 30 liegen.");
		}else {
			String ausgabe = "";
			
			for (int i = 0; i < anzahlWiederholungen; i++) {
				ausgabe += i + ": " + name + "\n";
			}
			
			// Ausgabe in einem Dialogfenster
			JOptionPane.showMessageDialog(null, ausgabe);
		}
	}

}
