package ohtu.verkkokauppa;

import java.util.ArrayList;

public interface Bookkeeping {

	void lisaaTapahtuma(String tapahtuma);

	ArrayList<String> getTapahtumat();

}