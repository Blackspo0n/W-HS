package A9;
import base.*;
public class A9 {

	public static void main(String[] args) {
		MyLinkedList ll = new MyLinkedList();

		ll.add("Dies");
		ll.add("ist");
		ll.add("eine");
		ll.add("schöne");
		ll.add("Aufgabe");
		ll.add("zum");
		ll.add("Warmwerden");
		// TODO Auto-generated method stub
		
		for(int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i) + " ");
		}
	}
}
