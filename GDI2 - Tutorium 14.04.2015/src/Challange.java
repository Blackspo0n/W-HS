import java.io.FileReader;
import java.io.IOException;

public class Challange {
	public static void main(String[] args) {
		int letter;
		
		try {
			FileReader fr = new FileReader("testdatei.txt");
			
			while((letter = fr.read()) !=-1) {
				System.out.print(Challange.RoT13Encryption((char)letter));
			}
			
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static char RoT13Encryption(char character) {
		if((character >= 65 && character <= 90) || (character >= 97 && character <= 122)) {
		
			int index = character +13;
			
			if(index > 90 && index < (90+13)) {
				index = 65 + (index-91);
			}
			
			if( index > 122) {
				index = 97 + (index-123);		
			}

			return (char)index;
		}
		
		return character;
	}
}