import java.io.Serializable;
import java.util.*;

/**
 * Representiert die Firma eines Unternehmens.
 * 
 * @author Mario Kellner <mario.kellner@studmail.w-hs.de>
 * @version 1.0
 */
public class Firma implements Serializable {
	/**
	 * Name der Firma
	 */
	protected String name;
	/**
	 * Sitz der Firma
	 */
	protected String sitz;
	
	/**
	 * Liste mit Abteilungen in der Firma
	 * @var Abteilung
	 */
	protected List<Abteilung> abl;
	
	/**
	 * Chef der Firma
	 */
	protected Mitarbeiter Boss;

	public Firma() {
		this.abl = new LinkedList<Abteilung>();
	}
	
	
	// Getter & Setter
	public Mitarbeiter getBoss() {
		return Boss;
	}

	public void setBoss(Mitarbeiter boss) {
		Boss = boss;
	}
	
	public String getName() {
		return name;
	}
	
	public List<Abteilung> getAbl() {
		return abl;
	}

	public void setAbl(List<Abteilung> abl) {
		this.abl = abl;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getSitz() {
		return sitz;
	}
	public void setSitz(String sitz) {
		this.sitz = sitz;
	}
	
	public void link(Abteilung ab) {
		this.abl.add(ab);
	}
	/**
	 * Diese Funktion gibt alle Mitarbeiter des Unternehmens anhand deren Abteilung aus.
	 * 
	 * 
	 */
	public void mitarbeiterListeDrucken() {
		System.out.println("Firmenname: " + this.getName());
		
		System.out.println("Name\tPersonalNummer\tAbteilung");
		System.out.println("================================");
		System.out.println(this.getBoss().getName() + "\t" + this.getBoss().getPrsnlnr() + "\tChef");
		
		for(Abteilung item: this.abl) {
			for(Mitarbeiter arbeiter: item.ma) {
				System.out.println(arbeiter.getName() + "\t" + arbeiter.getPrsnlnr() + "\t" + item.bezeichnung);
			}
		}
		
	}
}
