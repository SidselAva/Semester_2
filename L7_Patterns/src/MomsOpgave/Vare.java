package MomsOpgave;

public class Vare implements Moms {

    private double pris;

    private String navn;

    private String beskrivelse;

    public Vare (double pris, String navn, String beskrivelse){
        this.pris = pris;
        this.navn = navn;
        this.beskrivelse = beskrivelse;
    }

    public String getNavn() {
        return navn;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public double getPris() {
        return pris;
    }

    public double beregnSalgsPris(){
        double sum = pris * 1.25;
        return sum;
    }

    public String toString(){

        return navn + ", Pris: " + beregnSalgsPris();
    }
}
