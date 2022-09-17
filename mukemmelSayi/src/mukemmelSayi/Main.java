package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		int number =27,toplam=0;
		
		for (int i = 1; i < (number/2)+1; i++) {
			if (number%i==0) {
				toplam =toplam+ i;
				
			}
		}
		System.out.println(toplam);
		if (toplam==number) {
			System.out.println("mükemmel sayı");
		} else {
			System.out.println("sayı mükemmel değil");
		}
	}

}
