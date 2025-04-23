package pruebas.semaforo;

public class HiloSemaforoBinario implements Runnable{	
	
	private Impresora impresora;
	private SemaforoBinario semaforo;
	private String nombreHilo;
	
	
	public HiloSemaforoBinario(Impresora impresora, SemaforoBinario semaforo, String nombreHilo) {
		super();
		this.impresora = impresora;
		this.semaforo = semaforo;
		this.nombreHilo = nombreHilo;
	}

	
	@Override
	public void run() {
		
		try {
			semaforo.obtenerBandera();
			System.out.println("El hilo " + nombreHilo + " a obtenido la bandera" );
			
			impresora.imprimir();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			semaforo.liberarBandera();
			System.out.println("El hilo " + nombreHilo + " a liberado la bandera");
			
		}
		
	}

	
}
