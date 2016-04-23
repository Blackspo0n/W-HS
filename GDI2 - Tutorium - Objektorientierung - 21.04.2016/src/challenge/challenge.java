package challenge;

import java.util.*;

/**
 * Ausführende Klasse für die Challenge
 * mit ein paar vordefinierten Artikeln und Kunden
 * 
 * @author Mario Kellner <mario.kellner@studmail.w-hs.de>
 * @version 1.0
 */
public class challenge {
	public static void main(String[] args) {
		Artikel art1 = new Artikel();
		art1.setBezeichnung("heftzwecken");
		art1.setLagerbestand(4521);
		
		Artikel art2 = new Artikel();
		art2.setBezeichnung("4K Bildschirm");
		art2.setLagerbestand(20);
		
		Artikel art3 = new Artikel();
		art3.setBezeichnung("Kügelschreiber");
		art3.setLagerbestand(100);
		
		Artikel art4 = new Artikel();
		art4.setBezeichnung("Locher");
		art4.setLagerbestand(5);

		Kunde kunde1 = new Kunde();
		kunde1.setName("Momper");
		kunde1.setVorname("Jan");
		
		Kunde kunde2 = new Kunde();
		kunde2.setName("Miller");
		kunde2.setVorname("Phillip");
		
		Kunde kunde3 = new Kunde();
		kunde3.setName("Kellner");
		kunde3.setVorname("Mario");

		Bestellung best1 = new Bestellung();
		best1.setDatum("14.11.2012");

		BestellPosition bestp1 = new BestellPosition();
		bestp1.setAnzahl(4000);
		bestp1.setArtikel(art1);

		BestellPosition bestp2 = new BestellPosition();
		bestp1.setAnzahl(1);
		bestp1.setArtikel(art2);

		best1.addPosition(bestp1);
		best1.addPosition(bestp2);
		
		best1.setStatus(OderStatus.BEZAHLT);
		kunde2.addBestellung(best1);
		

		Bestellung best2 = new Bestellung();
		best2.setDatum("31.10.2015");

		BestellPosition bestp3 = new BestellPosition();
		bestp3.setAnzahl(7);
		bestp3.setArtikel(art4);

		BestellPosition bestp4 = new BestellPosition();
		bestp4.setAnzahl(99);
		bestp4.setArtikel(art3);

		best2.addPosition(bestp3);
		best2.addPosition(bestp4);
		
		best2.setStatus(OderStatus.OFFEN);
		kunde3.addBestellung(best2);
		
		kunde3.druckeAlleOffenenBestellungen();		
	}
}