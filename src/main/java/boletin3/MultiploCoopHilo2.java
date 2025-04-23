package boletin3;

public class MultiploCoopHilo2 extends Thread {
	
	private MultiplosCoperativos multiplos;

	public MultiploCoopHilo2() {
		super();

	}
	
	public void run() {
		
		MultiplosCoperativosEstaticos.mostrarMultiplos(2);
		
	}
	
	

}
