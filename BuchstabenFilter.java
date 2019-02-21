package TextVerarbeiter;

public abstract class BuchstabenFilter extends Filter {

	String buchstaben;

	public String filter(String filtern) {

		char[] dazwischen = buchstaben.toCharArray();

		for (int i = 0; i < dazwischen.length; i++) {
			filtern = filtern.replace(dazwischen[i], ' ');
		}

		return filtern;
	}
}
