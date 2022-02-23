package skoleTreeset;


import java.util.Set;
import java.util.TreeSet;

public class Studerende implements Comparable<Studerende> {
    
    private int studieNr;
    private String navn;
    private Set<Integer> karakterer = new TreeSet<>();
    
    
    public Studerende(int studieNr, String navn) {
        this.studieNr = studieNr;
        this.navn = navn;
        
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
        return new TreeSet<>(karakterer);
    }
    
    public String toString() {
        return "Navn: " + navn +
                "\nStudienr: " + studieNr +
                "\nKarakterer: " + karakterer +
                "\n";
    }
    
    
    @Override
    public int compareTo(Studerende o) {
        return studieNr - o.getStudieNr();
    }
}

