package skoleTreeset;


import java.util.Set;
import java.util.TreeSet;

public class App {
    
    public static void main(String[] args) {
    
       Skole skole = new Skole("Syddjurs Friskole");
       Set<Studerende> studerendes = new TreeSet<>();
       Set<Integer> karakter = new TreeSet<>();
       Studerende studerende2 = new Studerende(23, "Ben");
       Studerende studerende1 = new Studerende(4,"Ben");
       studerendes.add(studerende1);
       skole.addStuderende(studerende1);
       studerende1.addKarakter(7);
       studerende1.addKarakter(4);
       StuderendeComparator studerendeComparator = new StuderendeComparator();

    
        System.out.println(studerendeComparator.compare(studerende1,studerende2));
        System.out.println(studerendes);
        System.out.println(skole.gennemsnit());
        System.out.println(skole.findStuderende(23));
    }
}
