package lesson003;

public class Question5 {

	public static void main(String[] args) {
		// 1 den 100 e kadar olan çift sayıların toplamını tek sayıların toplamına oranını bulan
		
		double cift =0;
		double tek=0;
		
		for (int i=2;i<=100;i+=2) {
			cift= cift+i;
		}
		for (int j=1;j<=99;j+=2) {
			tek= tek+j;
		}
		
		double sonuc= cift/tek;
		System.out.println("Oran:" + sonuc );

	}

}
