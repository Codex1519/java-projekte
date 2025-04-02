package tag02_03_04_uebungen;

import javax.swing.JOptionPane;

public class _02_DateigroeßeValidierenundUmrechnen {

	public static void main(String[] args) {
		
		double kilobyte = Double.parseDouble(JOptionPane.showInputDialog("Gib die Kilobyte ein: "));
		
		if(kilobyte < 0) {
			JOptionPane.showMessageDialog(null, "Fehler: Bitte keine negatAiven Werte eingeben");
		}else {
			double megabyte = kilobyte / 1000;
			double bytes = kilobyte * 1000;
		
		
			JOptionPane.showMessageDialog(null,
					String.format("%.2f KB sind %.2f MB und %.2f Bytes.",kilobyte, megabyte, bytes));
		}
	}
}


