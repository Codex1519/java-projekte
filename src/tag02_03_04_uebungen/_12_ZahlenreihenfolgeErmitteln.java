package tag02_03_04_uebungen;

import javax.swing.JOptionPane;

public class _12_ZahlenreihenfolgeErmitteln {

	public static void main(String[] args) {
		
		int zahl1 = Integer.parseInt(JOptionPane.showInputDialog("Gib die erste Zahl ein: "));
		int zahl2 = Integer.parseInt(JOptionPane.showInputDialog("Gib die zweite Zahl ein: "));
		int zahl3 = Integer.parseInt(JOptionPane.showInputDialog("Gib die dritte Zahl ein: "));
		
		// position 
		
		int reihenfolge;
		
		if(zahl1 > zahl2) {
			reihenfolge = zahl1;
			zahl1 = zahl2; // Umtausch findet hier statt 
			zahl2 = reihenfolge;
		}
		if(zahl1 > zahl3) {
			reihenfolge = zahl1;
			zahl1 = zahl3;
			zahl3 = reihenfolge;
		}
		if(zahl2 > zahl3) {
			reihenfolge = zahl2;
			zahl2 = zahl3;
			zahl3 = reihenfolge;
		}
		
		String ausgabe = "Die Zahlen in aufsteigender Reihenfolge: " + zahl1 + zahl2 + zahl3;
		JOptionPane.showMessageDialog(null, ausgabe);
	}

}


