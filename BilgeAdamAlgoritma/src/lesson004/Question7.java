package lesson004;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
//		 Menu 1-Dışarıdan bir kelime ve bir harf girilsin  eğer kelimemizin için de o 
//	    harf varsa kaç tane olduğunu ve index numaralarını yazdırın.
//	    eğer harfi içermiyorsa bir çıktı aradağınız harf yok gibi

//		2-Dışarıdan bir kelime giriniz daha sonra değiştirmek istediğiniz harfi
//		  giriniz daha sonra hangi harfle değiştireceğinizi giriniz Eğer kelimemiz
//		  içerisinde o harf varsa değiştirsin.

//		//Ödevl
//		3-Dışarıdan Girilen bir kelimeyi ters çevirip yazdıralım.Polindrom olup
//		 * olmadığını bulunuz(kek,iki,kabak,kayak)

//		4- Sistemden çıksın

		Scanner scan= new Scanner(System.in);
		
		boolean check=true;
		
		while(check) {
			
			System.out.println("######String İşlemlerine Hoşgeldiniz########");
			System.out.println("1- Harf Saydırma");
			System.out.println("2- Harf Değiştirme");
			System.out.println("3- Polindrom Kontrolü");
			System.out.println("4-Kelimenin harflerin arasına ? koy"); // en sona koymayacağız
			System.out.println("5- Kelimenin ilk üç indexini alıp sonuna ... koyun");
			System.out.println("6- Kelimenin ilk üç indexini alıp kelimenin geri kalan harflerini . ile değiştirin");
			System.out.println("7- Çıkış");
			int secim=scan.nextInt();
			scan.nextLine();
			
			switch(secim) {
			case 1:
				String index = "";
				int sayac=0;
				System.out.println("Bir kelime giriniz");
				String kelime=scan.nextLine();
				kelime.toLowerCase().trim();
				System.out.println("aradığınız harfi giriniz");
				String harf= scan.nextLine();
				harf.toLowerCase().trim();
				if (kelime.contains(harf)) {
					for (int i=0; i<kelime.length();i++) {
						if (kelime.charAt(i) == harf.charAt(0)) {
							sayac++;
							index += i+",";
						}
					}
				} else {
					System.out.println("Aradığınız harf kelimenin içinde yoktur");
				}
				
				System.out.println("Girdiğiniz kelimedeki aradığınız harf sayısı " + sayac + "'dir");
				System.out.println("Aradığınız harfin yer sırası: " +index.substring(0,( index.length()-1)));
				break;
				
			case 2:
				System.out.println("Bir kelime giriniz");
				String kelime1=scan.nextLine();
				kelime1.toLowerCase().trim();
				System.out.println("değiştirmek istediğiniz harfi giriniz");
				String harf1= scan.nextLine();
				harf1.toLowerCase().trim();
				System.out.println("yeni harfi giriniz harfi giriniz");
				String dharf= scan.nextLine();
				dharf.toLowerCase().trim();
				
				if (kelime1.contains(harf1)) {
				kelime1=kelime1.replace(harf1, dharf);	
				} else {
					System.out.println("Girdiğiniz harf kelime içinde mevcut değil");
				}
				
				System.out.println(kelime1);
				
			case 3:
				System.out.println("Bir kelime giriniz");
				String kelime2=scan.nextLine();
				kelime2.toLowerCase().trim();
				String ind="";
				for (int i=kelime2.length()-1; i>=0;i--) {
					ind+=kelime2.charAt(i);
					}
				if (kelime2.equals(ind)) {
					System.out.println("Girdiğiniz kelime Palindrome bir kelimedir");
					System.out.println("Girilen kelime: " + kelime2);
					System.out.println("Tersten yazılmış hali: " + ind);
					} else {
						System.out.println("Girdiğiniz kelime Palindrome bir kelime değildir");
						System.out.println("Girilen kelime: " + kelime2);
						System.out.println("Tersten yazılmış hali: " + ind);
					}
				
			case 4:
				System.out.println("Bir kelime giriniz");
				String kelime3=scan.nextLine();
				kelime3.toLowerCase().trim();
				String sayac1="";
				for (int i=0;i<kelime3.length();i++) {
					sayac1 +=kelime3.charAt(i)+ "?";
				}
				System.out.println(sayac1.substring(0,sayac1.length()-1));
				
			case 5:
				System.out.println("Bir kelime giriniz");
				String kelime4=scan.nextLine();
				kelime4.substring(0,3);
				String eklenti="...";
				System.out.println(kelime4 + eklenti);
				
			case 6:
				System.out.println("Bir kelime giriniz");
				String kelime5=scan.nextLine();
				char nokta='.';
				for (int i=0; i<kelime5.length();i++) {
					if (i>2) {
						kelime5.replace(kelime5.charAt(i), nokta);
					}
				} System.out.println(kelime5);
				
				
			case 7:
				check=false;
				System.out.println("Hoşçakalın...");
			} 
			
			
		} 
		
		
		

	}

}
