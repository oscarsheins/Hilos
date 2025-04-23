package pruebas;

public class Hilo implements Runnable {
	
	private String nombreHilo;

	public Hilo(String nombreHilo) {
		super();
		this.nombreHilo = nombreHilo;
		
	}
	
	
	@Override
	public void run() {
		Thread.currentThread().setName(nombreHilo);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Ejecutando Hilo:"+Thread.currentThread().getName());		
	}

	
}
