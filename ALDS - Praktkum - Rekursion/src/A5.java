import java.awt.List;
import java.util.ArrayList;

public class A5 {

	public static void main(String[] args) {
		ArrayList<Long> rekursiveListe = new ArrayList<Long>();
		ArrayList<Long> iterativeListe = new ArrayList<Long>();
		
		long erg = 0;
		for( int i = 2; i <= 11; i++) {
			iterativeListe.add(potenzIterativ(i, 12));
			rekursiveListe.add(potenzRekursiv(i, 12));
		}
		System.out.println("Ausgabe der rekusiven Liste");
		for(long item: rekursiveListe) {
			System.out.println(item);
		}
		System.out.println("Ausgabe der iterative Liste");
		for(long item: iterativeListe) {
			System.out.println(item);
		}
	}
	
	static long potenzIterativ(int basis, int exponent) {
		long  ergebniss = 1;
		for(int i = 1; i <= exponent; i++) {
			ergebniss = ergebniss * basis;
		}
		
		return ergebniss;
	}
	
	static long potenzRekursiv(int basis, int exponent) {
		if(exponent != 0) {
			return basis * potenzRekursiv(basis, exponent-1);
		}
		return 1;
	}

}
