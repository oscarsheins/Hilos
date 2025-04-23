package pruebas.semaforo;

public class LanzarImpresora {

	public static void main(String[] args) {
		
		SemaforoBinario semaforo = new SemaforoBinario();
		Impresora impresora = new Impresora();
		
		
		Thread usuario1 = new Thread(new HiloSemaforoBinario(impresora, semaforo, "usuario1"));
		Thread usuario2 = new Thread(new HiloSemaforoBinario(impresora, semaforo, "usuario2"));
		Thread usuario3 = new Thread(new HiloSemaforoBinario(impresora, semaforo, "usuario3"));
		Thread usuario4 = new Thread(new HiloSemaforoBinario(impresora, semaforo, "usuario4"));
		
		usuario1.start();
		usuario2.start();
		usuario3.start();
		usuario4.start();
		
	}
	
}
