package A7;

import A6.Auftrag;
import A6.BasicIO;

public class A7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Wie viele Aufträge wollen Sie erstellen?");
		int countTasks = BasicIO.read_int();
		

		Auftrag[] auftragsliste = new Auftrag[countTasks];
		
		System.out.println("Wollen Sie die Auftragsnummern generieren? (j/n):");
		boolean gen;
		if(BasicIO.read_char() == 'j') gen = true;
		else gen = false;
		
		for(int i= 0; i < auftragsliste.length;i++) {
			int nummer;
			if(gen) nummer = i;
			else {
				System.out.println("Geben Sie eine Auftragsnummer für den Auftrag " +(i+1) + " ein:");
				nummer = BasicIO.read_int();
			}
			auftragsliste[i] = new Auftrag(nummer);
		}
		System.out.println("\nGeben Sie nun eine Auftragsnummer ein, die Sie suchen möchten:");
		
		int searchPosition = BasicIO.read_int();
		
		System.out.println("binsearch_iterativ position: " + binsearch_iterativ(auftragsliste, searchPosition));
		System.out.println("binsearch_rekursiv position: " + binsearch_rekursiv(auftragsliste, searchPosition));
		
	}
	
	
	public static int binsearch_iterativ(Auftrag[] auftraege, int auftragsnummer) {
		int start = 0;
		int end = auftraege.length;
		int mittelWert;
		
		do {
			
			mittelWert = (start+end)/2;
			
			if(auftraege[mittelWert].getAuftragsnummer() > auftragsnummer) {
				end = mittelWert;
			}
			else if(auftraege[mittelWert].getAuftragsnummer() < auftragsnummer)  {
				start = mittelWert;
			}
			
			if(auftraege[mittelWert].getAuftragsnummer() == auftragsnummer)  {
				return mittelWert;
			}
			
		} while (start+1 < end);
		
		return -1;
		
	}
	
	public static int binsearch_rekursiv(Auftrag[] auftraege, int auftragsnummer) {
		return binsearch_rekursiv(auftraege, auftragsnummer, 0, auftraege.length);
	}
	
	public static int binsearch_rekursiv(Auftrag[] auftraege, int auftragsnummer, int start, int end) {
		int mittelWert = (start + end) /2;
		if(start+1 >= end) return -1;
		
		if(auftraege[mittelWert].getAuftragsnummer() == auftragsnummer) {
			return  mittelWert;
		}
		else if(auftraege[mittelWert].getAuftragsnummer() < auftragsnummer) {
			return binsearch_rekursiv(auftraege, auftragsnummer, mittelWert, end);
		}
		else {
			return binsearch_rekursiv(auftraege, auftragsnummer, start, mittelWert);
		}
		
	}
}
