package Opgave5;


public class Indkoeber implements Observer {
    
    private String navn;
    
    public Indkoeber(String navn) {
        this.navn = navn;
    }
    
    @Override
    public void update(Subject s) {
            int antal = ((BogTitel) s).getAntal();
            if (antal < 6) {
                System.out.println("Der skal bestilles 10 bøger med den pågældende titel");
                ((BogTitel) s).indkoedTilLager(10);
            }
    }
    
    public String toString() {
        return "En indkøber ved navn " + navn;
    }
}
