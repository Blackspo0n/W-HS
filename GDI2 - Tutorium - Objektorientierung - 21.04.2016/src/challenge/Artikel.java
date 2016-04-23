package challenge;

/**
 * Die Klasse Artikel
 * 
 * Die Artikelklasse Artikel enthält Lagerbestand und Artikelbennnung. 
 * Wird in der Bestellposition verwendet, um eine bestellung zu generieren.
 * 
 * @author Mario Kellner <mario.kellner@studmail.w-hs.de>
 * @version 1.0
 */
public class Artikel {
	
	/**
	 * Auto inkrementelle Nummer zum Vergeben der Artikelnummer.
	 * 
	 * Wird pro angelegten Artikel +1 gerechnet.
	 */
	protected static int benutzteNummern = 0;
	
	/**
	 * Die errechnete Artikelnummer
	 */
	protected int Artikelnummer;
	
	/**
	 * Der verfügbare Lagerbestand
	 */
	protected int Lagerbestand;
	
	/**
	 * Die Artikelbezeichnung
	 */
	protected String Bezeichnung;
	
	/**
	 * Erstellt ein neues Objekt der Klasse und initialisiert alle
	 * notwendigen Attribute.
	 */
	public Artikel() {
		Artikel.setBenutzteNummern(Artikel.getBenutzteNummern()+1);
		this.setArtikelnummer(Artikel.getBenutzteNummern());
	}

	/**
	 * Erstellt ein neues Objekt der Klasse und übergibt vordefinierte
	 * Werte an den Konstruktor
	 */
	public Artikel(int lagerbestand, String bezeichnung) {
		this();
		
		Lagerbestand = lagerbestand;
		Bezeichnung = bezeichnung;
	}
	
	/**
	 * Überprüft ob durch eine Bestellung der Lagerbestand erschöpft wird.
	 * 
	 * @param BestellMenge
	 * @return 0, wenn Lagerbestand vorhanden, > 0, wenn noch Nachbestellt werden muss
	 */
	public int berechneFehlmenge(int BestellMenge) {
		if(this.getLagerbestand() - BestellMenge <= 0) {
			return (this.getLagerbestand() - BestellMenge)*(-1);
		}
		return 0;
	}

	public static int getBenutzteNummern() {
		return benutzteNummern;
	}

	public static void setBenutzteNummern(int benutzeNummern) {
		Artikel.benutzteNummern = benutzeNummern;
	}

	public int getArtikelnummer() {
		return Artikelnummer;
	}

	private void setArtikelnummer(int artikelnummer) {
		Artikelnummer = artikelnummer;
	}

	public int getLagerbestand() {
		return Lagerbestand;
	}

	public void setLagerbestand(int lagerbestand) {
		Lagerbestand = lagerbestand;
	}

	public String getBezeichnung() {
		return Bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		Bezeichnung = bezeichnung;
	}
}