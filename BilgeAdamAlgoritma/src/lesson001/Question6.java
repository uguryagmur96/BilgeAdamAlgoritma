package lesson001;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vize Notunu Giriniz:");
        int vize = scanner.nextInt();
        System.out.println("Final Notunu Giriniz");
        int fina = scanner.nextInt();
        double ort = (vize * 0.40) + (fina * 0.60);
        
        if (ort>=50) {
        System.out.println("Geçtiniz");
        }
        else {
        	System.out.println("Kaldınız");
        	
        }
      

}
}

	
