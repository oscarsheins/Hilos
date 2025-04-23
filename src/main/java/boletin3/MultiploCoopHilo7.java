package boletin3;

public class MultiploCoopHilo7 extends Thread {
	
	private MultiplosCoperativos multiplos;

	public MultiploCoopHilo7(MultiplosCoperativos multiplos ) {
		
		super();
		this.multiplos = multiplos;

	}
	
	public void run() {
		
		MultiplosCoperativosEstaticos.mostrarMultiplos(7);
		
	}
	
	

}
