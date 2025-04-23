package boletin1;

public class Mascota implements Runnable{
	
	private String nombreMascota;
	private int numeroDeVecesAlimentado;
	
	public Mascota(String nombreMascota, int numeroDeVecesAlimentado) {
		super();
		this.nombreMascota = nombreMascota;
		this.numeroDeVecesAlimentado = numeroDeVecesAlimentado;
	}

	public String getNombreMascota() {
		return nombreMascota;
	}

	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}

	public int getNumeroDeVecesAlimentado() {
		return numeroDeVecesAlimentado;
	}

	public void setNumeroDeVecesAlimentado(int numeroDeVecesAlimentado) {
		this.numeroDeVecesAlimentado = numeroDeVecesAlimentado;
	}
	// Cambio forma de aumentar para un separacion mas clara de la parte critica
	public  void aumentarComida() {
		
		numeroDeVecesAlimentado ++;
		
	}
	
	public  void comer() {
		
		// Establesco su nombre 
		Thread.currentThread().setName(nombreMascota);
		// He imprimo que esta comiendo con el nombre establecido
		System.out.println("La mascota " + Thread.currentThread().getName() + " ha empezado a comer");
		
		// Una ves coma se aumentar el numero de veces que ha sido alimentada
		aumentarComida();
		
		// Se comenta y descomenta par hacer pruebas
		
		try {
			Thread.sleep(1000 * numeroDeVecesAlimentado);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Mensajes finales de informe
		System.out.println("La mascota " + Thread.currentThread().getName() + " ha terminado de comer");
		System.out.println("Ha sido alimentad " + numeroDeVecesAlimentado);
		
	}

	@Override
	public void run() {	
		
		comer();
		
	}

	@Override
	public String toString() {
		return "Mascota [nombreMascota=" + nombreMascota + ", numeroDeVecesAlimentado=" + numeroDeVecesAlimentado + "]";
	}
	
	
	

}
