public class Challange {

	public static void main(String[] args) {
		// NullPointerException
		try {
			String zahl = null;
		
			zahl.length();
		}
		catch(Exception err) {
			err.printStackTrace();
		}
		
		// ClassCastException
		try {
			Object obj = new Object();

			int zahl = (int)obj;
		}
		catch(ClassCastException err) {
			err.printStackTrace();
		}
		
		// OutOfMemoryError
		try {
			int[] zahlarray = new int[Integer.MIN_VALUE -1];
		}
		catch (OutOfMemoryError err) {
			err.printStackTrace();
		}
	}

}
