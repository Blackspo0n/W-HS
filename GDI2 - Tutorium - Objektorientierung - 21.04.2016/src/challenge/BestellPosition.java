package challenge;

public class BestellPosition {
	protected int Anzahl;
	protected Artikel Artikel;
	
	public BestellPosition() {
	
	}

	public BestellPosition(int anzahl, Artikel artikel) {
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
