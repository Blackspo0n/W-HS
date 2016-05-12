package Challenge;

import base.MyLinkedList;
import base.MyLinkedStack;

public class Challenge {

	public static void main(String[] args) {
		MyLinkedStack ll = new MyLinkedStack();
		
		System.out.println("MyLinkedStack sollte leer sein -> isEmpty: " + ll.isEmpty());
		
		ll.push("Dies");
		ll.push("ist");
		ll.push("eine");
		ll.push("schöne");
		ll.push("Aufgabe");
		ll.push("zum");
		ll.push("Warmwerden");
		
		System.out.println("MyLinkedStack sollte nicht leer sein -> isEmpty: " + ll.isEmpty());
		System.out.println("'Aufgabe' liegt an der Position " + ll.search("Aufgabe"));
		System.out.println("Ausgabe des ersten Elements des Stacks mit Löschung: " + ll.pop());
		System.out.println("Ausgabe des ersten Elements des Stacks ohne Löschung: " + ll.peek());
	}
}