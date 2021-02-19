
package ohtu.verkkokauppa;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Component;

@Component
public class Kirjanpito implements Bookkeeping {

    private ArrayList<String> tapahtumat;
    
    @Autowired
    public Kirjanpito() {
        tapahtumat = new ArrayList<String>();
    }
    
    @Override
	public void lisaaTapahtuma(String tapahtuma) {
        tapahtumat.add(tapahtuma);
    }

    @Override
	public ArrayList<String> getTapahtumat() {
        return tapahtumat;
    }       
}
