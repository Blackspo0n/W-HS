public class A28 {
	public static void main(String[] args) {
		Object[] feld = new Object[255];
		
		System.out.println(A28.array_length(feld));
		
	}
	public static int array_length(Object[] feld) {
		int anzahl = 0;
		try {
			Object temp;
			while (true) {
				temp = feld[anzahl];
				anzahl++;
			}
		}
		catch (Exception e) {
			return anzahl;
		}
	}
}