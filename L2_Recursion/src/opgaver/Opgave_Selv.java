package opgaver;

import java.util.ArrayList;
import java.util.Arrays;

public class Opgave_Selv {
    
    // OPGAVE 1
    
    // The non-recursive part often is called THE BASE CASE <-- undgår infinite loop/recursion
    public static int ligeTal(ArrayList<Integer> list) {
        int result;
        if (list.size() == 0) {
            result = 0;
        } else {
            if (list.get(0) % 2 == 0) {
                list.remove(0);
                result = 1 + ligeTal(list);
            } else {
                list.remove(0);
                result = ligeTal(list);
                return result;
                
            }
        }
        return result;
        
    }
    
    public static int ligeTals(ArrayList<Integer> list) {
        return ligeTals(list, 0);
    }
    
    private static int ligeTals(ArrayList<Integer> list, int index) {
        int result;
        if (list.size() == 0) {
            result = 0;
        } else if (list.get(index) % 2 == 0) {
            list.remove(index);
            result = 1 + ligeTals(list, index + 1);
        } else
            result = ligeTals(list, index + 1);
        return result;
    }
    
    public static boolean isPalindrom(String tekst, int start, int end) {
        if (start >= end) {
            return true;
        } else {
            char first = Character.toLowerCase(tekst.charAt(start));
            char last = Character.toLowerCase(tekst.charAt(end));
            
            if (Character.isLetter(first) && Character.isLetter(last)) {
                if (first == last) {
                    return isPalindrom(tekst, start + 1, end - 1);
                } else {
                    return false;
                }
            } else if (!Character.isLetter(end)) {
                return isPalindrom(tekst, start, end - 1);
            } else {
                return isPalindrom(tekst, start + 1, end);
            }
        }
    }
    
    public static boolean isPalindrom(String tekst) {
        return isPalindrom(tekst, 0, tekst.length() - 1);
    }
    
    public static boolean binærRekursion(int[] list, int left, int right, int target) {
        int middle = (left + right) / 2;
        int listVærdi = list[middle];
        if (left > right) {
            return false;
        } else if (listVærdi == target) {
            return true;
        } else if (listVærdi > target) {
            return binærRekursion(list, left, right - 1, target);
        } else
            return binærRekursion(list, left + 1, right, target);
    }
    
    public static int ackermann(int x, int y) {
        int result;
        if (x == 0) {
            result = ackermann(x, y + 1);
        } else if (y == 0) {
            result = ackermann(x - 1, 1);
            
        } else {
            int temp = ackermann(x, y - 1);
            result = ackermann(ackermann(x - 1, y), temp);
            
        }
        return result;
    }
    
    
    public static boolean binærRekursion(int[] list, int target) {
        return binærRekursion(list, 0, list.length - 1, target);
    }
    
    public static int towersOfHHanoi(int numberOfDisks) {
        return (int) Math.pow(2, numberOfDisks) - 1;
    }
    
    
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 7, 7, 7, 7, 7, 8, 9, 10));
        
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10};

//        System.out.println(ligeTal(list));
        System.out.println(isPalindrom("AHAAAA"));
        System.out.println(binærRekursion(arr, 1));
        System.out.println(towersOfHHanoi(63));
        
        
    }
    
    
}
