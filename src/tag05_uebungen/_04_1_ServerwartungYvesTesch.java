package tag05_uebungen;

import javax.swing.JOptionPane;

public class _04_1_ServerwartungYvesTesch {

	public static void main(String[] args) {
		int anzahlServer = Integer.parseInt(JOptionPane.showInputDialog(""
				+ "Gib die Anzahl der Server ein: "));
		
		
		serverWartung:
			for(int server = 1; server <= anzahlServer; server++) {
				JOptionPane.showMessageDialog(null, "Wartung für Server " + server + " beginnt.");
				
				for(int schrittNummer = 1; schrittNummer <= 3; schrittNummer++) {
					String schrittName = "";
					switch(schrittNummer) {
					case 1:
						schrittName = "Hardware-Check";
					case 2:
						schrittName = "Software-Check";
					case 3:
						schrittName = "Reboot";
					}
					serverphase:
					while(true) {
							String eingabe = JOptionPane.showInputDialog("Wartungsschritt " + schrittName 
									+ " für Server " + server + "\n"
									+ "1: Erfolgreich"
									+ "\n2: Schritt überspringen\n"
									+ "\n3: Wartung für diesen Server abbrechen");
							switch(eingabe) {
							case "1": // Erfolgreich
								JOptionPane.showMessageDialog(null, schrittName + 
										" erfolgreich für Server " + server);
								break serverphase;
							case "2": // Schritt übersprungen
								JOptionPane.showMessageDialog(null, schrittName + " wurde übersprungen.");
								break serverphase;
							case "3": // Wartung für diesen Server abbrechen
								JOptionPane.showMessageDialog(null, "Wartung für Server " + server 
										+ "wird abgebrochen.");
								continue serverWartung;
							default:
								JOptionPane.showMessageDialog(null, "Ungültige Eingabe, bitte erneut versuchen");
								continue;
							}
						}
				}
				JOptionPane.showMessageDialog(null, "Wartung für Server " + server + " abgeschlossen");
				
			}
			JOptionPane.showMessageDialog(null, "Programm abgeschlossen.");
	}
}
