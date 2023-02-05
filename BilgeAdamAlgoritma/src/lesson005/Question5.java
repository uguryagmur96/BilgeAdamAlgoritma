package lesson005;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// dizi içerisinde 2 ve 4 ün kaç kere geçtiğini bul
		// hangisnin daha fazla olduğunu bul
		// hangi rakamları saymak istiyorsak kullanıcıdan alalım >>>> ÖDEV!!!!! (aşağıdaki kod bloğu sadece ödev için 
		// istenen gerekliliklere göre yazılmıştır)
		
		int[] array = { 1, 3, 4, 4, 4, 4, 2, 2, 9, 8, 8 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Aramak istediğiniz ilk sayıyı giriniz");
		int sayi1=sc.nextInt();
		System.out.println("Aramak istediğiniz ikinci sayıyı giriniz");
		int sayi2=sc.nextInt();
		int sayac1=0;
		int sayac2=0;
		
		for (int i=0;i<array.length;i++) {
			if (array[i]==sayi1) {
				sayac1++;
			}else if (array[i]==sayi2) {
				sayac2++;
			}
		} System.out.println("dizi içerisinde"+ sayi1 + " rakamı " + sayac1 + "kere geçiyor");
		System.out.println("dizi içerisinde"+ sayi2 + "rakamı " + sayac2 + "kere geçiyor");
		if (sayac1<sayac2)
			System.out.println("dizi içerisinde"+sayi1+  "rakamı daha fazla geçiyor ");
		else if (sayac2==sayac1)
			System.out.println("dizi içerisinde iki rakam da eşit sayıda bulunmaktadır ");
		else
			System.out.println("dizi içerisinde" + sayi2 + "rakamı daha fazla geçiyor ");

	}

}
