package A8;
import javax.print.attribute.HashAttributeSet;

public class HashTabelle {
	protected static Auftrag[] hashTabelle = new Auftrag[100];
	
	public static int getHashIndex(Auftrag[] auftraege, int auftragsnummer) {
		return auftragsnummer % auftraege.length;
	}
	
	public static boolean insertIntoHashTable(Auftrag[] auftraege, Auftrag auftrag) {
		int start = getHashIndex(auftraege, auftrag.getAuftragsnummer());
		boolean searching = true;
		
		int counter = start;
		while(searching == true) {
			if(auftraege[counter] == null) {
				auftraege[counter] = auftrag;
				return true;
			}
			counter++;
			if(counter == 100) counter = 0;
			if(counter == start) break;
			
		}
		
		return false;
	}
	
	public static Auftrag getFromHashTable(Auftrag[] auftraege, int auftragsnummer) {
		int start = getHashIndex(auftraege, auftragsnummer);
		int counter = start;
		while(true) {
			if(auftraege[counter] != null && auftraege[counter].getAuftragsnummer() == auftragsnummer) {
				return auftraege[counter];
			}
			counter++;
			if(counter == 100) counter = 0;
			if(counter == start) break;
			
		}
		return null;
	}
}
