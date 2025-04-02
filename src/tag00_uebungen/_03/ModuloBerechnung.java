package tag00_uebungen._03;

import javax.swing.JOptionPane;

public class ModuloBerechnung {

	public static void main(String[] args) {
		
		// Aufgabe: Bestimme den Rest einer Division (Modulo-Berechnung)
		
		String ersteZahl1 = JOptionPane.showInputDialog(null, "Gib die erste Zahl ein: ");
		String zweiteZahl2 = JOptionPane.showInputDialog(null, "Gib die zweite Zahl ein: ");
		
		// String in int umwandeln
		int ersteZahl = Integer.parseInt(ersteZahl1);
		int zweiteZahl = Integer.parseInt(zweiteZahl2);
		
		// Berechnung Modulo
		
		int rest = ersteZahl % zweiteZahl;
		
		// Ergebnis anzeigen
		String ergebnis = "Modulo von " + ersteZahl + " und " + zweiteZahl +" ist " + rest;
		JOptionPane.showMessageDialog(null, ergebnis);
		
		

	}

}
