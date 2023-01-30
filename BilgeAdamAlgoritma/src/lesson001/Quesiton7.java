package lesson001;

import java.util.Scanner;

public class Quesiton7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayı Giriniz:");
		int sayi = scanner.nextInt();
		
		if (sayi%2==0) {
			System.out.println("Sayınız çifttir");
		}else {
			System.out.println("Sayınız tektir");
		}

	}

}
