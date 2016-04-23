package challenge;

import java.util.*;

/**
 * Die Klasse Bestellung
 * 
 * Die Bestellklasse enthält Informationen zum Zeitpunkt der Bestellung
 * und alle Bestellpositionen.
 * @author Mario Kellner <mario.kellner@studmail.w-hs.de>
 * @version 1.0
 */

public class Bestellung {
	
	/**
	 * Auto inkrementele Nummer zum Vergeben der Bestellnummer.
	 * 
	 * Wird pro angelegten Bestellung +1 gerechnet.
	 */
	protected static int benutzteNummern = 0;
	
	/**
	 * Die vergebene Bestellnummer
	 */
	protected int Bestellnummer;
	
	/**
	 * Das Datum der Bestellung als String
	 */
	protected String Datum;
	
	/**
	 * Status der Bestellung. Die Bestellung hat den Standardwert OFFEN,
	 * wenn nichts anderes angegeben worden ist.
	 */
	protected OderStatus Status;
	
	/**
	 * Liste mit den einzelnen Bestellpositionen der Bestellung
	 * 
	 */
	protected List<BestellPosition> Positionen;
	
	/**
	 * Erstellt ein neues Objekt der Klasse und initialisiert alle
	 * notwendigen Attribute.
	 */
	public Bestellung() {
		Bestellung.setBenutzteNummern(Bestellung.getBenutzteNummern()+1);
		this.setBestellnummer(Bestellung.getBenutzteNummern());
		
		Positionen = new LinkedList<BestellPosition>();
		Status = OderStatus.OFFEN;
	}

	/**
	 * Erstellt ein neues Objekt der Klasse und übergibt vordefinierte
	 * Werte an den Konstruktor
	 */
	public Bestellung(String datum, OderStatus status) {
		this();
		
		Datum = datum;
		Status = status;
	}
	
	public static int getBenutzteNummern() {
		return benutzteNummern;
	}

	public static void setBenutzteNummern(int benutzteNummern) {
		Bestellung.benutzteNummern = benutzteNummern;
	}

	public void addPosition(BestellPosition pos) {
		this.getPosition().add(pos);
	}

	public List<BestellPosition> getPosition() {
		return Positionen;
	}

	public void setPositionen(List<BestellPosition> positionen) {
		Positionen = positionen;
	}

	public int getBestellnummer() {
		return Bestellnummer;
	}

	private void setBestellnummer(int bestellnummer) {
		Bestellnummer = bestellnummer;
	}

	public String getDatum() {
		return Datum;
	}

	public void setDatum(String string) {
		Datum = string;
	}

	public OderStatus getStatus() {
		return Status;
	}

	public void setStatus(OderStatus status) {
		Status = status;
	}
}