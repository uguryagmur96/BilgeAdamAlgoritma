package lesson004;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// Verilen kelimenin içinde kaç tane e olduğunu bulan algoritma
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Kelime Giriniz");
		String kelime = scan.nextLine();
		int e=0;
		for (int i=0; i<kelime.length(); i++) {
			if (kelime.charAt(i)== 'e') {
				e ++;
			}
		} System.out.println("Toplam e sayısı: " + e);
		// Harflerin hepsini büyük yapma
		System.out.println(kelime.toUpperCase());
		// Harflerin hepsini küçük yapma
		System.out.println(kelime.toLowerCase());

	}

}
