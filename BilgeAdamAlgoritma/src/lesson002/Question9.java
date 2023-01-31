package lesson002;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir karakter Giriniz");
		char k  = scanner.next().charAt(0);
		
		if (k == 'a'||k == 'e'||k == 'ı' ||k == 'i' ||k == 'o' ||k == 'ö' ||k == 'u' ||k == 'ü' ) {
			System.out.println("Girilen karakter ünlüdür");
		} else {
			System.out.println("Girilen karakter ünsüz veya alfabetik değildir");
		}

	}

}
