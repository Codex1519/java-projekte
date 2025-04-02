package tag07_08_uebungen._07;

import javax.swing.JOptionPane;

public class Rechtecktest {

	public static void main(String[] args) {
		
		double eingabeLaenge = Double.parseDouble(JOptionPane.showInputDialog("Bitte Länge eingeben: "));
		double eingabeBreite = Double.parseDouble(JOptionPane.showInputDialog("Bitte die Breite eingeben: "));
		
		// Rechteck r1 = new Rechteck(
						//Double.parseDouble(JOptionPane.showInputDialog("Bitte länge eingeben: ")),
						//Double.parseDouble()JOptionPane.showInputDialog("Bitte Breite angeben: )));
		
		// Objekt Rechteck erstellen
		
		Rechteck rechteck = new Rechteck(eingabeLaenge,eingabeBreite);
		
		// Ausgabe
		
		System.out.println("Lange Seite: " + String.format("%.2f", rechteck.getLangeSeite()));
		System.out.println("Kurze Seite: " + String.format("%.2f", rechteck.getKurzeSeite()));
		System.out.println("Flaeche: " + String.format("%.2f", rechteck.getFlaeche()));
		System.out.println("Umfang: " + String.format("%.2f", rechteck.getUmfang()));
		System.out.println("Diagonale: " + String.format("%.2f", rechteck.getDiagonale()));
		
		// Aufgabe 03 Lokale Variable: Die lokale Variable der Methode laengeAusgeben überschattet die Instanzvariable und gibt den Wert der Variable der Methode an
		// also 5.4
		rechteck.laengeAusgeben();
		
		// Aufgabe 04 Klasse erweitern mit Methoden
		rechteck.laengeVergroessern(5);
		rechteck.breiteVergroessern(5);
		System.out.println("Länge nach Vergrößern: " + rechteck.getLaenge());
		System.out.println("Breite nach Vergrößern: " + rechteck.getBreite());
		
		rechteck.laengeVerkleinern(2);
		rechteck.breiteVerkleinern(2);
		System.out.println("Länge nach Verkleinern: " + rechteck.getLaenge());
		System.out.println("Breite nach Verkleinern: " + rechteck.getBreite());
	}

}
