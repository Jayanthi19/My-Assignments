package week1.day2;

public class FibonacciSeries {
    public static void main(String[] args) {
        
        int range = 13;  
        int a = 0, b = 1;

    
        System.out.print("Fibonacci Series: ");

    
        for (int i = 0; a <= range; i++) {
         
                  System.out.println(a + "");
                 
                  int next = a + b;
                  a = b;
                  b = next;
        }
        }
    }
