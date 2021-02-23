package ListaGranularidadGruesa;

import java.util.Random;

public class claseA implements Runnable {
    int cont=0;
	public synchronized void run(){
			int cont=0;
			int cantOperaciones=250;
			while(cont<cantOperaciones) {
				String random="";
				int letra=0;
				while(letra<2) {
					int agregar = new Random().nextInt();
					char agregarletra = (char)(agregar%26+'a');
					random+=agregarletra;
					letra++;
				}
				
				programa.lista.add(random);
				cont++;
			}
			//long fin = System.currentTimeMillis();
			//System.out.println("Termino");
			System.out.println(System.currentTimeMillis()-programa.inicio);
	}
}