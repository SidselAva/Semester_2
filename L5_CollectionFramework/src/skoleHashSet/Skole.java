package skoleHashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Skole {
    
    private String navn;
    private Set<Studerende> alleStuderende = new HashSet<>();
    
    public Skole(String navn) {
        this.navn = navn;
    }
    
    public String getNavn() {
        return navn;
    }
    
    public void addStuderende(Studerende studerende) {
            alleStuderende.add(studerende);
        
    }
    
    public void removeStuderende(Studerende studerende) {
        if (alleStuderende.contains(studerende)) {
            alleStuderende.remove(studerende);
        }
    }
    
    public Set<Studerende> getStuderendes() {
        return new HashSet<>(alleStuderende);
    }
    
    public double gennemsnit() {
        int sum = 0;
        int count = 0;
        for (Studerende s : alleStuderende) {
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
        int right = alleStuderende.size() - 1;
        while (studerende == null && left <= right) {
            int middle = (left + right) / 2;
            for (Studerende stud : alleStuderende) {
                if (stud.getStudieNr() == studieNr) {
                    return stud.getNavn();
                } else if (stud.getStudieNr() > studieNr) {
                    right = middle - 1;
                } else
                    left = middle + 1;
            }
      
        }
        return studerende.getNavn();
    }
    
    public String toString() {
        return "navn: " + navn;
    }
}
