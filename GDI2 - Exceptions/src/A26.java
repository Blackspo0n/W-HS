public class A26 {
	public static void main(String[] args) {
		double kehrwert;
		for(int i = -5; i <= 5;i++) {
			try {
				kehrwert = 1/i;
				System.out.println(kehrwert);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.println(e.toString());
				e.printStackTrace();
				// TODO Auto-generated method stub
			}
		}
	}
}