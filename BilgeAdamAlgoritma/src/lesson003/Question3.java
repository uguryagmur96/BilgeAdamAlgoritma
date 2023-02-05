package lesson003;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// Girilen sayı için çarpım tablosunu veren program
		
		Scanner scanner = new Scanner(System.in);
//		System.out.println("Sayı giriniz:");
//		int sayi = scanner.nextInt();
//		
//		for ( int i=1; i<=10; i++) {
//			System.out.println(sayi + " x " + i + " = " + sayi*i);
//			
//		}
		
		// Birden 10 a kadar olan sayıların çarpım tablosu
		
		for (int x=1;x<=10;x++) {
		   for (int y=1;y<=10;y++) {
			   System.out.println(x + " * " + y + " = "+ x*y );
		   }
		}

	}

}
