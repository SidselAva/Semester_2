package MomsOpgave;

import java.util.ArrayList;

class Indkøbsvogn {

    private ArrayList<Vare> varer = new ArrayList<>();

    public Indkøbsvogn(){}

    public void addVare(Vare vare){
        if (!varer.contains(vare)){
            varer.add(vare);
        }
    }

    public void removeVare(Vare vare){
        if (varer.contains(vare)){
            varer.remove(vare);
        }
    }

    public double beregnSamletPris(){
        double sum = 0;
        for (Vare v : varer){
            sum += v.beregnSalgsPris();
            System.out.println(v.toString());
        }
        System.out.println();
        System.out.print("Samlet pris: ");
        return sum;
    }
}
