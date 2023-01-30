package lesson001;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("TL para cinsinden giriniz");
		float tl = scanner.nextFloat();
		float usd = 18.90F;
		float dovizBozum = tl / usd;
		System.out.println("Elinizde " + dovizBozum + " miktarda usd var");
		
		
		

	}

}
