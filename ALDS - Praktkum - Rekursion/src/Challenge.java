
public class Challenge {
	public static void main(String[] args) {
		int erg = 0;
		long start = System.currentTimeMillis();
		erg = fibRekursiv(50);
		
		System.out.println("Das Ergebnis: " + erg + " Die benötigte Zeit beträgt: " + (System.currentTimeMillis()- start) + " Sekunden");
	}
	
	static int fibRekursiv(int Jahre) {
		
		if(Jahre <=1) { 
			return Jahre;
		}
		
		return fibRekursiv(Jahre-1) + fibRekursiv(Jahre-2);
	}
	
	static int fbiterativ(int Jahre) {
		int hasen = 0;
		int tmp1 = 0;
		int tmp2 = 1;
		
		if(Jahre <= 1) return Jahre;
		
		for(int i = 2 ; i <= Jahre; i++) {
			hasen = tmp1 + tmp2;
			tmp1 = tmp2;
			tmp2 = hasen;
		}
		
		return hasen;
	}
}