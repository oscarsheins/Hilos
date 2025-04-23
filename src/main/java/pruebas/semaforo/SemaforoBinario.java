package pruebas.semaforo;

public class SemaforoBinario {
	
	private boolean estaLibre;
	
	
	public SemaforoBinario() {
		super();
		estaLibre = true;
	}

	public synchronized void obtenerBandera() throws InterruptedException {
		
		while(!estaLibre) {
		
			wait();
			
		}
		
		estaLibre = false;
		
	}
	
	public synchronized void liberarBandera() {
		
		estaLibre = true;
		notifyAll();
		
	}
	

}
