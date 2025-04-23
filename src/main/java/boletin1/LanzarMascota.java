package boletin1;

public class LanzarMascota {
	
	public static void main(String[] args) {
		
		Mascota lulu = new Mascota("Lulu", 0);
		
		Thread[] cuidador = new Thread[5];
		
		for(int i = 0; i < cuidador.length; i++) {
			
			cuidador[i] = new Thread(lulu);
			
			cuidador[i].start();
			
		}
		
		 // Esperamos a que terminen todos los hilos
        for (int i = 0; i < cuidador.length; i++) {
            try {
                cuidador[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
		
		
		System.out.println(lulu.getNumeroDeVecesAlimentado());
	}

}
