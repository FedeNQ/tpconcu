package Main;

public class ListaGF extends Lista{
	private NodoGF head;
	public ListaGF(){
		head = new NodoGF(Integer.MIN_VALUE);
		head.next = new NodoGF(Integer.MAX_VALUE);
	}
	public boolean add(Object o) {
        NodoGF pred = head;
        NodoGF curr = null;
        NodoGF newNode = new NodoGF(o);
        boolean response;
        try {
            pred.lock();
            curr = (NodoGF) pred.next;
            curr.lock();
            while(curr.key < newNode.key) {
                pred.unlock();
                pred = curr;
                curr = (NodoGF) curr.next;
                curr.lock();
            }
            if(newNode.key == curr.key) {
                response = false;
            } else {
                newNode.next = curr;
                pred.next = newNode;
                response = true;
            }
        } finally {
            if(curr != null) curr.unlock();
            pred.unlock();
        }
        return response;
    }
	public boolean remove(Object o) {
        NodoGF pred = head;
        NodoGF curr = null;
        int key = o.hashCode();
        boolean response;
        try {
            pred.lock();
            curr = (NodoGF) pred.next;
            curr.lock();
            while(curr.key < key) {
                pred.unlock();
                pred = curr;
                curr = (NodoGF) curr.next;
                curr.lock();
            }
            if(key == curr.key) {
                pred.next = curr.next;
                response = true;
            } else {
                response = false;
            }
        } finally {
            if(curr != null) curr.unlock();
            pred.unlock();
        }
        return response;
    }

}

