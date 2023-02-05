package lesson003;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		// Girilen sayıya kadar tek olan sayıların toplamı
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen sayı giriniz");
		int sayi = scanner.nextInt();
		int toplam=0;
		for(int i=1; i<=sayi;i++) {
			if (i%2!=0) {
				toplam= toplam+i;
			} else {
				continue;
			}
		} System.out.println(toplam);

	}

}
