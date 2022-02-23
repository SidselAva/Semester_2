package opgave1;

import java.util.HashSet;
import java.util.Set;

public class AnvendMetoderPaaHashSet {
    
    public static void main(String[] args) {
        
        Set<Integer> hash = new HashSet<>();
        hash.add(34);
        hash.add(12);
        hash.add(23);
        hash.add(45);
        hash.add(67);
        hash.add(34);
        hash.add(98);
        System.out.println(hash);
        hash.add(23);
        System.out.println(hash);
        hash.remove(67);
        System.out.println(hash);
        System.out.println(hash.contains(23));
        System.out.println(hash.size());
   
    }
}
