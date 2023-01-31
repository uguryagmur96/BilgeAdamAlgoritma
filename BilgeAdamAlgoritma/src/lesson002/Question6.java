package lesson002;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Haftanın kaçıncı günündesiniz?");
		int gun = scanner.nextInt();
		String durum = "Haftaiçi";
		if (gun ==6 || gun ==7) {
			durum = "HaftaSonu";
		}
		
		
		switch (gun) {
		case 1: System.out.println("Pazartesi" + durum);
		break;
		case 2: System.out.println("Salı" + durum);
		break;
		case 3: System.out.println("Çarşamba" + durum);
		break;
		case 4: System.out.println("Perşembe" + durum);
		break;
		case 5: System.out.println("Cuma" + durum);
		break;
		case 6: System.out.println("Cumartesi" + durum);
		break;
		case 7: System.out.println("Pazar" + durum);
		
			
			break;

		default: System.out.println("Lütfen 1 ile 7 arasında bir sayı giriniz");
			break;
		}

	}
}
