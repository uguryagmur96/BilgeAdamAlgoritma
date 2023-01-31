package lesson002;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// dışarıdan ik tane sayısal değer alalım
		// iki sayının toplamı çift ise true değilse false
		// strin olarak yazdırılmayacak
		//en sonda da sayıların toplamının yarısını yazdıralım.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Birinci sayıyı giriniz");
		int sayi1 = scanner.nextInt();
		System.out.println("İkinci Sayıyı Giriniz");
		int sayi2 = scanner.nextInt();
		
		boolean eq = (sayi1 + sayi2)%2 == 0;
		double half = (sayi1 + sayi2)/2;
		System.out.println(eq + " " + half);
		
			
		
				
	}

}
