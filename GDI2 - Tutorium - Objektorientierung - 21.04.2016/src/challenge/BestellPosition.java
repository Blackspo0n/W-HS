package challenge;
/**
 * Die Klasse Bestellposition
 * 
 * Diese Klasse wird in der Bestellung als Position verwendet
 * und beinhaltet eine Referenz zum Artikel und der bestellten Anzahl
 * 
 * @author Mario Kellner <mario.kellner@studmail.w-hs.de>
 * @version 1.0
 */
public class BestellPosition {
	
	/**
	 * Die Anzahl desd bestellten Artikels
	 */
	protected int Anzahl;
	
	/**
	 * Der bestellte Artikel
	 */
	protected Artikel Artikel;
	
	/**
	 * Erstellt ein neues Objekt der Klasse und initialisiert alle
	 * notwendigen Attribute.
	 */
	public BestellPosition() {
	
	}

	/**
	 * Erstellt ein neues Objekt der Klasse und übergibt vordefinierte
	 * Werte an den Konstruktor
	 */
	public BestellPosition(int anzahl, Artikel artikel) {
		this();
		
		Anzahl = anzahl;
		Artikel = artikel;
	}

	public Artikel getArtikel() {
		return Artikel;
	}

	public void setArtikel(Artikel artikel) {
		Artikel = artikel;
	}

	public int getAnzahl() {
		return Anzahl;
	}

	public void setAnzahl(int anzahl) {
		Anzahl = anzahl;
	}
}