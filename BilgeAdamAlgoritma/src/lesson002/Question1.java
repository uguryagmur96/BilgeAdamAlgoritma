package lesson002;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		
		// Dairenin çevresini ve alanını hesaplayan program
		// r değeri kullanıcıdan alınacak
		// pi 3.14
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dairenin yarı çapını giriniz");
		double r = scanner.nextDouble();
		double pi = 3.14;
		double cevre = 2* (pi*r);
		double alan = pi * r*r;
		System.out.println("Dairenin çevresi: " +  cevre + " Dairenin alanı : " + alan );
		
		
		
		

	}

}
