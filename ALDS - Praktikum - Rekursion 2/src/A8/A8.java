package A8;

import A6.BasicIO;

public class A8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auftrag[] hashTabelle = new Auftrag[100];

		
		System.out.println("Wollen Sie die Auftragsnummern generieren? (j/n):");
		boolean gen;
		if(BasicIO.read_char() == 'j') gen = true;
		else gen = false;
		
		for(int i= 0; i < hashTabelle.length;i++) {
			hashTabelle[i] = new Auftrag(i);
		}
		System.out.println("\nGeben Sie nun eine Auftragsnummer ein, die Sie suchen möchten:");
		
		int searchPosition = BasicIO.read_int();
		
		System.out.println("getFromHashTable: " + HashTabelle.getFromHashTable(hashTabelle, searchPosition));
		
	}
}
