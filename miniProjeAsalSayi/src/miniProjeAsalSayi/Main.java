package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int sayi = 488651211;
		boolean asallik = true;
		if (sayi==1) {
			System.out.println("sayi asal değil");
			return;
		}
		if (sayi<1) {
			System.out.println("geçersiz sayı");
		return;
		}
		
		for (int i = 2; i < (sayi / 7) + 1; i++) {
			if (sayi % i == 0) {
				asallik = false;
				break;
			}
			

		}
		if (asallik) {
			System.out.println("sayı asal");
		}
		else {
			System.out.println("Sayı asal Değil");
		}
	}

}
