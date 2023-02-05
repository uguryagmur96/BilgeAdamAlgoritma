package lesson004;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// Girilen sayının mükemmel sayı olup olmadığını bulan program.
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayı giriniz");
		int sayi = scan.nextInt();
		int toplam =0;
		
		
		for (int i=1;i<sayi;i++) {
			if (sayi%i!=0) {
				continue;
			} else {
				toplam=toplam+i;
			}
		
		}  if (toplam==sayi)
			System.out.println("Sayı Mükemmeldir");
		else 
			System.out.println("Sayı Mükemmel Değildir");
	}

}
