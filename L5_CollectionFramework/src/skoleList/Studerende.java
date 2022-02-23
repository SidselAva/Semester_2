package skoleList;


import java.util.ArrayList;
import java.util.List;

public class Studerende {
    
    private int studieNr;
    private String navn;
    private List<Integer> karakterer = new ArrayList<>();
    
    
    public Studerende(int studieNr, String navn, List<Integer> karakterer) {
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
    
    public List<Integer> getKarakterer() {
        return new ArrayList<>(karakterer);
    }
    

    public String toString() {
        return "Navn: " + navn +
                "\nStudienr: " + studieNr +
                "\nKarakterer: " + karakterer;
    }
    
  
}

