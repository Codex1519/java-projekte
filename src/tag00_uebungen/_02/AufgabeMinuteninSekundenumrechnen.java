package tag00_uebungen._02;

import javax.swing.JOptionPane;

public class AufgabeMinuteninSekundenumrechnen {

	public static void main(String[] args) {
		
		String minutenAbfrage = JOptionPane.showInputDialog(null, "Bitte Minuten eingeben: ");
		
		int minuten = Integer.parseInt(minutenAbfrage);
		
		int sekunden = minuten * 60;
		
		String ergebnis = minuten + " Minuten entsprechen: " + sekunden + " Sekunden";
		JOptionPane.showMessageDialog(null, ergebnis);

	}

}
