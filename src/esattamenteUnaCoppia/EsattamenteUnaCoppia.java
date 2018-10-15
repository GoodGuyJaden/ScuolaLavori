package esattamenteUnaCoppia;

//Esercizio 25 Settembre

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class EsattamenteUnaCoppia {

	static int[] vett;
	/**
	 * Inserisci all'interno di un vettore numeri random tra due estremi scelti dall'utente.
	 * @param min
	 * @param max
	 */
	public static void randomVett(int min, int max) {
		for (int i = 0; i < vett.length; i++) {
			vett[i] = ThreadLocalRandom.current().nextInt(min, max);
		}
	}
	
	public static void stampaVettore() {
		for (int i = 0; i < vett.length; i++) {
			System.out.print(vett[i] + " ");
		}
	}
	public static void coppie() {
		int numCoppie = 0;
		int scelta;

		for (int i = 0; i < vett.length; i++) {
			scelta = vett[i];
			for (int j = 0; j < vett.length; j++) {
				if (i != j) {
					if (scelta == vett[j])
						numCoppie++;
				}
			}

		}
		if (numCoppie == 2) {
			System.out.println("win");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dimensioneVett;
		
		System.out.println("Inserisci Dimensione Vettore:");
		dimensioneVett = sc.nextInt();
		
		vett = new int[dimensioneVett];
		
		randomVett(0, 10);
		stampaVettore();
		coppie();
		sc.close();
	}

}
