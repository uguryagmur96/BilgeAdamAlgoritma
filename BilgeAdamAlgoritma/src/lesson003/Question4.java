package lesson003;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// Girilen sayının faktöriyelini bulan program
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayı giriniz");
		int x = scanner.nextInt();
		int toplam =1;
		
		for(int y=1;y<=x;y++) {
			toplam= toplam *y ;
		} System.out.println("Faktörüyel:" + toplam);

	}

}
