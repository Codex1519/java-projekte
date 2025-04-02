package tag09_10_uebungen._02;

public class Girokontotest {
    public static void main(String[] args) {
        Girokonto gk = new Girokonto("0000000001", 10000, 1000);
        
        // Auszahlung, die innerhalb des Kreditlimits liegt
        gk.auszahlen(11000.0);
        System.out.println("Kontostand: " + gk.getKontostand());
        
        // Einzahlung
        gk.einzahlen(11000.0);
        
        // Auszahlung, die das Kreditlimit überschreiten würde
        gk.auszahlen(11001.0);
        System.out.println("Kontostand: " + gk.getKontostand());
    }
}
