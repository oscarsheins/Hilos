package boletin1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lanzador {
	public static void main(String[] args) {

		Thread s = new Thread(new Servicio());
		Thread p = new Thread(new Proceso());

		List<Thread.State> estadosServicios = new ArrayList<>();
		List<Thread.State> estadosProcesos = new ArrayList<>();

		// Registrar estado inicial
		estadosServicios.add(s.getState());
		estadosProcesos.add(p.getState());

		s.start();
		p.start();

  

		Scanner scanner = new Scanner(System.in);

		// Interrumpir los hilos al presionar Enter
		if (scanner.nextLine() != null) {
			
			// Hilos interumpidos
			s.interrupt();
			p.interrupt();

			try {
				s.join();
				p.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		
		scanner.close();

		// Mostrar los estados almacenados
		System.out.println("Estados del hilo SERVICIOS:");
		for (Thread.State estado : estadosServicios) {
			System.out.println(estado);
		}

		System.out.println("Estados del hilo PROCESOS:");
		for (Thread.State estado : estadosProcesos) {
			System.out.println(estado);
		}
	}
}
