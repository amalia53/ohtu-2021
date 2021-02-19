package ohtu;

import org.springframework.beans.context.ApplicationContext;
import org.springframework.beans.context.annotation.AnnotationConfigApplicationContext;
import ohtu.laskin;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        Laskin laskin = ctx.getBean(Laskin.class);
        laskin.suorita();
    }
}