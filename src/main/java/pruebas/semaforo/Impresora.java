package pruebas.semaforo;

public class Impresora {

	public void imprimir() {
		
		System.out.println("Ha empezado a imprimir");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Ha terminado de imprimir");
		
	}
	
	

}
