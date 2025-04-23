package boletin3;

public class Multiplos implements Runnable {
	
	private int numeroMultiplos;

	public Multiplos(int numeroMultiplos) {
		super();
		this.numeroMultiplos = numeroMultiplos;
	}

	public int getNumeroMultiplos() {
		return numeroMultiplos;
	}

	public void setNumeroMultiplos(int numeroMultiplos) {
		this.numeroMultiplos = numeroMultiplos;
	}
	
	public void mostrarMultiplos() {
		
		// 5 primeros multiplos
		for(int i = 0; i < 5; i++) {
			
			System.out.println(numeroMultiplos * i);
			
		}
		
	}

	@Override
	public void run() {
		
		mostrarMultiplos();
		
	}
	
	

}
