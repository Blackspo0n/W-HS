package whs.gdi2.WDProgramm.Classes;

import whs.gdi2.WDProgramm.AbstractClasses.Immobilie;

public class MehrFamilienHaus extends Immobilie {
	public int anzahlDerWohnungen;

	public MehrFamilienHaus() {
		super();
	}

	public MehrFamilienHaus(String Adresse, int grundstuecksGroesse, int wohnFlaeche, double preisProQM, double kaufPreis, int anzahlDerWohnungen) {
		super(Adresse, grundstuecksGroesse, wohnFlaeche, preisProQM, kaufPreis);
		setAnzahlDerWohnungen(anzahlDerWohnungen);
	}

	public int getAnzahlDerWohnungen() {
		return anzahlDerWohnungen;
	}

	public void setAnzahlDerWohnungen(int anzahlDerWohnungen) {
		this.anzahlDerWohnungen = anzahlDerWohnungen;
	}
	
	
	
}
