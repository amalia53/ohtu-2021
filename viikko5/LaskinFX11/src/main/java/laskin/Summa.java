package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Summa extends Komento {
	
	int arvo;

	public Summa(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
		super(tuloskentta, syotekentta, nollaa, undo, sovellus);
	}

	@Override
	public void suorita() {
		this.arvo = Integer.parseInt(syotekentta.getText());
		sovellus.plus(arvo);
        syotekentta.setText("");
        tuloskentta.setText("" + sovellus.tulos());
        onkoTulosNolla(sovellus.tulos());
	}

	@Override
	public void peru() {
		sovellus.miinus(arvo);
		syotekentta.setText("");
        tuloskentta.setText("" + sovellus.tulos());
        onkoTulosNolla(sovellus.tulos());
	}

}
