package skoleHashSet;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Studerende {
    
    private int studieNr;
    private String navn;
    private Set<Integer> karakterer = new HashSet<>();
    
    
    public Studerende(int studieNr, String navn, Set<Integer> karakterer) {
        this.studieNr = studieNr;
        this.navn = navn;
        this.karakterer = karakterer;
    }
    
    public String getNavn() {
        return navn;
    }
    
    public void setNavn(String navn) {
        this.navn = navn;
    }
    
    public int getStudieNr() {
        return studieNr;
    }
    
    public void addKarakter(int karakter) {
        karakterer.add(karakter);
    }
    
    public Set<Integer> getKarakterer() {
        return new HashSet<>(karakterer);
    }
    
    public String toString() {
        return "Navn: " + navn +
                "\nStudienr: " + studieNr +
                "\nKarakterer: " + karakterer +
                "\n";
    }
    
}

