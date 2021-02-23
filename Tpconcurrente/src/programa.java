package Main;

import GranularidadFina.ListaGF;
import GranularidadGruesa.ListaGG;

public class programa {
	public static void main(String[] args) {
		
		variarProporcionCadaHilo(new ListaGF());
		variarProporcionCadaHilo(new ListaGG());

		variarCantidadTotalHilos(new ListaGF());
		variarCantidadTotalHilos(new ListaGG());



		// A = add, B=remove;
		
		//comentar esto si cantA y cantB son diferentes
		/*int cant=40;
		for(int i=0; i<cant; i++){
			new Thread(new claseA()).start();
			new Thread(new claseB()).start();
		}*/
		/*
		//descomentar esto si cantA y cantB son diferentes
		int cantA = 40, cantB=20;
		for(int i=0; i<cantA; i++){
			new Thread(new claseA()).start();
		}
		for(int i=0; i<cantB; i++){
			new Thread(new claseB()).start();
		}
		*/
	}

	public static void variarProporcionCadaHilo(Lista lista) {
		//TODO
	}

	public static void variarCantidadTotalHilos(Lista lista) {
		int cantOperacionesPorHilo = 200;
		for(int cantHilos = 20; cantHilos <= 100; cantHilos += 20) {
			long tiempoInicio = System.currentTimeMillis();
			for(int i=0; i < cantHilos; i++){
				new Thread(new HiloAdd(200, lista, tiempoInicio, 2)).start();
				new Thread(new HiloRemove(200, lista, tiempoInicio, 2)).start();
			}
		}
	}
}