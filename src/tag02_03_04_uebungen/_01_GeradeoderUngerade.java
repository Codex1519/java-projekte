package tag02_03_04_uebungen;

import javax.swing.JOptionPane;

public class _01_GeradeoderUngerade {

	public static void main(String[] args) {
		
		// Eingabe
		int zahl = Integer.parseInt(JOptionPane.showInputDialog("Gib eine Zahl ein: "));
		
		if(zahl % 2 == 0) {
			JOptionPane.showMessageDialog(null, zahl + " ist eine gerade Zahl.");
			
		}else {
			JOptionPane.showMessageDialog(null, zahl + " ist eine ungerade Zahl.");
		}
	}
}