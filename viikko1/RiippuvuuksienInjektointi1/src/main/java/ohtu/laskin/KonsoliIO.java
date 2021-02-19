
package ohtu.laskin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Component;
import java.util.Scanner;

@Component
public class KonsoliIO implements IO {
    private Scanner lukija;

    public KonsoliIO() {
        lukija = new Scanner(System.in);
    }    
    
    public int nextInt() {
        return lukija.nextInt();
    }

    public void print(String m) {
        System.out.println(m);
    }
    
}
