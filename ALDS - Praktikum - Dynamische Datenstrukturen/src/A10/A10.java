package A10;
import base.MyLinkedList;
import base.SimpleIterator;
import base.SimpleList;

public class A10
{
	//Elemente in Liste einfügen
	static void fillList(SimpleList list)
  	{
		//Zahlen von 0 bis 19 als Zeichenketten (Strings) einfügen
    	for (int i = 0; i < 20; ++i) 
		{
      		list.add("" + i);
    	}
  	}

	//Liste vom Anfang bis zum Ende durchlaufen und Elemente ausgeben
  	static void printList(SimpleList list)
  	{
		SimpleIterator it = list.iterator();
		while (it.hasNext()) 
		{
      		System.out.print((String)it.next()+" ");
    	}
    	System.out.println("\n-");
  	}
  			
  	public static void main(String[] args)
  	{
    	//Erzeugen der LinkedList
    	MyLinkedList ll = new MyLinkedList();
    	fillList(ll);
    	
    	//Letztes Element entfernen
    	String lastElement = (String)ll.remove(ll.size()-1);
    	
    	System.out.println("Wert des letzen Elementes:" + lastElement);
    	
    	//Erstes Element entfernen
    	String firstElement = (String)ll.remove(0);
    	System.out.println("Wert des ersten Elementes:" + firstElement);
    	
        //Die Liste wieder vervollständigen
        ll.add(0, "1");
        ll.add("19");
        
        //Elemente 1 - 5 entfernen
        for(int i = 1; i <= 5; i++) {
        	ll.remove(i);
        	printList(ll);
        }
    	
    	//Element an der Stelle 5 ausgeben
		System.out.println("Element an der 5. Stelle: " + (String)ll.get(4));
  	}
}