package lesson004;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// Verilen kelimenin harflerini alt alta 
		// java

		Scanner scan = new Scanner(System.in);
//		String k ="java";
//		
//		System.out.println("1. harf: " + k.charAt(0));
//		System.out.println("2. harf: " + k.charAt(1));
//		System.out.println("3. harf: " + k.charAt(2));
//		System.out.println("4. harf: " + k.charAt(3));
          
		
		// Kullanıcıdan string değer alalım.
		// indexlerini teker teker yazalım
		
		System.out.println("Bir karakter veya metin giriniz");
		String kelime = scan.nextLine();
		
		for (int i=0; i <kelime.length();i++) {
			System.out.println(i+ "'inci karakter: " + kelime.charAt(i));
			
		}
		
	}

}
