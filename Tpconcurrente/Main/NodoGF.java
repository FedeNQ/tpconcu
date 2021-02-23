package Main;
import java.util.concurrent.locks.ReentrantLock;

public class NodoGF extends Nodo {
	private ReentrantLock lock;
    public NodoGF (Object o) {
		super(o);
        lock = new ReentrantLock();
	}
    public NodoGF (int key) {
        super(key);
        lock = new ReentrantLock();
    }
    public void lock() {
        lock.lock();
    }
    public void unlock() {
        lock.unlock();
    }
}

