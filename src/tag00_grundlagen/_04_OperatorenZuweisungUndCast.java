package tag00_grundlagen;

public class _04_OperatorenZuweisungUndCast {
	
	public static void main(String[] args) {
	// Der Zuweisungsoperator ist das Gleichheitszeichen = 
	// Beachtete werden muss, dass der Wert rechts des Gleichheitszeichens in den Datentyp der Variable links
	// passen muss.
	// Kleinere Datentypen passen immer in größere Datentypen, ohne das sich der Compiler beschwert
	
	// Implizierte Typumwandlung
	byte myByte = 127;
	int myInt = myByte; // implizierter Cast, weil nicht aktiv durch den Entwickler durchgeführt wird
	
	float myFloat = 22.5F;
	double myDouble = myFloat; // auch implizierter Cast
	
	// Nicht direkt erlaubt ist der Cast von einem größeren Datentyp in ein kleineren Datentyp
	int myInt2 = 127;
	//byte myByte2 = myInt2;
	
	// Explizite Typumwandlung
	int i = 200;
	byte b = (byte)i;
	
	System.out.println(b);
	
	double d = 9.99;
	int num  = (int)d;
	
	System.out.println(num);
	
	// Kombinierte Zuweisungsoperatoren
	// Bei Berechnung, nach folgendem Schema zahl = zahl + 1, oder zahl = zahl - 2 usw...
	// Kann man folgendes verwenden: 
	int zahl = 5;
	zahl += 2;
	zahl -= 1;
	zahl *= 3;
	zahl /= 2;
	zahl %= 3;
	
	System.out.println(zahl);
	
		

	}

}
