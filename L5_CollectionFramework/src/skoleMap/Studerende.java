package skoleMap;


import java.util.*;

public class Studerende {
    
    private int studieNr;
    private String navn;
    private Map<Integer, Studerende> karakterer;
    
    public Studerende(int studieNr, String navn) {
        this.studieNr = studieNr;
        this.navn = navn;
        this.karakterer = new HashMap<>();
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
        Set<Integer> keySet = karakterer.keySet();
        for (Integer key : keySet) {
            Studerende id = karakterer.get(key);
            if (studieNr != 0) {
                karakterer.put(karakter, id);
            }
        }
        
    }
    
    public Map<Integer, Studerende> getKarakterer() {
        return new HashMap<>();
    }
    
    public String toString() {
        return "Navn: " + navn +
                "\nStudienr: " + studieNr +
                "\nKarakterer: " + karakterer +
                "\n";
    }
}

