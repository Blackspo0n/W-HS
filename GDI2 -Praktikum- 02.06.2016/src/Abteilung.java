import java.io.Serializable;
import java.util.*;

/**
 * Representiert die Abteilungen eines Unternehmens.
 * 
 * Die Attribute werden mittles den settern gesetzt. 
 * Ein seperater Konstruktor ist nicht vorhanden
 * 
 * 
 * @author Mario Kellner <mario.kellner@studmail.w-hs.de>
 * @version 1.0
 */
class Abteilung implements Serializable {
	/**
	 * Mitarbeiterliste
	 */
	protected List<Mitarbeiter> ma;
	/**
	 * Die Bezeichnung der Abteilung
	 */
	protected String bezeichnung;
	
	/**
	 * Liefert die komplette Mitarbeiterliste der Arbeitung
	 * 
	 * @return List<Mitarbeiter>
	 */
	public List<Mitarbeiter> getMa() {
		return ma;
	}

	public void setMa(List<Mitarbeiter> ma) {
		this.ma = ma;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	Abteilung() {
		this.ma = new LinkedList<Mitarbeiter>();
	}

	Abteilung(String bezeichnung) {
		this();
		this.bezeichnung = bezeichnung;
	}

	public void link(Mitarbeiter mit) {
		this.ma.add(mit);
		mit.link(this);
	}

	public void unlink(Mitarbeiter mit) {
		this.ma.remove(mit);
		mit.unlink();
	}

	Mitarbeiter getlink(int pos) {
		return this.ma.get(pos);
	}
}