package tag05_uebungen;

import javax.swing.JOptionPane;

public class _02_Zahlenraten {

    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Herzlich Willkommen zum Zahlenraten-Spiel! Viel Spaß beim Raten.");
        
        // Initialisiere Variablen, um die Anzahl der Versuche und den Spielstatus (gewonnen oder abgebrochen) zu verfolgen.
        final int MAX_VERSUCHE = 11;
        int loesung = 1 +(int) (Math.random()* 30);
        int versuche = 0;
        boolean gewonnen = false;
        boolean abgebrochen = false;
        
        
        while (versuche < MAX_VERSUCHE && !gewonnen && !abgebrochen) {
            versuche++;
            
            // Eingabe und Prüfung der Zahl
            int zahl = Integer.parseInt(JOptionPane.showInputDialog("Bitte gib deine Zahl ein: "));
            
            if (zahl < 1 || zahl > 30) {
                JOptionPane.showMessageDialog(null, "Gib bitte eine Zahl zwischen 1 und 30 ein.");
                continue; // Weiter zur nächsten Schleifeniteration
            }
            
            // Überprüfung ob richtige Zahl
            if (zahl == loesung) {
                JOptionPane.showMessageDialog(null, "Erfolgreich erraten!");
                gewonnen = true;
            } else {
                JOptionPane.showMessageDialog(null, "Leider nicht gewonnen.");

                // Tipp nach dem 5. Versuch
                if (versuche == 5) {
                    JOptionPane.showMessageDialog(null, "Tipp: Die Zahl liegt zwischen 1 und 30.");
                }
                
                // Nachfrage nach dem 10. Versuch Ja oder Nein ?
                if (versuche == 10) {
                    String abbrechen = JOptionPane.showInputDialog("Möchtest du abbrechen? (Ja/Nein)");
                    if (abbrechen != null && abbrechen.equalsIgnoreCase("Ja")) {
                        JOptionPane.showMessageDialog(null, "Spiel wird abgebrochen.");
                        abgebrochen = true;
                    }
                }
            }
        }

        // Spielende: Ausgabe, falls maximale Anzahl an Versuchen erreicht oder abgebrochen
        if (!gewonnen && versuche >= MAX_VERSUCHE) {
            JOptionPane.showMessageDialog(null, "Für deine Gesundheit wird das Spiel beendet.");
        } else if (!gewonnen && !abgebrochen) {
            JOptionPane.showMessageDialog(null, "Leider nicht gewonnen. Bis zum nächsten Mal.");
        }
    }
}

