/**
 * Representiert die Abteilungen eines Unternehmens.
 * 
 * @author Mario Kellner <mario.kellner@studmail.w-hs.de>
 * @version 1.0
 */
class Mitarbeiter {
	/**
	 * Beinhaltet die zugeordnete Abteilung
	 */
	protected Abteilung arbeitetIn;
	
	/**
	 * Die Personal Nummer
	 */
	protected int prsnlnr;
	
	/**
	 * Vor- und Zuname
	 */
	protected String name;
	

	// Getter & Setter
	public Abteilung getArbeitetIn() {
		return arbeitetIn;
	}

	public void setArbeitetIn(Abteilung arbeitetIn) {
		this.arbeitetIn = arbeitetIn;
	}

	public int getPrsnlnr() {
		return prsnlnr;
	}

	public void setPrsnlnr(int prsnlnr) {
		this.prsnlnr = prsnlnr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Abteilung getlink() {
		return arbeitetIn;
	}

	public void link(Abteilung abt) {
		arbeitetIn = abt;
	}
	
	public void unlink() {
		arbeitetIn = null;
	}
}
