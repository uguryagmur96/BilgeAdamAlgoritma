package lesson003;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		// Girilen sayının hangi basamağında hangi rakam var
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayı Giriniz");
		int sayi = scanner.nextInt();
		int i=1;
		
		while (sayi>0) {
			System.out.println(i + "'ler basamağı" + sayi %10);
			sayi= sayi/10;
			i = i*10;
		}
		
		
		

	}

}
