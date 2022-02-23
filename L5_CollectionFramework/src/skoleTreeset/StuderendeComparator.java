package skoleTreeset;


public class StuderendeComparator {
    

    public int compare(Studerende s1, Studerende s2) {
        int compare = s1.getNavn().toLowerCase().compareTo(s2.getNavn().toLowerCase());
        return compare;
        
    }
}
