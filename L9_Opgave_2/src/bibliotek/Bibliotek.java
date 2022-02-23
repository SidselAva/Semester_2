package bibliotek;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Bibliotek {
    
    private LocalDate beregnetDato;
    private LocalDate faktiskDato;
    private boolean voksen;
    
    public Bibliotek() {
    }
    
    public LocalDate getBeregnetDato() {
        return beregnetDato;
    }
    
    public void setBeregnetDato(LocalDate beregnetDato) {
        this.beregnetDato = beregnetDato;
    }
    
    public boolean isVoksen() {
        return voksen;
    }
    
    public void setVoksen(boolean voksen) {
        this.voksen = voksen;
    }
    
    public int beregnBøde(LocalDate beregnetDato, LocalDate faktiskDato, boolean voksen) {
        int bøde = 0;
        long bødedage = ChronoUnit.DAYS.between(beregnetDato, faktiskDato) + 1;
        if (beregnetDato.equals(faktiskDato)) {
            System.out.println("Ingen bøde.");
        }
        if (voksen == true) {
            if (bødedage >= 1 && bødedage <= 7) {
                bøde = Math.toIntExact(20 * bødedage);
            } else if (bødedage >= 8 && bødedage <= 14) {
                bøde = Math.toIntExact(30 * bødedage);
            } else {
                bøde = Math.toIntExact(90 * bødedage);
            }
        } else if (voksen == false) {
            if (bødedage >= 1 && bødedage <= 7) {
                bøde = Math.toIntExact(10 * bødedage);
            } else if (bødedage >= 8 && bødedage <= 14) {
                bøde = Math.toIntExact(30 * bødedage);
            } else {
                bøde = Math.toIntExact(45 * bødedage);
            }
        }
        return bøde;
    }
    
}
