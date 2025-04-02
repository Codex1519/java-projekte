package tag02_03_04_uebungen;

import javax.swing.JOptionPane;

public class _05_Notenbewertung {

	public static void main(String[] args) {
		
		int note = Integer.parseInt(JOptionPane.showInputDialog("Gib die Note ein (1-6): "));
		
		String ergebnis = (note >= 1 && note <= 4) ? " Bestanden" : " Nicht bestanden";

		JOptionPane.showMessageDialog(null, "Die Note: " + note + ergebnis);
	}

}
