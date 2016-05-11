package base;


public class MyLinkedStack {

	class Entry 
	{
		public Object data;
		public Entry next;
		
		Entry()
		{
	    	this.data = null;
	    	this.next = null;
	    }
    }

	private Entry head;
	private int size;
	
	public MyLinkedStack()
	{
		this.head = null;
		this.size = 0;
	}

	public boolean push(Object obj) {
		if(obj != null) {
			Entry tmp = new Entry();
			tmp.data = obj;
			
			if(this.head != null) {
				tmp.next = this.head;
			}
			
			this.head = tmp;
			return true;
		}
		return false;
	}
	
	public Object peek() {
		if(this.head != null) {
			return this.head.data;
		}
		return null;
	}
	
	public Object pop() {
		Object result = peek();
		
		if(this.head != null) {
			this.head = this.head.next;
		}
		
		return result;
	}

	public int search(Object obj) {
		
	}
	// Operationen (Klasse MyLinkedList)
	/**
	 * Überprüfung, ob ein Index im gültigen Bereich liegt
	 */	
	private static void rangeCheck(int minIndex, int index, int maxIndex)
	{
		if (index < minIndex || index > maxIndex)
			throw new IndexOutOfBoundsException();
	}

	/**
	 * Überprüfung, ob die Liste leer ist
	 */	 
	public boolean isEmpty()
	{
		return this.size == 0;
	}
	
	/**
	 * Bestimmung der Anzahl der Elemente in der Liste
	 */
	public int size()
	{
		return this.size;
	}	
}