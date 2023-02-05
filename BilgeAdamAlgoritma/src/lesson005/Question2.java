package lesson005;

public class Question2 {

	public static void main(String[] args) {
		// // a ile biten kelimelerin yerine ? koyulacak
		
		String[] dizi= {"Amerika", "Almanya", "İsveç", "Türkiye", "Danimarka"};
		String a="a";
		String z="?";
		String  dizi1= "";
		for (int i=0; i<dizi.length; i++) {
			if (dizi[i].equalsIgnoreCase(a)) {
				
			dizi1 =	dizi[i].replace(dizi[i], z);
			}
		} System.out.println(dizi1);

	}

}
