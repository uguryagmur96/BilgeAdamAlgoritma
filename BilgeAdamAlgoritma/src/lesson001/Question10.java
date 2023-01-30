package lesson001;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Birinci Sayıyı Giriniz");
		int sayi1 = scanner.nextInt();
		System.out.println("İkinci Sayıyı Giriniz");
		int sayi2 = scanner.nextInt();
		System.out.println("Üçüncü Sayıyı Giriniz");
		int sayi3 = scanner.nextInt();
		
		int enBuyukSayi = sayi1;
		
		if (enBuyukSayi<sayi2) {
			enBuyukSayi = sayi2;
		} else if (enBuyukSayi<sayi3) {
			enBuyukSayi = sayi3;
		}
System.out.println("En Büyük Sayı: " + enBuyukSayi);
	}

}
