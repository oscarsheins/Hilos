package boletin3;

public class MultiploCoopHilo3 extends Thread {
	
	private MultiplosCoperativos multiplos;

	public MultiploCoopHilo3() {
		super();
	}
	
	public void run() {
		
		MultiplosCoperativosEstaticos.mostrarMultiplos(3);
		
	}
	
	

}
