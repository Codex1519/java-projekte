package tag02_03_04_uebungen;

import javax.swing.JOptionPane;

public class _06_Rabattberechnung {

	public static void main(String[] args) {

		int alter = Integer.parseInt(JOptionPane.showInputDialog("Gib dein Alter ein: "));

		double preis = Double.parseDouble(JOptionPane.showInputDialog("Gib den Preis ein: "));

		double rabatt = alter < 18 ? 0.20 : 0.10;

		// Berechnung

		double gesamtpreis = preis * (1 - rabatt);

		String ergebnis = String.format("Du kriegst %.0f%% Rabatt. Der Gesamtpreis ist: %.2f Euro. ", rabatt * 100,
				gesamtpreis);
		JOptionPane.showMessageDialog(null, ergebnis);
	}

}
