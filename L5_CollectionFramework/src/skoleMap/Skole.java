package skoleMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Skole {
    
    private String navn;
    private Map<Integer, Studerende> studerendeMap = new HashMap();
    
    public Skole(String navn) {
        this.navn = navn;
    }
    
    public String getNavn() {
        return navn;
    }
    
    public void addStuderende(Studerende studerende) {
        if (!studerendeMap.containsValue(studerende)) {
            Integer id = studerende.getStudieNr();
            studerendeMap.put(id, studerende);
            
        }
    }
    
    public void removeStuderende(Studerende studerende) {
        if (studerendeMap.containsValue(studerende)) {
            studerendeMap.remove(studerende.getStudieNr());
        }
    }
    
    public Set<Studerende> getStuderendes() {
        return new HashSet<>();
    }
    
    public double gennemsnit() {
        int sum = 0;
        int count = 0;
        for (Integer key : studerendeMap.keySet()) {
            Studerende id = studerendeMap.get(key);
            for (int tal : id.getKarakterer().keySet()) {
                sum += tal;
                count++;
            }
        }
        return (double) sum / count;
    }
    
    public Studerende findStuderende(int studieNr) {
        return studerendeMap.get(studieNr);
    }
    
    public String toString() {
        return "navn: " + navn;
    }
}
