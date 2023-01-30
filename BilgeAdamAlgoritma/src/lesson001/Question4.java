package lesson001;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayı giriniz");
		int sayi1 = scanner.nextInt();
		System.out.println("Sayı giriniz");
		int sayi2 = scanner.nextInt();
		if (sayi1>sayi2){
			System.out.println("Büyük olan sayı: " +  sayi1);
			
		}
		else if (sayi1<sayi2) {
			System.out.println("Büyük olan sayi: " + sayi2 );
		}
		else   {
			System.out.println("Sayılar eşittir");
			
		}
		

	}

}
