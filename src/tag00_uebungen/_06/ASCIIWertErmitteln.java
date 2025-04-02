package tag00_uebungen._06;

import javax.swing.JOptionPane;

public class ASCIIWertErmitteln {

	public static void main(String[] args) {
		// 1. Frage den Nutzer nach dem ersten Zeichen
        String eingabe1 = JOptionPane.showInputDialog(null, "Gib das erste Zeichen ein:");
        char zeichen1 = eingabe1.charAt(0);

        // 2. Frage den Nutzer nach dem zweiten Zeichen
        String eingabe2 = JOptionPane.showInputDialog(null, "Gib das zweite Zeichen ein:");
        char zeichen2 = eingabe2.charAt(0);

        // 3. Wandle beide Zeichen in ihre ASCII-Werte um
        int asciiWert1 = (int) zeichen1;
        int asciiWert2 = (int) zeichen2;

        // 4. Berechne die Summe der beiden ASCII-Werte
        int summe = asciiWert1 + asciiWert2;

        // 5. Zeige die Summe der ASCII-Werte an
        String ergebnis = "Der ASCII-Wert von " + zeichen1 + " ist " + asciiWert1 + "\n"
                        + "Der ASCII-Wert von " + zeichen2 + " ist " + asciiWert2 + "\n"
                        + "Die Summe der ASCII-Werte ist " + summe;
        
        JOptionPane.showMessageDialog(null, ergebnis, "Meldung", JOptionPane.INFORMATION_MESSAGE);

	}

}
