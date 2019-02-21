package TextVerarbeiter;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Textverarbeiter textV = new Textverarbeiter();

		System.out.println("TEXTVERARBEITER");
		System.out.println("---------------");

		System.out.println(
				"v = Vokalfilter\nk = Konsonanntenfilter\nu = Umlautfilter\nz = Zeichenfilter\no = Objektfilter\nw = Wortfilter");
		char nochmal = ' ';

		do {
			System.out.println("Geben Sie Ihren Text ein > ");
			String text = scan.nextLine();

			System.out.println("Geben Sie den Filtertyp ein (v / k / u / z / o / w) >");
			String filterTyp = scan.nextLine();

			textV.filterAuswahl(filterTyp);

			String resultat = textV.filterText(text);
			System.out.println("Resultat: " + resultat);

			System.out.println("Nochmal? (y / n)");
			nochmal = scan.next().charAt(0);

		} while (nochmal == 'y');

		System.out.println("Tschüss :)");
	}
}
