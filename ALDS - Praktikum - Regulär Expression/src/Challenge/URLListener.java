package Challenge;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Listener für die Buttons

public class URLListener implements ActionListener
{
	private EingabeGUI	url;
	
	public URLListener ( EingabeGUI url )
	{
		this.url=url;
	}
	
	public void actionPerformed (ActionEvent event)
	{		
		switch (event.getActionCommand())
		{
			case "AUSFÜHREN":
			    url.getFr_URL().dispose();
			    String website = url.getTf_URL().getText();
			    String quelltext = Funktionen.quelltextAuslesen (website);
			    System.out.println(quelltext);	
			    Funktionen.hyperlinksSuchen(quelltext, "Da muss was anderes hin!");
			    
			    break;
			case "ZURÜCKSETZEN":
				this.url.getTf_URL().setText(null);
		}
	}	
}