package TextVerarbeiter;

public class Textverarbeiter {

	Filter filter;

	Filter[] allefilter = new Filter[] { new KonsonanntenFilter(), new VokalFilter(), new UmlautFilter(),
			new ZahlenFilter(), new ObjektFilter(),
			new WortFilter("software, hardware, baum,  computer, informatik, programmieren, pc") };

	public void filterAuswahl(String filterTyp) {

		for (int i = 0; i < allefilter.length; i++) {
			if (filterTyp.equals(allefilter[i].name)) {
				filter = allefilter[i];
			}
		}
	}

	public String filterText(String filterText) {

		filterText = filter.filter(filterText);
		return filterText;
	}
}
