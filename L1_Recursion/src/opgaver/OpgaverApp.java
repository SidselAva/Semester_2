package opgaver;

public class OpgaverApp {
    
    
    // Opgave 1
    public static int factorial(int n) {
        int result;
        if (n == 0) {
            result = 1;
        } else
            result = n * factorial(n - 1);
        return result;
    }
    
    // Opgave 2.1
    
    public static int power(int n, int p) {
        int result;
        if (p == 0) {
            result = 1;
        } else
            result = power(n, p - 1) * n;
        
        return result;
    }
    
    // Opgave 2.2
    public static int power2(int n, int p) {
        int result;
        if (p == 0) {
            n = 1;
        }
        if (p % 2 != 0) {
            result = power2(n, p - 1) * n;
        } else
            result = power2((n * n), p / 2);
        return result;
    }
    
    // Opgave 3.a
    
    public static int product(int a, int b) {
        int result;
        if (a == 0) {
            result = 0;
        } else
            result = product((a - 1), b) + b;
        return result;
    }
    
    // Opgave 3.b
    
    public static int productRus(int a, int b) {
        int result;
        if (a == 0) {
            result = 0;
        } else if (a % 2 != 0) {
            result = productRus(a - 1, b) + b;
            System.out.println(result);
        } else
            result = productRus(a / 2, b + b);
        return result;
    }
    
    // Opgave 4
    public static String reverse(String s) {
        String result;
        if (s.length() <= 1) {
            result = s;
        } else {
            result = s.substring(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
        }
        return result;
    }
    
    
    public static void main(String[] args) {
        System.out.println(reverse("PIA"));
//        System.out.println(factorial(3));
    
    
    }
}
