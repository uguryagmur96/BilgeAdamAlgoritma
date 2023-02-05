package lesson003;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// Girilen sayının 5 in kuvveti olup olmadğını 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayı giriniz:");
		int sayi = scanner.nextInt();
		int i=1;
		
		while(sayi>1) {
		if (sayi%5!=0) {
			i=2;
			System.out.println("5in kuvveti değildir");
			break;}
		
		sayi= sayi/5;
		} if(1==i) {
			System.out.println("Sayı 5'in kuvvetidir");
		} 
			

}
}