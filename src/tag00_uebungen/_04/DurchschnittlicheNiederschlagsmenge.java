package tag00_uebungen._04;

import javax.swing.JOptionPane;

public class DurchschnittlicheNiederschlagsmenge {

	public static void main(String[] args) {
		final int ANZAHL_MONATE = 3;
		
		String niederschlagApril = JOptionPane.showInputDialog(null, "Niederschlag für April in l/qm eingeben: ");
		String niederschlagMai = JOptionPane.showInputDialog(null, "Niederschlag für Mai in l/qm eingeben: ");
		String niederschlagJuni = JOptionPane.showInputDialog(null, "Niederschlag für Juni in l/qm eingeben: ");
		
		double april = Double.parseDouble(niederschlagApril);
		double mai = Double.parseDouble(niederschlagMai);
		double juni = Double.parseDouble(niederschlagJuni);
		
		// Berechnung des Durchschnitts
		double durchschnitt = (april + mai + juni)/ ANZAHL_MONATE;
		
		// Ergebnisausgabe
		
		String ergebnis = "Niederschlagsmenge für April ist : " + april + " l/qm\n"
				+ "Niederschlagsmenge für Mai ist: " + mai + " l/qm\n"
				+ "Niederschlagsmenge für Juni ist: " + juni + " l/qm\n"
				+ " Durchschnittliche Niederschlagsmenge ist: " + String.format("%.2f", durchschnitt) + " l/qm";
				JOptionPane.showMessageDialog(null, ergebnis);
		

	}

}
