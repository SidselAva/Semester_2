package Opgave5;

import java.util.*;

public class BogTitel implements Subject, Observer {
    
    private String titel;
    private int antal;
    private List<Kunde> kunder = new ArrayList<>();
    private Set<Observer> observers;
    
    public BogTitel(String titel, int antal) {
        observers = new HashSet<>();
        this.titel = titel;
        this.antal = antal;
    }
    
    public List<Kunde> getKunder() {
        return new ArrayList<>(kunder);
    }
    
    public String getTitel() {
        return titel;
    }
    
    public int getAntal() {
        return antal;
    }
    
    public void indkoedTilLager(int antal) {
        this.antal = antal + getAntal();
        update(this);
    }
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        
    }
    
    public void etKoeb(Kunde k) {
        k.addBogTitel(this);
        kunder.add(k);
        antal--;
        System.out.println(k + " har købt " + titel);
            update(this);
    }
    
    // LAV
   
    
    @Override
    public void update(Subject s) {
        int ob = ((BogTitel) s).getAntal();
        System.out.println("Antal bøger på lager: "+ob);
    
    }
    
    public String toString() {
        return  "En bog med titel " + titel + " i " + antal + " eksemplarer";
    }
}
