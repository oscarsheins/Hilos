package boletin1;

public class Proceso implements Runnable {
	
public void run() {	
		
		while(!Thread.currentThread().isInterrupted()) {
			
			System.out.println("Procesos");
			
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
