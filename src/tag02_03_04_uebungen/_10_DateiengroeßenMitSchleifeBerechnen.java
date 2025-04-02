package tag02_03_04_uebungen;

import javax.swing.JOptionPane;

public class _10_DateiengroeßenMitSchleifeBerechnen {

	public static void main(String[] args) {
		
		
		double groeßeinKB = 0;
		int anzahlDateien = Integer.parseInt(JOptionPane.showInputDialog("Gib die Anzahl der Dateien ein: "));


		for (int i = 1; i <= anzahlDateien; i++) {
			double dateiGroeße = Double.parseDouble(JOptionPane.showInputDialog("Gib die Größe " + i + " in KB ein: "));
			groeßeinKB += dateiGroeße;
		}

		double groeßeinMB = groeßeinKB / 1000;
		double groeßeinGB = groeßeinMB / 1000;

		String ausgabe = String.format("Die Gesamtgröße der Dateien beträgt: \n%.2f KB\n%.2f MB\n%.2f GB", +groeßeinKB,
				groeßeinMB, groeßeinGB);
		JOptionPane.showMessageDialog(null, ausgabe);

	}

}
