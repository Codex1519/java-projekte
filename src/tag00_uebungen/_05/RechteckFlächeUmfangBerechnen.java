package tag00_uebungen._05;

import javax.swing.JOptionPane;

public class RechteckFlächeUmfangBerechnen {

	public static void main(String[] args) {
		
		// Eingabe der Länge, Breite und Maßeinheit
        String laengeString = JOptionPane.showInputDialog(null, "Bitte geben Sie die Länge ein:");
        String breiteString = JOptionPane.showInputDialog(null, "Bitte geben Sie die Breite ein:");
        String masseinheit = JOptionPane.showInputDialog(null, "Bitte geben Sie die Maßeinheit an:");

        // Umwandlung der Eingaben in double für die Berechnung
        double laenge = Double.parseDouble(laengeString);
        double breite = Double.parseDouble(breiteString);

        // Berechnung von Umfang und Fläche
        double umfang = 2 * laenge + 2 * breite;
        double flaeche = laenge * breite;

        // Ausgabe der Ergebnisse mit den Berechnungen
        String ergebnis = "Die eingegebene Länge beträgt: " + laenge + masseinheit + "\n"
                        + "Die eingegebene Breite beträgt: " + breite + masseinheit + "\n\n"
                        + "Der Umfang beträgt: " + umfang + masseinheit + "\n"
                        + "Die Fläche beträgt: " + flaeche + masseinheit + "²";
        
        JOptionPane.showMessageDialog(null, ergebnis);

	}

}
