package opgaver;

import java.util.ArrayList;
import java.util.Arrays;

public class Opgaver {
    
    // HVOR MANGE 7-TALLER
    
    
    // Uden hjælpemetode
    private static int ligeTal(ArrayList<Integer> list) {
        int result = 0;
        if (list.size() == 0) {
            result = 0;
        } else {
            if (list.get(0) % 2 == 0) {
                list.remove(0);
                result = 1 + ligeTal(list);
            } else {
                list.remove(0);
                result = ligeTal(list);
            }
        }
        return result;
    }
    
    
    // Med hjælpemetode
    public static int ligeTals(ArrayList<Integer> list) {
        return ligeTals(list, 0);
    }
    
    // Rekursiv hjælpemetode med de nødvendige parametre
    private static int ligeTals(ArrayList<Integer> list, int index) {
        int result = 0;
        if (index == list.size()) {
            result = 0;
        } else if (list.get(index) % 2 == 0) {
            result = 1 + ligeTals(list, index + 1);
        } else
            result = result + ligeTals(list, index + 1);
        
        return result;
    }
    
    private static boolean isPalindrome(String word, int start, int end) {
        if (start >= end) {
            return true;
        } else {
            char first = Character.toLowerCase(word.charAt(start));
            char last = Character.toLowerCase(word.charAt(end));
            if (Character.isLetter(first) && Character.isLetter(last)) {
                if (first == last) {
                    return isPalindrome(word, start + 1, end - 1);
                } else
                    return false;
            } else if (!Character.isLetter(last)) {
                return isPalindrome(word, start, end - 1);
                
            } else
                return isPalindrome(word, start + 1, end);
        }
    }
    
    public static boolean isPalindrom(String text) {
        return isPalindrome(text, 0, text.length() - 1);
    }
    
    public static boolean binærRekursion(int[] arr, int target, int left, int right) {
        int middle = (left + right) / 2;
        int k = arr[middle];
        if (left > right) {
            return false;
        } else if (target == k) {
            return true;
        } else if (k > target) {
            return binærRekursion(arr, target, left, right - 1);
        } else {
            return binærRekursion(arr, target, left + 1, right);
        }
    }
    
    public static boolean binærRek(int[] arr, int target) {
        return binærRekursion(arr, target, arr[0], arr.length - 1);
    }
    
    
    public static void main(String[] args) {
        String word = "ABdd";
//        System.out.println(isPalindrom(word));
        ArrayList<Integer> list = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 8, 9, 10));
        System.out.println(ligeTal(list));
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binærRek(arr, 20));
        
    }
}
