import java.util.Scanner;
public class CountPrimes {
    public static int countPrimes(int n) {
        boolean isPrime[] = new boolean[n];
        int count = 0;
        for(int i=2;i<n;i++){
            if(isPrime[i]==false)
            {
                count++;
                for(int j=2;i*j<n;j++){
                    isPrime[i*j] = true;
                }
            }
        }        
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Number of primes less than "+n+" are: "+countPrimes(n));
        sc.close();
    }
}
