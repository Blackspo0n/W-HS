import java.io.*;

public class Aufgabe29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "testinput.txt";
		
		System.out.println("Geben Sie einen Dateinam en zum Öffnen ein:");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String strTmp;
			strTmp = br.readLine();
			if(strTmp.length() != 0) fileName = strTmp;
			
		}
		catch(Exception err) {
			err.printStackTrace();
		}
		
		System.out.println("Nutzer hat " + fileName + " eingegeben");
		
		try {
			LineNumberReader fnr = new LineNumberReader(new FileReader(fileName));
			
			FileWriter fw = new FileWriter("testoutput.txt");
			
			String line;
			
			while((line = fnr.readLine()) != null) {
				fw.write(fnr.getLineNumber() + ": " + line + "\n");
			}
			
			
			System.out.print("Datei erfolgreich eingelesen.");
			
			fw.close();
			fnr.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Datei " + fileName + " wurde nicht gefunden\n");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
