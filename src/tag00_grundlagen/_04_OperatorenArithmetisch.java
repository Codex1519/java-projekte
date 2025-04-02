package tag00_grundlagen;

public class _04_OperatorenArithmetisch {

	public static void main(String[] args) {
		// Was ist ein Operator ? 
		// z.B. arithmetische Operatoren (+, -, *, / usw ...)
		// Was ist ein Operand ?
		// Ein Operand ist an einem Ausdruck beteiligt und stellt die linke bzw. rechte Seite einer
		// Operation da, z.B. 5 + 8, 5 und 8 sind die Operanden und + der Operator
		
		int zahl1 = 10;
		int zahl2 = 5;
		int zahl3 = 7;
		int ergebnis = 0;
		
		// Arithmetische Operatoren
		ergebnis = zahl1 + zahl2;
		
		ergebnis = zahl1 - zahl2;
		ergebnis = zahl1 / zahl2;
		// Wenn man Ganzzahldivisionen macht, muss man wissen, dass der Nachkommaanteil abgeschnitten wird.
		// Möchte man diesen behalten, sollte man das ganze als float oder double speichern.
		ergebnis = zahl1 * zahl2;
		ergebnis = zahl3 % zahl2; // 2
		
		// Arithmetische Operatoren mit einem Operand
		// Inkrement - Operator erhöht Variable erhöht um 1
		zahl1++; // Postinkrement - Operator (Post = danach)
		++zahl1; // Präinkrement - Operator (Prä = davor) 
		
		// Dekrement - Operator verringert eine Variable um 1
		zahl2--; // Postdekrement - Operator
		--zahl2; // Prädekrement - Operator
		
		

	}

}
