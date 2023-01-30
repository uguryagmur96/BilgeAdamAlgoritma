package lesson001;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// javada primitive tipler nelerdir? birbirlerinden farkı nelerdir?
		
		//Verilen isim ve soy isim değelerlerini 
		
	//	String isim = "Uğur";
		//String soyisim = "Yağmur";
		
		//System.out.println("Hello: " + isim + " " + soyisim);
		
		Scanner input = new Scanner(System.in);
		System.out.println("İsim Giriniz");
		String isim;
		isim = input.nextLine();
		System.out.println("Soyisim Giriniz");
		String soyİsim;
		soyİsim = input.nextLine();
		
		System.out.println(isim + soyİsim);
		
		
		
		

	}

}
