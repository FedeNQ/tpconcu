package ListaGranularidadGruesa;
import ListaGranularidadGruesa.Node;

public class List {
	Node head;
	public List(){
		head = new Node (Integer.MIN_VALUE);
		head.next = new Node (Integer.MAX_VALUE);
	}
	public synchronized boolean add (Object o) {
		Node pred, curr;
		int key = o.hashCode();
		pred = head;
		curr = pred.next;
		while (curr.key < key){
		pred = curr;
		curr = curr.next;
		}
		if (key == curr.key) return false;
		else {
		Node node = new Node (key);
		node.next = curr;
		pred.next = node;
		return true;
		}
	}
	public synchronized boolean remove (Object o) {
		Node pred, curr;
		int key = o.hashCode();
		pred = head;
		curr = pred.next;
		while (curr.key < key){
		pred = curr;
		curr = curr.next;
		}
		if (key == curr.key) {
		pred.next = curr.next;
		return true;
		}
		return false;
	}

}

