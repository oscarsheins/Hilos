package boletin1;

public class Servicio implements Runnable{

	public void run() {	
		
		while(!Thread.currentThread().isInterrupted()) {
			
			System.out.println("Servicio");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				break;
			}
			
			
			
		}
		
	}
	
}
