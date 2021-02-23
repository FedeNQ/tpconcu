package ListaGranularidadGruesa;

public class programa {
	static List lista = new List();
	static long inicio;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inicio = System.currentTimeMillis();
		// A = add, B=remove;
		
		//comentar esto si cantA y cantB son diferentes
		int cant=40;
		for(int i=0; i<cant; i++){
			new Thread(new claseA()).start();
			new Thread(new claseB()).start();
		}
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
}