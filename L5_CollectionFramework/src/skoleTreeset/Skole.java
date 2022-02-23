package skoleTreeset;

import java.util.Set;
import java.util.TreeSet;

public class Skole {
    
    private String navn;
    private Set<Studerende> studerendeList = new TreeSet<>();
    
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
    
    public Set<Studerende> getStuderendes() {
        return new TreeSet<>(studerendeList);
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
    
    public Studerende findStuderende(int studieNr) {
        Studerende studerende = null;
        int left = 0;
        int right = studerendeList.size() - 1;
        while (studerende == null && left <= right) {
            int middle = (left + right) / 2;
            for (Studerende stud : studerendeList) {
                if (stud.getStudieNr() == studieNr) {
                    return stud;
                } else if (stud.getStudieNr() > studieNr) {
                    right = middle - 1;
                } else
                    left = middle + 1;
            }
            if (studerende == null) {
                return null;
            }
        }
        return studerende;
    }
    
    public String toString() {
        return "navn: " + navn;
    }
    
    
   
}
