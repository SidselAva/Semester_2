package Opgave5;

import java.util.*;

public class Saelger implements Observer {
    
    private String navn;
    private TreeSet<BogTitel> bogTitels = new TreeSet<>();
    
    public Saelger(String navn) {
        this.navn = navn;
    }
    
    @Override
    public void update(Subject s) {
        TreeSet<List<BogTitel>> kundes = new TreeSet<>();
        for (BogTitel b: bogTitels) {
            for (int i = 0; i < b.getKunder().size(); i++) {
                if (b.getKunder().get(i).getBogTitler().equals(s)) {
                    kundes.add(b.getKunder().get(i).getBogTitler());
                    System.out.println(kundes);
                }
            }
        }
        
        
    
    }
    
    public String toString() {
        return "En sælger med navn " + navn;
    }
}
