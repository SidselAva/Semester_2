package skoleList;

import java.util.ArrayList;
import java.util.List;

public class Skole implements Comparable<Skole>{
    
    private String navn;
    private List<Studerende> studerendeList = new ArrayList<>();
    
    public Skole(String navn) {
        this.navn = navn;
    }
    
    public String getNavn() {
        return navn;
    }
    
    public void addStuderende(Studerende studerende) {
        if (!studerendeList.contains(studerende)) {
            studerendeList.add(studerende);
        }
    }
    
    public void removeStuderende(Studerende studerende) {
        if (studerendeList.contains(studerende)) {
            studerendeList.remove(studerende);
        }
    }
    
    public ArrayList<Studerende> getStuderendes() {
        return new ArrayList<>(studerendeList);
    }
    
    public double gennemsnit() {
        int sum = 0;
        int count = 0;
        for (Studerende s : studerendeList) {
            for (int tal : s.getKarakterer()) {
                sum += tal;
                count++;
            }
        }
        return (double) sum / count;
    }
    
    public String findStuderende(int studieNr) {
        Studerende studerende = null;
        int left = 0;
        int right = studerendeList.size() - 1;
        while (studerende == null && left <= right) {
            int middle = (left + right) / 2;
            Studerende s = studerendeList.get(middle);
            if (s.getStudieNr() == studieNr) {
                return s.getNavn();
            } else if (s.getStudieNr() > studieNr) {
                right = middle - 1;
            } else
                left = middle + 1;
        }
        if (studerende == null) {
            return null;
        }
        else
            return studerende.getNavn();
    }
    
    public String toString() {
        return "navn: " + navn;
    }
    
   @Override
    public int compareTo(Skole i) {
        int compare = this.navn.compareTo(i.getNavn());
        return compare;
    }
}
