package pruebas;

public class LanzarHilos {
	
	public static void main(String[] args) {
		
		// Cosas importantes que hay que saber 
		
		// 1º Si lo haces extendiendo la clase al intanciarla automaticamente puede usar el metodo start()
		// pero si esta implementando tienes que instanciar la clase y esa clae meterla en el constructor de Thread
		// para que se combierta en un hilo y asi si poder usar el metodo start()
		
		
		// Forma mas desgloada
//		Hilo uno = new Hilo("Oscar");
//		Hilo2 dos = new Hilo2("Raul");
//		
//		Thread hilo1 = new Thread(uno);
//		Thread hilo2 = new Thread(dos);
		
		// Esta bien como esta arriba pero esta forma es mas elegante 
		Thread hilo1 = new Thread(new Hilo("Oscar"));
		Thread hilo2 = new Thread(new Hilo2("Asun"));
		
		hilo1.start();
		hilo2.start();
		
		System.out.println("Este main no hace nada solo lanza los hilos");
		
	}

}
