package boletin3;

public class MultiplosCoperativos  {
	
	private int numeroMultiplos;

	public MultiplosCoperativos() {
		super();
	}

	public int getNumeroMultiplos() {
		return numeroMultiplos;
	}

	public void setNumeroMultiplos(int numeroMultiplos) {
		this.numeroMultiplos = numeroMultiplos;
	}
	
	public synchronized void mostrarMultiplos(int numeroAMultiplicar) {
		
		// 5 primeros multiplos
		for(int i = 0; i < 10; i++) {
			
			
			System.out.println("Imprimiendo multiplos"+numeroAMultiplicar+"*"+i+"="+numeroAMultiplicar * i);
			
		}
		
	}

	

}
