package MomsOpgave;

class Fødevare extends Vare{

    private int holdbarhedsPeriode;

    public Fødevare (double pris, String navn, String beskrivelse, int holdbarhedsPeriode){
        super(pris, navn, beskrivelse);
        this.holdbarhedsPeriode = holdbarhedsPeriode;
    }

    @Override
    public double beregnSalgsPris(){
        double sum = super.getPris() * 1.05;
        return sum;
    }
}
