package talfølge;

public class Opgave7_Talfølge {
    
    
    private static int ligeTals(int n) {
        int calculation = 0;
        if (n > 2 && n % 2 == 0) {
            calculation = ((2 * (n - 1) - n - 1));
        } else if (n > 2 && n % 2 != 0) {
            calculation = (n - 1 + n - 2 + 3 * (n - 3));
        }
        
        return calculation;
    }
    
    
    
//    private static int ligeTals1(int n) {
//        int result = 0;
//            if (n > 2 && n % 2 == 0) {
//                result = ligeTals1((2 * (n - 1) - n - 1));
//            } else if (n > 2 && n % 2 != 0) {
//                result = ligeTals1((n - 1 + n - 2 + (3 * (n - 3))));
//
//
//        }
//        return result;
//    }
    
    
    public static void main(String[] args) {
//        System.out.println("Tal 3 = " + ligeTals(0));
//        System.out.println("Tal 3 = " + ligeTals(1));
//        System.out.println("Tal 3 = " + ligeTals(2));
//        System.out.println("Tal 3 = " + ligeTals(3));
//        System.out.println("Tal 4 = " + ligeTals(4));
//        System.out.println("Tal 5 = " + ligeTals(5));
//        System.out.println("Tal 6 = " + ligeTals(6));

        
//        System.out.println();
//        System.out.println("Tal 3 = " + ligeTals1(3));
//        System.out.println("Tal 4 = " + ligeTals1(4));
//        System.out.println("Tal 5 = " + ligeTals1(5));
//        System.out.println("Tal 6 = " + ligeTals1(6));
//
        
    }
}
