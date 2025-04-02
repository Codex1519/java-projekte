package tag02_03_04_uebungen;

import javax.swing.JOptionPane;

public class _12_1_YvesTeschZahlenreihenfolgeErmitteln {

	public static void main(String[] args) {
		int zahl1 = Integer.parseInt(JOptionPane.showInputDialog("Gib die erste Zahl ein: "));
		int zahl2 = Integer.parseInt(JOptionPane.showInputDialog("Gib die zweite Zahl ein: "));
		int zahl3 = Integer.parseInt(JOptionPane.showInputDialog("Gib die dritte Zahl ein: "));
		
		
		int kleinste, mittlere, groesste;
		
		if(zahl1 <= zahl2 && zahl1 <= zahl3) {
			kleinste = zahl1;
			if(zahl2 <= zahl3) {
				mittlere = zahl2;
				groesste = zahl3;
			}else {
				mittlere = zahl3;
				groesste = zahl3;
			}
		}else if (zahl2 <= zahl1 && zahl2 <= zahl3) {
			kleinste = zahl2;
			if(zahl1 <= zahl2) {
				mittlere = zahl1;
				groesste = zahl3;
			}else {
				mittlere = zahl3;
				groesste = zahl1;
			}
		}else {
			kleinste = zahl3;
			if(zahl1 <= zahl2) {
				mittlere = zahl1;
				groesste = zahl2;
			}else {
				mittlere = zahl2;
				groesste = zahl1;
			}
		}
		JOptionPane.showMessageDialog(null, "Die Zahlen in aufsteigender Reihenfolge: " + kleinste + mittlere + groesste
				, "Sortierung", JOptionPane.INFORMATION_MESSAGE);
	}

}
