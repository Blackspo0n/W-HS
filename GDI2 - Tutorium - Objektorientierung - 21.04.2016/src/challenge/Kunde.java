package challenge;

import java.util.*;

/**
 * Die Kunden Klasse
 * 
 * Die Kundenklasse enthält alle vom Kunden aufgegebenen Bestellungen
 * sowie den Namen und die automatisch berechnete Kundennummer
 * 
 * @author Mario Kellner <mario.kellner@studmail.w-hs.de>
 * @version 1.0
 */
public class Kunde {
	
	/**
	 * Auto inkrementele Nummer zum Vergeben der Kundennummer.
	 * 
	 * Wird pro angelegten Kunden +1 gerechnet.
	 */
	protected static int benutzteNummern = 0;
	
	/**
	 * Nachname des Kunden
	 */
	protected String Name;
	
	/**
	 * Vorname des Kunden
	 */
	protected String Vorname;
	
	/**
	 * die vergebene Kundennummer des Kunden
	 */
	protected int Kundennummer = 0;
	
	/**
	 * Liste aller Bestellungen die der Kunde aufgegeben hat.
	 */
	protected List<Bestellung> Bestellungen;
	
	/**
	 * Initialisiert ein neues Kunden Objekt
	 */
	public Kunde() {

		Kunde.benutzteNummern += 1;
		this.setKundennummer(Kunde.getBenutzteNummern());
		Bestellungen = new LinkedList<Bestellung>();
	}

	/**
	 * Initialisiert ein neues Kunden Objekt mit Vor. und Nachname
	 * 
	 * @param name
	 * @param vorname
	 */
	public Kunde(String name, String vorname) {
		this();
		
		Name = name;
		Vorname = vorname;
	}
	
	/**
	 * Überprüft, ob der Kunde alle nötigen Angaben gemacht hat
	 * 
	 * @return
	 */
	protected boolean checkKunde() {
		if(this.getName().length() == 0 ||
		   this.getVorname().length() == 0 ||
		   this.getKundennummer() == 0) return false;
		return true;
	}
	
	/**
	 * Gibt alle offenen Bestellungen und deren Bestellpositionen auf die Konsole aus.
	 */
	public void druckeAlleOffenenBestellungen() {
		System.out.println("Bestellung mit dem Status OFFEN von " + this.getVorname() + " " + this.getName());
		for (Bestellung bestellung : this.getBestellungen()) {
			if(bestellung.Status == OderStatus.OFFEN) {
				System.out.print("Bestellnummer:" + bestellung.getBestellnummer() + "\t");
				System.out.print("Datum: " + bestellung.getDatum() + "\n\nVorhandene Artikel: \n");
				
				for(BestellPosition bestp : bestellung.getPosition()) {
					System.out.print("Artikel: " + bestp.getArtikel().getArtikelnummer() +
							" - " + bestp.getArtikel().getBezeichnung() +
							" | bestellte Anzahl: " + bestp.getAnzahl() + " | Lagerbestand: " + bestp.getArtikel().getLagerbestand()
					);
					
					if(bestp.getArtikel().berechneFehlmenge(bestp.getAnzahl()) == 0) {
						System.out.print("(Artikel ist noch in geeigneter Menge vorrätig) \n");
					}
					else {
						System.out.print("(Artikel muss noch mindestens " + bestp.getArtikel().berechneFehlmenge(bestp.getAnzahl())  + " mal bestellt werden)\n");
						
					}
				}
			}
		}
		System.out.println();
	}
	
	public static int getBenutzteNummern() {
		return benutzteNummern;
	}

	public static void setBenutzteNummern(int benutzteNummern) {
		Kunde.benutzteNummern = benutzteNummern;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getVorname() {
		return Vorname;
	}

	public void setVorname(String vorname) {
		Vorname = vorname;
	}

	public int getKundennummer() {
		return Kundennummer;
	}

	private void setKundennummer(int kundennummer) {
		Kundennummer = kundennummer;
	}
	public List<Bestellung> getBestellungen() {
		return Bestellungen;
	}
	
	public void addBestellung(Bestellung best){
		this.getBestellungen().add(best);
	}
	
	public void setBestellungen(List<Bestellung> bestellungen) {
		Bestellungen = bestellungen;
	}
}