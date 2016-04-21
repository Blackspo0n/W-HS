
public class A31 {

	public static void main(String[] args) {
		Mitarbeiter arbeiter1 = new Mitarbeiter();
		arbeiter1.setName("Phillip Miller");
		arbeiter1.setPrsnlnr(32451213);
		
		Mitarbeiter arbeiter2 = new Mitarbeiter();
		arbeiter2.setName("Jan Momper");
		arbeiter2.setPrsnlnr(34122112);
		
		Abteilung marketing = new Abteilung("Marketing");
		marketing.link(arbeiter1);
		marketing.link(arbeiter2);
		
		for(Mitarbeiter item : marketing.ma) {
			System.out.println(item.getName());
		}
		
	}
	
}
