package ListaGranularidadGruesa;

import java.util.Random;

public class claseB implements Runnable {
	 int cont=0;
	 public synchronized void run(){
				int cont=0;
				int cantOperaciones=250;
				while(cont<cantOperaciones) {
			    String random="";
					while(random.length() < 2) {
						 int agregar = new Random().nextInt();
						 char agregarletra = (char)(agregar%26+'a');
						 random+=agregarletra;
					}
				 programa.lista.remove(random);
				 cont++;
				}
				//long fin = System.currentTimeMillis();
				//System.out.println("Termino");
				System.out.println(System.currentTimeMillis()-programa.inicio);
	}
}