package lesson005;

public class Question4 {

	public static void main(String[] args) {
		// Çift ve tek şeklinde çıktı vericek
		// dizideki sayıların toplamını verecek
		
		int[] sayilar = { 2,4,10,5 };
		int toplam=0;
		for (int i=0; i<sayilar.length;i++) {
			toplam += sayilar[i];
			if (sayilar[i]%2==0) {
				System.out.println("Bu sayı çifttir" +sayilar[i]);
			} else {
				System.out.println("Bu sayı tektir" +sayilar[i]);
			}
		} System.out.println("Sayıların toplamı");
	}

}
