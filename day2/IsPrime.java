package week1.day2;

public class IsPrime {
    public static void main(String[] args) {
        
        int n = 4;

        boolean prime = isPrime(n);
        
       
        if (prime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
    
   
    public static boolean isPrime(int n) {
       
        if (n < 2) {
            return false; 
        }

       
        for (int i = 2; i < n; i++) {
        	
            if (n % i == 0) {
                return false; 
            }
        }
        return true; 
    }
}
