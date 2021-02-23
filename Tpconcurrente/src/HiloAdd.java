package Main;

import GranularidadFina.ListaGF;
import GranularidadGruesa.ListaGG;
import java.util.Random;

public class HiloAdd implements Runnable {
    int cont;
	int strLen;
	int cantOperaciones;
	long tiempoInicio;
	Lista lista;
	public HiloAdd(int cantOperaciones, Lista lista, long tiempoInicio, int strLen) {
		this.cont = 0;
		this.cantOperaciones = cantOperaciones;
		this.lista = lista;
		this.tiempoInicio = tiempoInicio;
		this.strLen = strLen;
	}
	public synchronized void run(){
		while(cont < cantOperaciones) {
			String random="";
			while(random.length() < strLen) {
					int agregar = new Random().nextInt();
					char agregarletra = (char)(agregar%26+'a');
					random+=agregarletra;
			}
			lista.add(random);
			cont++;
		}
		
		String msg = String.format("Hilo 'add' con %d operaciones y strLen=%d demoro %d ms", cantOperaciones, strLen, System.currentTimeMillis()-tiempoInicio);
		if(lista instanceof ListaGF) {
			msg = msg + " (granularidad fina)";
		} else if(lista instanceof ListaGG) {
			msg = msg + " (granularidad gruesa)";
		} else{
			msg = msg + " (ERROR AL OBTENER LA CLASE DE LA LISTA UTILIZADA)";
		}
		System.out.println(msg);
	}
}