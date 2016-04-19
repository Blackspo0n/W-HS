/**
 * 
 */
package whs.gdi2.WDProgramm.AbstractClasses;
/**
 * @author student
 *
 */
public abstract class Immobilie implements Comparable<Immobilie> {
	public String Adresse;
	public int grundstuecksGroesse;
	public int wohnFlaeche;
	public double preisProQM;
	public double kaufPreis;
	
	public Immobilie() {
	
	}
	
	public Immobilie(String Adresse, int grundstuecksGroesse, int wohnFlaeche, double preisProQM, double kaufPreis) {
		setAdresse(Adresse);
		setGrundstuecksGroesse(grundstuecksGroesse);
		setWohnFlaeche(wohnFlaeche);
		setPreisProQM(preisProQM);
		setKaufPreis(kaufPreis);
	}
	public int compareTo(Immobilie arg0) {
		return 0;
		
	}
	
	public static Comparable<Immobilie>[] bestChoice (Comparable<Immobilie> [] angebote) {
		return angebote;
	}

	public String getAdresse() {
		return Adresse;
	}
	
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	
	public int getGrundstuecksGroesse() {
		return grundstuecksGroesse;
	}
	
	public void setGrundstuecksGroesse(int grundstuecksGroesse) {
		this.grundstuecksGroesse = grundstuecksGroesse;
	}
	
	public int getWohnFlaeche() {
		return wohnFlaeche;
	}
	
	public void setWohnFlaeche(int wohnFlaeche) {
		this.wohnFlaeche = wohnFlaeche;
	}
	
	public double getPreisProQM() {
		return preisProQM;
	}
	
	public void setPreisProQM(double preisProQM) {
		this.preisProQM = preisProQM;
	}
	
	public double getKaufPreis() {
		return kaufPreis;
	}
	
	public void setKaufPreis(double kaufPreis) {
		this.kaufPreis = kaufPreis;
	}
}
