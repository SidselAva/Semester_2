package opgaver;

import javax.swing.plaf.synth.SynthCheckBoxMenuItemUI;
import java.util.Arrays;

public class Opgaver {
    
    
    public static double[] prefixAverage(int[] arr) {
        double[] list = new double[arr.length];
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            list[i] = sum / (i + 1);
        }
        return list;
    }
    
    
    // Opgave 5
    
    public static void quickSort(char[] list, int low, int high) {
        if (low < high) {
            int p = partition(list, low, high);
            quickSort(list, low, p - 1);
            quickSort(list, p + 1, high);
        }
    }
    
    
    public static void belgisk_flag(char[] belgisk_flag) {
        quickSort(belgisk_flag, 0, belgisk_flag.length - 1);
        
    }
    
    private static int partition(char[] list, int low, int high) {
        int i = low + 1;
        int j = high;
        while (i <= j) {
            if (list[i] == 'S') {
                i++;
            } else if (list[j] == 'R') {
                j--;
            } else {
                swap(list, i, j);
                i++;
                j--;
            }
            if (list[j + 1] == 'G' && list[j] == 'R') {
                swap(list, j, j + 1);
            }
            
        }
        swap(list, low, j);
        return j;
        
    }
    
    private static void swap(char[] list, int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = (char) temp;
    }
    
    public static void main(String[] args) {
        
        
        int[] list = {5, 10, 5, 6, 4, 9, 8};
        char[] belgien = {'G', 'R', 'S', 'G', 'G', 'R', 'S', 'R', 'G', 'G', 'R', 'S', 'G'};
        System.out.println(belgien);
//        System.out.println(Arrays.toString(prefixAverage(list)));
    
    
    }
}
