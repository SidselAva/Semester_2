package hjemmearbejde;

import java.util.ArrayList;

public class PermutationApp {
    
    public static ArrayList<String> permutations(String word) {
        ArrayList<String> result = new ArrayList<>();
        if (word.length() == 0) {
            result.add(word);
        } else {
            for (int i = 0; i < word.length(); i++) {
                String shorter = word.substring(0, i) + word.substring(i + 1);
                ArrayList<String> shorterPermutations = permutations(shorter);
                
                for (String s : shorterPermutations) {
                    // Sætter værdi af første index ind igen
                    result.add(word.charAt(i) + s);
                }
            }
        }
        return result;
    }
    
    
    public static void main(String[] args) {
        
        for (String s : permutations("he")) {
            System.out.println(s);
        }
    }
}
