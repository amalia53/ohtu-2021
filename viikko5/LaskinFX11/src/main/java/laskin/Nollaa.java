package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Nollaa extends Komento{

	int arvo;
	
	public Nollaa(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
		super(tuloskentta, syotekentta, nollaa, undo, sovellus);
	}

	@Override
	public void suorita() {
		this.arvo = Integer.parseInt(tuloskentta.getText());
		sovellus.nollaa();
		syotekentta.setText("");
        tuloskentta.setText("" + sovellus.tulos());
        onkoTulosNolla(sovellus.tulos());
	}

	@Override
	public void peru() {
		sovellus.plus(arvo);
		tuloskentta.setText("" + arvo);
	}

}
