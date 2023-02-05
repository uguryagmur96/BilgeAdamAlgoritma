package lesson005;

import java.util.Iterator;

public class Question6 {

	public static void main(String[] args) {
		// Bir dizide en büyük ikinci sayıyı bulan program >>>Ödev!!!!
		
//		int nums[] = { 1, 13, 13, 13, 2, 5, 13, 1 };
//		int kontrol =0;
//		int enBuyuk=0;
//		int secondTop=0;
//		 for (int i = 0; i < nums.length; i++) {
//			 if (nums[i] > enBuyuk) {
//				 enBuyuk = nums[i];
//			 }
//			
//		} for (int i = 0; i < nums.length; i++) {
//			if (kontrol < nums[i]) {
//				kontrol = nums[i];
//			}
//			if (kontrol == enBuyuk) {
//				kontrol=0;
//				continue;
//			} else if (secondTop < kontrol) {
//				secondTop = kontrol;
//			}
//			
//			
//		}
//		System.out.println("En büyük ikinci sayı:" + secondTop);
	
		
		
		//>>>Ödev!!!!
		// bir dizide eğer 13 var ise hem 13 ü hem de bir sonraki indexi toplama işlemine almayacak. bu dizideki elemanların toplamını bulalım.
		 int nums2[] = { 1, 13, 5, 13, 2, 5, 7, 1 };
		 
		 int toplam=0;
		 
		 for (int i = 0; i < nums2.length;) {
			if (nums2[i]==13) {
				i=i+2;
				continue;
			} else {
				toplam+=nums2[i];
				i++;
			}
		}
		 System.out.println(toplam);

	}

}
