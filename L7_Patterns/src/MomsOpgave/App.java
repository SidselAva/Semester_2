package MomsOpgave;

public class App {

    public static void main(String[] args) {

        Indkøbsvogn i1 = new Indkøbsvogn();

        Vare v1 = new Vare(20, "Sko", "Sketchers");
        ElArtikel e1 = new ElArtikel(50, "El-pære", "Giver lys", 10);
        Fødevare f1 = new Fødevare(15, "Salathoved", "Sundt", 3);
        Spiritus s1 = new Spiritus(100, "Jack Daniels", "Stærk spiritus", 40);
        Spiritus s2 = new Spiritus(70, "Spotanova Vodka", "God sjov", 42);

        i1.addVare(v1);
        i1.addVare(e1);
        i1.addVare(f1);
        i1.addVare(s1);

        System.out.println(i1.beregnSamletPris());
        System.out.println();

        i1.addVare(s2);
        System.out.println(i1.beregnSamletPris());



    }
}
