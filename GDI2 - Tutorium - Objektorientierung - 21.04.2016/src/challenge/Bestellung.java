package challenge;

import java.util.*;

public class Bestellung {
	protected static int benutzteNummern = 0;
	protected int Bestellnummer;
	protected String Datum;
	protected OderStatus Status;
	protected List<BestellPosition> Positionen;
	
	public Bestellung() {
		Bestellung.setBenutzteNummern(Bestellung.getBenutzteNummern()+1);
		this.setBestellnummer(Bestellung.getBenutzteNummern());
		
		Positionen = new LinkedList<BestellPosition>();
		Status = OderStatus.OFFEN;
	}
	
	public Bestellung(String datum, OderStatus status) {
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
