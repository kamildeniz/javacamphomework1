package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'A';
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("kalın sesli harftir");
			break;

		default:
			System.out.println("ince seslidir");
			break;
		}

	}
}