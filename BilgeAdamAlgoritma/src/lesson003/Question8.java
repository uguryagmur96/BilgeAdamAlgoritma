package lesson003;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// Girilen sayının basamaklarının toplamını bulan program
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayı Giriniz");
		int x=scanner.nextInt();
		int y;
		int toplam =0;
	    do {
	    	 y= x%10;
	    	 x=x/10;
	    	 toplam = toplam+y;
	    } while (x>0); 
	    	System.out.println(toplam);
		while (x>0) {
			y=x%10;
			toplam = toplam+y;
			x=x/10;
		} System.out.println(toplam);


	}

}
