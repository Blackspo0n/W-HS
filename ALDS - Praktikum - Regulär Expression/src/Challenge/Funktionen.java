package Challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Funktionen
{
    public static String quelltextAuslesen(String url)
    {
        String quelltext=null;
        String inputLine;
        int zeile=1;

        // URL - Eingabe
        // Ggf. fehlende Teile ("www" oder "http://" werden ergänzt

        if (!url.startsWith("http://"))
            if (!url.startsWith("www."))
                url="http://www.".concat(url);
            else
                url="http://".concat(url);

        // Aus dem String wird ein URL-Objekt erstellt
        URL website=null;
        try
        {
            website=new URL(url);

        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }

        // Der Quelltext der Webseite wird ausgelesen

        BufferedReader in=null;

        try
        {
            in=new BufferedReader(new InputStreamReader(website.openStream()));

            while ((inputLine=in.readLine())!=null)
            {
                quelltext+=(zeile+"\t"+inputLine+"\n");
                zeile++;
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return quelltext;
    }

    static void hyperlinksSuchen(String searchString, String pattern) {
        String AusgabeFrame = "";
    	Pattern pttrn = Pattern.compile("\\<a[^\\>]*\\>(.*?)\\</a\\>");
    	String[] lines = searchString.split("\n");
    	
    	for(int i = 0; i < lines.length;i++) {
    		Matcher mtchr = pttrn.matcher(lines[i]);
    		
    		while(mtchr.find()) {
    			AusgabeFrame += "Hyperlink gefunden in Ziele: " + (i+1) + " an Position: " + mtchr.start() + "-" + mtchr.end() + "\n";
    			AusgabeFrame += mtchr.group() + "\n\n";
    		}
    	}
    	
    	Ausgabe as = new Ausgabe(600, 400, "Ausgabe");
	    as.meineAusgabe(AusgabeFrame);
    }
}