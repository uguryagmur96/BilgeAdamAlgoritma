package lesson004;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// Kullanıcıdan mail pass, repass alalım
		// email kontrol edilecek (@ var mı?)
		// mail formatında uygun değildir.
		
		boolean check=true;
		boolean check2=true;
		Scanner scan = new Scanner(System.in);
		
		
		
		while (check) {
			System.out.println("mail adresini giriniz");
			String mail = scan.nextLine();
			mail.toLowerCase().trim();
			if (mail.contains("@hotmail.com") || mail.contains("@gmail.com")) {
				while (check2) {
					System.out.println("Maksimum 8 karakterden oluşabilecek bir şifre girin");
					String pass = scan.nextLine();
					pass.toLowerCase().trim();
					System.out.println("Şifrenizi tekrardan girin");
					String rpass=scan.nextLine();
					rpass.toLowerCase().trim();
					if (pass.equals(rpass) && pass.length()<9) {
						System.out.println("Kaydınız başarıyla oluşturuldu " + mail);
						check=false;
						check2=false;
					} else {
						System.out.println("Lütfen kurallara uygun bir şekilde şifrenizi tekrar oluşturun");
					}
				}
			} else {
				System.out.println("mail adresini hatalı girdiniz tekrar deneyin");
			}
		}
		
		

	}

}
