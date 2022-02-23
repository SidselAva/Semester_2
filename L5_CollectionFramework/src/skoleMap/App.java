package skoleMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class App {
    
    public static void main(String[] args) {
    
       Skole skole = new Skole("Syddjurs Friskole");
       Map<Integer, Studerende> studerendes = new HashMap<>();
       
       Set<Integer> karakter = new HashSet<>();
       Studerende studerende = new Studerende(23, "Tinna");
       Studerende studerende1 = new Studerende(34,"Ben");
       skole.addStuderende(studerende);
       skole.addStuderende(studerende1);
       studerendes.put(223, studerende1);
       studerende.addKarakter(12);
       studerende.addKarakter(10);
       studerende1.addKarakter(7);
       studerende1.addKarakter(4);
       
    
        System.out.println(skole.getStuderendes());
        System.out.println(skole.gennemsnit());
        System.out.println(skole.findStuderende(23));
    }
}
