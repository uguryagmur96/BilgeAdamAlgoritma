package lesson001;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		//int sayi1 = 12;
		//int sayi2 = 24;
		//int sonuc;
		//sonuc = sayi1 * sayi2;
		//System.out.println("Sonuç: " + sonuc);
		
      Scanner scanner = new Scanner(System.in);
      System.out.println("Birinci sayi giriniz");
      int sayi1 = scanner.nextInt();
      System.out.println("İkinci sayiyi giriniz");
      int sayi2 = scanner.nextInt();
      int sonuc = sayi1 * sayi2;
     
      System.out.println("sonuç:" + sonuc);
      
      
	}

}
