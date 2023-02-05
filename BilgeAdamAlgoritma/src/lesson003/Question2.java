package lesson003;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// Gİrilen sayıya kadar olan sayıların toplamını yazdırın
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayı Giriniz");
		int sinir = scanner.nextInt();
		int toplam =0;
		for (int i =1; i<=sinir;i++) {
			toplam = toplam+i;
		} System.out.println(toplam);
		

	}

}
