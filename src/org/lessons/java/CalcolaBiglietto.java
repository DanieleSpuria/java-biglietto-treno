package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quanti chilometri devi percorrere? ");
		int km = scan.nextInt();
		
		System.out.print("Indica la tua età: ");
		int eta = scan.nextInt();
		
		float prezzo =  0.21F * km;
		float scontato = 0;
		
		if (eta < 18) {
			scontato = (prezzo * 20) / 100;
			System.out.println("Il prezzo del biglietto è " + scontato + " €");
		} else if (eta > 65) {
			scontato = (prezzo * 40) / 100;
			System.out.println("Il prezzo del biglietto è " + scontato + " €");
		} else {
			System.out.println("Il prezzo del biglietto è " + prezzo);
		}
		
	}
}
