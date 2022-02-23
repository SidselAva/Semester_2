package Opgave5;

import java.util.ArrayList;
import java.util.List;

public class Kunde {
    
    private String navn;
    private List<BogTitel> bogTitler = new ArrayList<>();
    
    public Kunde(String navn) {
        this.navn = navn;
    }
    
    public String getNavn() {
        return navn;
    }
    
    public void setNavn(String navn) {
        this.navn = navn;
    }
    
    public List<BogTitel> getBogTitler() {
        return new ArrayList<>(bogTitler);
    }
    
    public String toString() {
        return navn;
    }
    
    public void addBogTitel(BogTitel bogTitel) {
        bogTitler.add(bogTitel);
    }
}
