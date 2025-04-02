package tag02_03_04_uebungen;

import javax.swing.JOptionPane;

public class _09_Fakultät {

	public static void main(String[] args) {
		
		//final int MIN_ZAHL = 0;
		//final int MAX_ZAHL = 10;
		
		int zahl = Integer.parseInt(JOptionPane.showInputDialog("Bitte gib eine Zahl zwischen 0 und 10 ein: "));
		
		if (zahl < 0) {
			JOptionPane.showMessageDialog(null, "Keine N");
		}else {
			int fakultaet = 1;
			for (int i=1; i<= zahl; i++) {
				fakultaet *= i;
			}
			JOptionPane.showMessageDialog(null, "Das Ergebnis von der Zahl " + zahl + "! ist: " + fakultaet);
		}
		
		
	}

}
