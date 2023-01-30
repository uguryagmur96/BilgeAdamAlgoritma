package lesson001;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Not ortalamasını giriniz");
		double ort = scanner.nextDouble();
		
		if (ort>=90) {
			System.out.println("AA ile geçtiniz");
		} else if (ort >=80) {
			System.out.println("BB ile geçtiniz");
		} else if (ort>=70) {
			System.out.println("CC ile geçtiniz");
		} else if (ort>=60) {
			System.out.println("DD ile geçtiniz");
		} else {
			System.out.println("Kaldınız");
		}
		
		

	}

}
