package tag05_uebungen;

import javax.swing.JOptionPane;

public class _04_ServerWartung {

	public static void main(String[] args) {
		int serverAnzahl = Integer.parseInt(JOptionPane.showInputDialog("Gib die Anzahl der Server ein: "));
		int gewartet = 0;
		
		for(int server = 1; server <= serverAnzahl; server++) {
			JOptionPane.showMessageDialog(null, "Wartung für " + server + " beginnt.");
			
			String schritte = JOptionPane.showInputDialog("Wartungschritt Hardwarecheck für Server: " + server + 
					"\n1:Erfolgreich\n2:Schritt Überspringen\n3:Wartung für diesen Server abbrechen");
			
			if(schritte == null) {
				JOptionPane.showMessageDialog(null, "Ungültige Eingabe.");
				continue;
			}else if(serverAnzahl == 0 && serverAnzahl < 0) {
				JOptionPane.showMessageDialog(null, "Gib mindestens einen Server ein: ");
			}
			if(schritte.equals("1")) {
				JOptionPane.showMessageDialog(null,"Hardware-Check erfolgreich für Server " + server +".");
				gewartet++;
			}else if(schritte.equals("2")) {
				JOptionPane.showMessageDialog(null, "Software-Update wurde übersprungen.");
			}else if(schritte.equals("3")) {
				JOptionPane.showMessageDialog(null, "Wartung für Server " + server + " wurde abgebrochen.");
				break;
			}
		if(gewartet == serverAnzahl) {
			JOptionPane.showMessageDialog(null, server + " Server erfolgreich gewartet.");
		}
		}
	}
}
