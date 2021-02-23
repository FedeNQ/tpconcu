package Main;

public class Main {
	private static int remHilos = 0, cantHilos;
	public static void main(String[] args) {
		//Aca fuimos variando el codigo para probar los distintos escenarios del enunciado
		Lista lista = new ListaGG();
		int cantHilosAdd = 100;
		int cantHilosRemove = 100;
		int cantOperacionesPorHilo = 100;
		long tiempoInicio = System.currentTimeMillis();
		for(int i=0; i < cantHilosRemove+cantHilosAdd; i++) {
			if(i < cantHilosAdd) new Thread(new HiloAdd(cantOperacionesPorHilo, lista, tiempoInicio, 2)).start();
			if(i < cantHilosRemove) new Thread(new HiloRemove(cantOperacionesPorHilo, lista, tiempoInicio, 2)).start();
		}
	}
}