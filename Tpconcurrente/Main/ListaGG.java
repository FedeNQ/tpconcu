package Main;

public class ListaGG extends Lista{
	private NodoGG head;
	public ListaGG(){
		head = new NodoGG(Integer.MIN_VALUE);
		head.next = new NodoGG(Integer.MAX_VALUE);
	}
	public synchronized boolean add(Object o) {
		NodoGG pred = head;
		NodoGG curr = (NodoGG) pred.next;
		NodoGG newNode = new NodoGG(o);
		while (curr.key < newNode.key){
			pred = curr;
			curr = (NodoGG) curr.next;
		}
		if (newNode.key == curr.key) {
			return false;
		} else {
			newNode.next = curr;
			pred.next = newNode;
			return true;
		}
	}
	public synchronized boolean remove (Object o) {
		NodoGG pred = head;
		NodoGG curr = (NodoGG) pred.next;
		int key = o.hashCode();
		while (curr.key < key){
			pred = curr;
			curr = (NodoGG) curr.next;
		}
		if (key == curr.key) {
			pred.next = curr.next;
			return true;
		}
		return false;
	}

}

