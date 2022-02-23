package opgave5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class App {


//    public static int countDelStreng(List<String> list, String sub) {
//        int result = 0;
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).contains(sub)) {
//                result++;
//            }
//        }
//        return result;
//    }
//
    public static int countDelStreng(List<String> list, String searchText) {
        int result = 0;
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().contains(searchText)) {
                result++;
            }
        }
        return result;
    }
    
//    public static int countDelStreng(List<String> list, String target) {
//        return countDelStreng(list, 0, list.size() - 1, target);
//    }
//
//    public static int countDelStreng(List<String> list, int left, int right, String search) {
//        int count = 0;
//        int middle = (left + right) / 2;
//        String k = list.get(middle);
//        if (left > right) {
//            return 0;
//        }
//        if (list.contains(search)) {
//            count++;
//        } else if (k.compareTo(search) > 0) {
//            return countDelStreng(list, left, middle - 1, search);
//        } else {
//            return countDelStreng(list, middle + 1, right, search);
//        }
//        return count;
//    }


    public static int countDelStreng(ArrayList<String> list, String search) {
        return partition(list, 0, list.size() - 1, search);
    }


    private static int partition(ArrayList<String> list, int low, int high, String search) {
        ArrayList<String> resultList = new ArrayList<>();
        int i = low + 1;
        int j = high;
        while (i <= j) {
            if (list.get(j).compareTo(search) == 0) {
                resultList.add(search);
                i++;
            } else if (list.get(j).compareTo(search) < 0) {
                resultList.remove(j);
                j--;
            } else {
//                swap(, i, j);
                i++;
                j--;
            }
        }
        swap((ArrayList<String>) list.listIterator(i), low, j);
        return j;

    }

    // Bytter om på indholdet af plads i og j i listen
    private static void swap(ArrayList<String> list, int i, int j) {
        String temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);

    }
//
    
    public static void main(String[] args) {
        
        ArrayList<String> navne = new ArrayList<>(Arrays.asList("Jan Jensen", "JensJense Hansen", "Leo Hansen", "Jens Jensen", "Jensine Larsen"));
        System.out.println(countDelStreng(navne, "Jens"));
    }
}
