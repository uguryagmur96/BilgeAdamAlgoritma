package lesson002;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir karakter giriniz");
		char k  = scanner.next().charAt(0);
		int ascii =k;
		 if (ascii >=65 && ascii<91) {
			 System.out.println("Girilen karakter alfabededir");
		 } else if (ascii >=97 & ascii<123) {
			 System.out.println("Girilen karakter alfabededir");
		 } else {
			 System.out.println("Girilen karakter alfabede değildir");
		 }

	}

}
