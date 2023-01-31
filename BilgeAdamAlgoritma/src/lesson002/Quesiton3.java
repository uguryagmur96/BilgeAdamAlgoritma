package lesson002;

import java.util.Scanner;

public class Quesiton3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tk =444;
		int mk = 555;
		System.out.println("Telefonunuza gelen kodu giriniz");
		int telkod = scanner.nextInt();
		System.out.println("Mail adresinize gelen kodu giriniz");
		int mailkod = scanner.nextInt();
		
		if (tk == telkod && mk == mailkod) {
			System.out.println("Sisteme başarıyla kayıt oldunuz");
		} else if (tk !=telkod && mk != mailkod) {
			System.out.println("Girdiğiniz iki doğrulama kodu da hatalıdır");
		} else if (tk != telkod) {
			System.out.println("Girdiğiniz telefon doğrulama kodu hatalıdır");
		} else if (mk != mailkod) {
			System.out.println("Girdiğiniz mail kodu hatalıdır");
		}
		

	}

}
