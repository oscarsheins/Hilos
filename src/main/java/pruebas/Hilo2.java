package pruebas;

public class Hilo2 implements Runnable {
	
	private String nombreHilo;

	public Hilo2(String nombreHilo) {
		super();
		this.nombreHilo = nombreHilo;
		
	}
	
	
	@Override
	public void run() {
		Thread.currentThread().setName(nombreHilo);
		try {
			Thread.sleep(5000); // 5000 porque son milisegundos
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Ejecutando Hilo:"+Thread.currentThread().getName());		
	}

	
}
