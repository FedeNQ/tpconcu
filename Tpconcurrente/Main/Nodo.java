package Main;

public class Nodo {
    public Object item;
	public int key;
	public Nodo next;
	public Nodo (Object o) {
		item = o;
        key = o.hashCode();
	}
    public Nodo (int key) {
        item = null;
        this.key = key;
    }
}