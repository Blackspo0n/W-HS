import java.util.regex.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		regExZumWarmwerden("abrakadabrasimsalabim", "ab");

	}
	
	static void regExZumWarmwerden(String suchText, String pattern) {
		Pattern ptrn = Pattern.compile(pattern);
		Matcher mtchr = ptrn.matcher(suchText);
		
		while(mtchr.find()) {
			System.out.println("Vorkommen: " + mtchr.group());
			System.out.println("\tStartposition des Vorkommens: " + mtchr.start());
			System.out.println("\tEndposition des Vorkommens: " + mtchr.end());
		}
	}

}
