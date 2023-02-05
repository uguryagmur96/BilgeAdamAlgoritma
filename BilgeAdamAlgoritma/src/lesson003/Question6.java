package lesson003;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// Girilen sayının asal olup olmadığını bulan program 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayı Giriniz:");
		int sayi = scanner.nextInt();
		int sayac =0;
		
		for (int i=2;i<=sayi;i++) {
			
		
		if (sayi <= 2) {
			System.out.println("Lütfen farklı bir sayı giriniz");
			break;
		}
		else if (sayi%2==0) {
			sayac++;
			break;
		} 
		}if (sayac ==0) {
			System.out.println("Sayı Asaldır");
		} else 
			System.out.println("Sayı asal değildir");
		 
		 
		 
		
	}

}
