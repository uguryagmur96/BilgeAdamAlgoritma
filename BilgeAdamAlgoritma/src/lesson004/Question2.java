package lesson004;

import java.util.Scanner;

public class Question2 {
	
	public static void main(String[] args) {
		// Klavyeden girilen 0ile 100 arasında 5 adet sayıdan en büyük en küçük olanı bulan program
		Scanner scan = new Scanner(System.in);
		int enBuyuk=0;
		int enKucuk=101;
		int i=1;
		
		while (i<6) {
			System.out.println("Sayı giriniz");
			int sayi= scan.nextInt();
			if (sayi>0 && sayi<101) {
				i++;
				if (sayi>enBuyuk) {
					enBuyuk=sayi;
				} if (sayi<enKucuk) {
					enKucuk=sayi;
				} else 
					continue;
			}
		} 
		System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
	}

}
