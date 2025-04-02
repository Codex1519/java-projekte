package tag02_03_04_uebungen;

import javax.swing.JOptionPane;

public class _11_DateiengroeßenErweiternMitMenue {

	public static void main(String[] args) {

		boolean wiederholung = true;
		// While für die Erweiterung
		while (wiederholung) {
		
			int anzahlDateien = Integer.parseInt(JOptionPane.showInputDialog("Gib die Anzahl der Dateien ein: "));
			double groeßeinKB = 0;
		
		//** For-Schleife
			for (int i = 1; i <= anzahlDateien; i++) {
				double dateiGroeße = Double.parseDouble(JOptionPane.showInputDialog("Gib die Größe " + i + " in KB ein: "));
				groeßeinKB += dateiGroeße;
			}

			double groeßeinMB = groeßeinKB / 1000;
			double groeßeinGB = groeßeinMB / 1000;

			String ausgabe = String.format("Die Gesamtgröße der Dateien beträgt: \n%.2f KB\n%.2f MB\n%.2f GB", +groeßeinKB,
					groeßeinMB, groeßeinGB);
			JOptionPane.showMessageDialog(null, ausgabe);
		
		// Fragen ob wiederholt werden soll
		String wiederholen = JOptionPane.showInputDialog("Soll das Programm wiederholt werden?");
		
		if(wiederholen.equalsIgnoreCase("Nein")) {
			JOptionPane.showMessageDialog(null, "Das Programm wird beendet.");
			wiederholung = false;
		}
		}
	}
		
}
