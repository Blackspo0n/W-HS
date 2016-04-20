import java.io.*;

public class Aufgabe30 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			FileInputStream fin1 = new FileInputStream("input1.txt");  
			FileInputStream fin2 = new FileInputStream("input2.txt");

			SequenceInputStream sis = new SequenceInputStream(fin1,fin2);  
			
			FileOutputStream fos = new FileOutputStream("testoutput.txt");
			
			int read;
			while((read = sis.read()) != -1) {
				fos.write(read);
				System.out.print((char)read);
			}
			
			fos.close();
			sis.close();
			fin2.close();
			
			System.out.println("Daten erfolgreich verbunden");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}
}
