package tekstfil;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Film {
    
    public static Map<Integer, String> readwords(String filename) {
        Map<Integer, String> films = new HashMap<>();
        try {
            Scanner in = null;
            try {
                in = new Scanner(new File(filename));
                while (in.hasNext()) {
                    Set<Integer> key = films.keySet();
                
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return films;
        
    }
    
    
    
    public static void main(String[] args) {
        System.out.println(readwords("/Users/sidselavakirk/Dokumenter/2. semester/PRO_2/Semester_2/L5_CollectionFramework/film.txt"));
        
        
    }
}
