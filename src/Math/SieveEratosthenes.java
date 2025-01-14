package Math;

import java.util.ArrayList;
import java.util.Scanner;

public class SieveEratosthenes {
    public static final int LIMIT = 10000006;

    public ArrayList<Integer> findPrime(int a) {
        ArrayList<Integer> prime = new ArrayList<>(LIMIT);

        for (int i = 0; i < LIMIT; i++) {
            prime.add(1);
        }

        prime.set(0, 0);
        prime.set(1, 0);

        for (int i = 2; i * i <= LIMIT; i++) {
            if (prime.get(i) == 1) {
                for (int j = i * i; j < LIMIT; j += i) {
                    prime.set(j, 0);
                }
            }
        }

        return prime;
    }

    private boolean[] sieve(boolean[] primes){
        int n = primes.length;

        for (int i = 2; i < n; i++) {
            primes[i] = true;
        }

        for(int i=2; i*i<n; i++){
            if(primes[i]) {
                for(int j=i*i; j<n; j+=i){
                    primes[j]=false;
                }
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number up to 10^6 to find primes:");
        int a = sc.nextInt();

        SieveEratosthenes sieve = new SieveEratosthenes();
        ArrayList<Integer> prime = sieve.findPrime(a);

        System.out.println("Prime numbers up to " + a + " are:");
        for (int i = 2; i <= a; i++) {
            if (prime.get(i) == 1) {
                System.out.print(i + " ");
            }
        }

    }
}
