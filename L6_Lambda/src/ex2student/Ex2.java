package ex2student;

import ex1student.Person;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Ex2 {
    
    
    public static void main(String[] args) {
        List<Runner> runners = new ArrayList<>();
        runners.addAll(List.of(
                new Runner("Ib", 30),
                new Runner("Per", 50),
                new Runner("Ole", 27),
                new Runner("Ulla", 40),
                new Runner("Jens", 35),
                new Runner("Hans", 28)));
//        System.out.println(runners);
//        System.out.println();
//
        runners.forEach(r -> System.out.println("Laptime under 30: "
                + r.getName() + " "
                + (r.getLapTime() < 30)));
        
        
        runners.sort((p1, p2) -> p1.getLapTime() - p2.getLapTime());
        System.out.println("Best laptime: " + runners);
        System.out.println();

        List<Integer> list = new LinkedList<>(Arrays.asList(2,3,4,1,8,7,10,2));
        Iterator<Integer> itr = list.iterator();
        System.out.print("Liste med forEach: ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + "  ");
            
        }
        System.out.println();

        Map<Integer, Integer> parMar = new HashMap<>();
        parMar.put(2, 4);
        parMar.put(3, 9);
        parMar.put(4, 16);
        parMar.put(5, 25);
        parMar.put(6, 36);

        Iterator<Integer> itre = parMar.keySet().iterator();
        while (itre.hasNext()) {
            int i = itre.next();
            System.out.println(i + " , " + parMar.get(i));
        }
    }
}