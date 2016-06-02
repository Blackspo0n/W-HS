import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class A42 {
	public static Firma firma;
	public static void main(String[] args) {
		fill();
		serialize();
		deserialize();

		firma.mitarbeiterListeDrucken();
	}
	
	public static void serialize() {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objekte.ser"));
			oos.writeObject(firma);
			oos.close();
			
			System.out.println("Daten wurden erfolgreich serialisiert.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void deserialize() {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objekte.ser"));
			
			firma = (Firma)ois.readObject();
			System.out.println("Daten wurden erfolgreich deserialisiert.");
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void fill() {
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

		firma = new Firma();
		firma.setName("Komm und Klau GmbH.");
		firma.setSitz("Bocholt");
		firma.setBoss(chef);
		firma.link(a1);
		firma.link(a2);


	}
}
