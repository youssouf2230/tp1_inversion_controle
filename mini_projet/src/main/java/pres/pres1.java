package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class pres1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("metier","dao");
        IMetier metier = applicationContext.getBean(IMetier.class);
        metier.effectuerVersement(100);
        metier.effectuerRetrait(100);
        metier.afficher();

    }
}
