package Challenge;

import A6.Auftrag;
import A6.BasicIO;

public class Challenge {

	public static void main(String[] args) {
		System.out.println("Willkommen bei dem Nummern Ratespiel.");
		System.out.println("Bitte denken Sie sich jetzt eine Zahl aus,");
		System.out.println("Dieses Programm wird versuchen diese zu erraten");
		
		System.out.println("Ihre ausgedachte Zahl lautet: " + binsearch_rekursiv(1, 1000));
		
	}
	public static int binsearch_rekursiv(int start, int end) {
		int mittelWert = (start + end) /2;
		
		if(start+2 >= end) return start+1;

		System.out.println("Ist die gesuchte Zahl größer als " + mittelWert + "? (j/n):");
		boolean answer = false;
		
		if(BasicIO.read_char() == 'j') answer = true;
		/*if(auftraege[mittelWert].getAuftragsnummer() == auftragsnummer) {
			return  mittelWert;
		}*/
		if(answer) {
			return binsearch_rekursiv(mittelWert, end);
		}
		else {
			return binsearch_rekursiv( start, mittelWert);
		}
		
	}
}
