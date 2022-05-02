import java.util.ArrayList;
import java.util.List;

public class prime {
    
    

    public static void main(String[] args) {
        System.out.print(largest_prime(1000000));
        
    }

    public static List<Integer> factors(int n) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                factors.add(i);
            }
        }
        return factors;
    }

    public static boolean isPrime(int n) {
        
        if (factors(n).size()==2){
            return true;
        } else{
            return false;
        }

    }

    public static Integer largest_prime(int n){
        
        int largest_prime = 2;
        for (int i = 999000; i<=n; i++){
            if (isPrime(i) == true){
                largest_prime = i;
            } 
        }
        return largest_prime;
        
    

    }


}
