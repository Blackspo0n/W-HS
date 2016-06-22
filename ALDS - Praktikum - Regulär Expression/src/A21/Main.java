package A21;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.*;

public class Main {

	public static void main(String[] args) {
		String file = getOutputFile();
		String text = getSearchTerm();
		ArrayList<String> textlines = readFile(file);
		int occurs = 0;
		
		for(String line : textlines) {
			occurs += regExZumWarmwerden(line, text);
		}

		System.out.println(textlines.size() + " Zeilen gelesen.");
		System.out.println(text + " wurde " + occurs + " mal gefunden");
		
	}
	
	private static String getSearchTerm() {
		System.out.println("Bitte geben Sie ein SuchTerm an:");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String strTmp = "";
		
		try {
			strTmp = br.readLine();	
		}
		catch(Exception err) {
			err.printStackTrace();
			System.out.println("use default filename");
		}
		
		if(strTmp.length() == 0) {
			return getSearchTerm();
		}
		return strTmp;
		
	}

	
	private static ArrayList<String> readFile(String file) {
		ArrayList<String> lines = new ArrayList<String>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			String readLine = "";
			
			while((readLine = br.readLine()) != null) {
				lines.add(readLine);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lines;
	}
	
	static int regExZumWarmwerden(String suchText, String pattern) {
		Pattern ptrn = Pattern.compile(pattern);
		Matcher mtchr = ptrn.matcher(suchText);
		
		int counter = 0;
		
		while(mtchr.find()) {
			counter++;
			System.out.print("Vorkommen: " + mtchr.group());
			System.out.println(" " + mtchr.start() + "-" + mtchr.end());
		}
		
		return counter;
	}

	public static String getOutputFile() {
		String fileName = "Die_Bibel_in_der_Martin_Luther_Uebersetzung_1912.txt";
		
		System.out.println("Bitte geben Sie die Datei zum Öffnen:");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String strTmp;
			strTmp = br.readLine();
			if(strTmp.length() != 0) fileName = strTmp;
			
		}
		catch(Exception err) {
			err.printStackTrace();
			System.out.println("use default filename");
		}
		
		return fileName;
	}
}
