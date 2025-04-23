package boletin3;

public class LanzarMultiplosCoperativosEstaticos {
	
	public static void main(String[] args) {
		long t_comienzo = System.currentTimeMillis();
		//Como el método es estático no necesita tener un objeto asociado
		MultiploCoopHilo2 hilo2 = new MultiploCoopHilo2();
		MultiploCoopHilo3 hilo3 = new MultiploCoopHilo3();
		MultiploCoopHilo7 hilo7 = new MultiploCoopHilo7();
		try {
			hilo2.start();
			hilo3.start();
			hilo7.start();


			hilo2.join();
			hilo3.join();
			hilo7.join();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		long t_fin = System.currentTimeMillis();
		long tiempototal = t_fin - t_comienzo;
		System.out.println("El proceso total ha tardado= " + tiempototal + "mseg");
	}


	

}
