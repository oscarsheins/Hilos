package boletin3;

import java.util.ArrayList;
import java.util.List;

public class GestionaHilos {

	public static void main(String[] args) {

		int tamañoTabla = 1000;
		int numerosHilos = 10;
		long t_comienzo = System.currentTimeMillis();
		
		GestionaHilos gestiona = new GestionaHilos();

		Integer[] notas = gestiona.crearTabla(tamañoTabla);

		List<Thread> hilos = new ArrayList<Thread>();

		List<HiloCalculaMaxHilo> objetosHilos = new ArrayList<HiloCalculaMaxHilo>();
		try {
			int rango = tamañoTabla / numerosHilos;
			for (int i = 0; i < numerosHilos; i++) {
				HiloCalculaMaxHilo c = new HiloCalculaMaxHilo();
				c.setTabla(notas);
				c.setInicio(i * rango);
				c.setFin(c.getInicio() + rango - 1);
				objetosHilos.add(c);
				Thread hilo = new Thread(c);
				hilos.add(hilo);
			}
			for (Thread h : hilos) {
				h.start();
			}

			for (Thread h : hilos) {
				h.join();
			}

			// TODO Calcula el maximoTotal a partir objetosHilos Itero la lista de objetos y
			// me quedo con el máximo del atributo maximoTramo

			long t_fin = System.currentTimeMillis();
			long tiempototal = t_fin - t_comienzo;
			System.out.println("El proceso total ha tardado= " + tiempototal + "mseg");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Integer[] crearTabla(int tamañoTabla) {

		Integer[] notas = new Integer[tamañoTabla];

		for (int i = 0; i < notas.length; i++) {

			notas[i] = (int) (Math.random() * 500) + 1;

		}

		return notas;
	}

}
