package MomsOpgave;

public class Spiritus extends Vare implements Moms{

    private double alkoholsProcent;

    public Spiritus (double pris, String navn, String beskrivelse, double alkoholsProcent){
        super(pris, navn, beskrivelse);
        this.alkoholsProcent = alkoholsProcent;
    }

    @Override
    public double beregnSalgsPris() {
        double sum = 0;
        if (super.getPris() > 90){
            sum = super.getPris() * 2.2;
        }
        else {
            sum = super.getPris() * 1.8;
        }
        return sum;
    }
}
