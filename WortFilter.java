package TextVerarbeiter;

public class WortFilter extends Filter {

	String worter;
	
	public WortFilter(String worter) {
		
		this.worter = worter;
		this.name = "w";
	}

	public String filter(String filtern) {

		String[] dazwischen = worter.split(",");

		for (int i = 0; i < dazwischen.length; i++) {

			filtern = filtern.toLowerCase().replace(dazwischen[i].trim(), "");
		}

		return filtern;
	}

}
