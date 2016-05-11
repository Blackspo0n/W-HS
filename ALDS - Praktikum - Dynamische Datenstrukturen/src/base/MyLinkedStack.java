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
			this.size++;
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
			this.size--;
		}
		
		return result;
	}

	public int search(Object obj) {
		if(obj != null) {
			Entry e = this.head;
			
			for(int i = 0; i < this.size; i++) {
	
				if(obj.equals(e.data)) {
					return i;
				}
				if(e.next != null) {
					e = e.next;
				}
			}
		}
		return -1;
	}

	
	public boolean isEmpty()
	{
		return this.size == 0;
	}
}