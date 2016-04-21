package challenge;

public class Artikel {
	protected static int benutzteNummern = 0;
	protected int Artikelnummer;
	protected int Lagerbestand;
	protected String Bezeichnung;
	
	public Artikel() {
		Artikel.setBenutzteNummern(Artikel.getBenutzteNummern()+1);
		this.setArtikelnummer(Artikel.getBenutzteNummern());
	}
	
	public Artikel(int lagerbestand, String bezeichnung) {
		this();
		
		Lagerbestand = lagerbestand;
		Bezeichnung = bezeichnung;
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

	public int berechneFehlmenge(int BestellMenge) {
		if(this.getLagerbestand() - BestellMenge <= 0) {
			return (this.getLagerbestand() - BestellMenge)*(-1);
		}
		return 0;
	}
	
}
