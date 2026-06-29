package javaPrograms;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the range of prime numbers required");
        int n = sc.nextInt();

        for (int i=2; i<n+2; i++){
            boolean isPrime=true;
            for (int j=2; j<i; j++){
                if (i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime)
                System.out.println(i);
            else n=n+1;
        }
    }
}
