package Opgave5;

import java.util.HashSet;
import java.util.Set;

public class App {
    
    public static void main(String[] args) {
        
        BogTitel bogTitel = new BogTitel("Dantes Inferno", 2);
        BogTitel bogTitel1 = new BogTitel("Mom",2);
       
        Set<Observer> observers = new HashSet<>();
        Observer saelger = new Saelger("Tonni");
        Observer indkoeber = new Indkoeber("Martin");
        
        observers.add(saelger);
        observers.add(indkoeber);
        observers.add(bogTitel);
       
        Kunde kunde = new Kunde("Dina");
        bogTitel.etKoeb(kunde);
        saelger.update(bogTitel);
        
//        System.out.println(observers);
        
//        System.out.println(bogTitel.getAntal());
        
    }
}
