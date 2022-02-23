package skoleHashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {
    
    public static void main(String[] args) {
    
       Skole skole = new Skole("Syddjurs Friskole");
       Set<Skole> studerendes = new HashSet<>();
       Set<Integer> karakter = new HashSet<>();
       Studerende studerende = new Studerende(23, "Tinna", karakter);
       Studerende studerende1 = new Studerende(34,"Ben",karakter);
       skole.addStuderende(studerende);
       skole.addStuderende(studerende1);
       studerende.addKarakter(12);
       studerende.addKarakter(10);
       studerende1.addKarakter(7);
       studerende1.addKarakter(4);
       
    
        System.out.println(skole.getStuderendes());
        System.out.println(skole.gennemsnit());
        System.out.println(skole.findStuderende(23));
    }
}
