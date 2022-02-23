package opgaver;

import java.util.ArrayList;
import java.util.Arrays;

public class Opgaver {
    
    // Opgave 1
    private static int sum(ArrayList<Integer> list, int low, int high) {
        int sum;
        if (low == high) {
            return list.get(low);
        } else {
            int middle = (low + high) / 2;
            int sum1 = sum(list, low, middle);
            int sum2 = sum(list, middle + 1, high);
            sum = sum1 + sum2;
        }
        return sum;
    }
    
    public static int sum(ArrayList<Integer> list) {
        return sum(list, 0, list.size() - 1);
    }
    
    // Opgave 2
    private static int numbersOfZero(ArrayList<Integer> list, int low, int high) {
        if (low == high) {
            if (list.get(low) == 0) {
                return 1;
            } else {
                return 0;
            }
        } else {
            int middle = (low + high) / 2;
            int listLow = numbersOfZero(list, low, middle);
            int listHigh = numbersOfZero(list, middle + 1, high);
            return listLow + listHigh;
        }
    }
    
    public static int numberOfZero(ArrayList<Integer> list) {
        return numbersOfZero(list, 0, list.size() - 1);
    }
    
    // Opgave 3
    
    // den metode der saetter fletningen i gang
    public static void fletteSort(ArrayList<Integer> list) {
        mergesort(list, 0, list.size() - 1);
    }
    
    // den rekursive metode der implementere del-loes og kombiner skabelonen
    private static void mergesort(ArrayList<Integer> list, int l, int h) {
        if (l < h) {
            int m = (l + h) / 2;
            mergesort(list, l, m);
            mergesort(list, m + 1, h);
            merge(list, l, m, h);
        }
    }
    
    // kombiner er realiseret ved fletteskabelonen
    private static void merge(ArrayList<Integer> list, int low, int middle, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int i1 = low;
        int i2 = middle + 1;
        while (i1 <= middle && i2 <= high) {
            if (list.get(i1) <= list.get(i2)) {
                temp.add(list.get(i1));
                i1++;
            } else {
                temp.add(list.get(i2));
                i2++;
            }
        }
        while (i1 <= middle) {
            temp.add(list.get(i1));
            i1++;
        }
        while (i2 <= high) {
            temp.add(list.get(i2));
            i2++;
        }
        
        for (int i = 0; i < temp.size(); i++) {
            list.set(low + i, temp.get(i));
        }
        
        
    }
    
    
    public static void main(String[] args) {
        
        
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(8, 56, 45, 34, 15, 12, 34, 44));
        fletteSort(list);
        System.out.println(list);
        
    }
}

