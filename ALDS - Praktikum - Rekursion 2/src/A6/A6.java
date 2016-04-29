package A6;

public class A6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Wie viele Auftr�ge wollen Sie erstellen?");
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
				System.out.println("Geben Sie eine Auftragsnummer f�r den Auftrag " +(i+1) + " ein:");
				nummer = BasicIO.read_int();
			}
			auftragsliste[i] = new Auftrag(nummer);
		}
		System.out.println("\nGeben Sie nun eine Auftragsnummer ein, die Sie suchen m�chten:");
		
		int searchPosition = BasicIO.read_int();
		
		System.out.println("linsearch_iterativ position: " + linsearch_iterativ(auftragsliste, searchPosition));
		System.out.println("linsearch_rekursiv position: " + linsearch_rekursiv(auftragsliste, searchPosition));
		
	}
	

	public static int linsearch_iterativ(Auftrag[] auftr�ge, int auftragsnummer) {
		int pos = 0;
		for(Auftrag auft : auftr�ge) {
			if(auft.getAuftragsnummer() == auftragsnummer) return pos;
			pos++;
		}
		return -1;
	}

	public static int linsearch_rekursiv(Auftrag[] auftr�ge, int auftragsnummer) {
		return linsearch_rekursiv(auftr�ge, auftragsnummer, 0);
		
	}

	public static int linsearch_rekursiv(Auftrag[] auftr�ge, int auftragsnummer, int pos) {
		if(auftr�ge[pos].getAuftragsnummer() == auftragsnummer) {
			return pos;
		}
		if(auftr�ge.length <= pos) {
			return  -1;
		}
		return linsearch_rekursiv(auftr�ge, auftragsnummer, pos+1);
	}
	
}
