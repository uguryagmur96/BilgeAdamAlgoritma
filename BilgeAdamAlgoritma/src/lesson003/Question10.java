package lesson003;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// Kulllanıcıdan sürekli sayı alınacak
		// Kullanıcı 0 a basınca aldığımız sayıların çarpımı
		
             Scanner scan = new Scanner(System.in);
             int x;
             int toplam=1;
             boolean durum = false;
             
             while (durum =true) {
            	 
                 System.out.println("Sayı Giriniz");
                 x=scan.nextInt();
                 if (x !=0) {
                	 toplam = toplam*x;
                	 durum = false;
                 }else if (x==0) { 
                	 durum=true;
                	 System.out.println("Toplam sayı:" + toplam);
                	 break;
                 }
                
             } 
        
          

	

	}

}
