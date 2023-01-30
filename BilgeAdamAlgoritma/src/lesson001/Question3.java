package lesson001;

public class Question3 {

	public static void main(String[] args) {
		int ürün = 100;
		int gider = ((ürün/100)*18)+ ((ürün/100)*15);
		int ham = ürün - gider;
		System.out.println("ham satış fiyatı: " + ham);

	}

}
