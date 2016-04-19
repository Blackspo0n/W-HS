package whs.gdi2.WDProgramm.Classes;

import whs.gdi2.WDProgramm.AbstractClasses.Immobilie;

public class EigentumsWohnung extends Immobilie {
	public boolean hatBalkon;

	public EigentumsWohnung() {
		super();
	}
	
	public EigentumsWohnung(String Adresse, int grundstuecksGroesse, int wohnFlaeche, double preisProQM, double kaufPreis, boolean hatBalkon) {
		super(Adresse, grundstuecksGroesse, wohnFlaeche, preisProQM, kaufPreis);
		setHatBalkon(hatBalkon);
	}
	
	public boolean isHatBalkon() {
		return hatBalkon;
	}

	public void setHatBalkon(boolean hatBalkon) {
		this.hatBalkon = hatBalkon;
	}



	public EigentumsWohnung(boolean hatBalkon) {
		this.hatBalkon = hatBalkon;
	}
	
	
}
