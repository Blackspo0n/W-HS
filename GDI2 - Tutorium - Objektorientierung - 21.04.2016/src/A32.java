
public class A32 {
	public static void main(String[] args) {
		Mitarbeiter m1 = new Mitarbeiter();
		m1.setName("Dieter");
		m1.setPrsnlnr(12345);
		Mitarbeiter m2 = new Mitarbeiter();
		m2.setName("Paul");
		m2.setPrsnlnr(12346);
		Mitarbeiter chef = new Mitarbeiter();
		chef.setName("Manfred");
		chef.setPrsnlnr(12346);

		Abteilung a1 = new Abteilung();
		a1.setBezeichnung("Einkauf");

		Abteilung a2 = new Abteilung();
		a2.setBezeichnung("Verkauf");

		a1.link(m1);
		a2.link(m2);

		Firma f1 = new Firma();
		f1.setName("Komm und Klau GmbH.");
		f1.setSitz("Bocholt");
		f1.setBoss(chef);
		f1.link(a1);
		f1.link(a2);

		f1.mitarbeiterListeDrucken();

	}
}
