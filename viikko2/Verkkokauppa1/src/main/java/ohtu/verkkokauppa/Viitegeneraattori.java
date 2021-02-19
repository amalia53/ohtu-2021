
package ohtu.verkkokauppa;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Component;

@Component
public class Viitegeneraattori implements RefGen {

//    private static Viitegeneraattori instanssi;
//
//    public static Viitegeneraattori getInstance() {
//        if (instanssi == null) {
//            instanssi = new Viitegeneraattori();
//        }
//
//        return instanssi;
//    }
    
    private int seuraava;
    @Autowired
    public Viitegeneraattori(){
        seuraava = 1;    
    }
    
    public int uusi(){
        return seuraava++;
    }
}