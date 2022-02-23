package MomsOpgave;

public class ElArtikel extends Vare{

    private double gennemsnitEnergiForbrugPrTime;

    public ElArtikel (double pris, String navn, String beskrivelse, double gennemsnitEnergiForbrugPrTime){
        super(pris, navn, beskrivelse);
        this.gennemsnitEnergiForbrugPrTime = gennemsnitEnergiForbrugPrTime;
    }

    @Override
    public double beregnSalgsPris(){
        double  sum = 0;
        if (super.getPris() > 10) {
            sum = super.getPris() * 1.30;
        }
        else {
            sum = super.getPris() + 3;
        }
        return sum;
    }
}
