package lesson001;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("1. kenarı giriniz:");
		int k1 = scanner.nextInt();
		System.out.println("2. kenarı giriniz");
		int k2 = scanner.nextInt();
		System.out.println("3. kenarı giriniz");
		int k3 = scanner.nextInt();
		
		if (k1>0 && k2>0 && k3>0 ) {
			if (k1 == k2 && k2 == k3) {
				System.out.println("Eşkenar Üçgen");
			} else if (k1 == k2 || k1 == k3 || k2 == k3) {
				System.out.println("İkizkenar Üçgendir");
			} else {
				System.out.println("Çeşitkenar üçgendir");
			}
		}
		
		

		
}


}