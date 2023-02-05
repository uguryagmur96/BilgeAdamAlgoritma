package lesson005;
import java.util.Random;
import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		// 0 ile 100 arasında int random sayı üreteceğiz
		// Kullanıcıdansayı tahmin etmesini isteyeceğiz.
		// eğer kullanıcının bulması gereken sayıdan az ise tahminizi yükseltin az ise azaltın diyelim.
		// Doğru tahmin ettiği zaman kaçıncı denemesinde bulduğunu söyleyelim.
		Scanner scan=new Scanner(System.in);

		Random sayi= new Random();
		int a =sayi.nextInt(0,100);
		int sayac=0;
		boolean check =true;
		
		while(check) {
			System.out.println("Sayı giriniz:");
			int sayi1=scan.nextInt();
			sayac++;
			if(a == sayi1) {
				
				System.out.println("Tebrikler!!");
				System.out.println(sayac + "'kere denemede doğru sayıyı buldunuz");
				check=false;
			} else if(sayi1<a) {
				System.out.println("Lütfen tahminizi yükseltin");
				
			} else if(sayi1>a) {
				System.out.println("Lütfen tahminizi azaltın");
				
			}
		}
		
		
		
		
		
		
	}

}
