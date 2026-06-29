package javaPrograms;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        //ex:- 6 is perfect number because the divisors of 6 are 1, 2 and 3. The sum of the proper divisors of 6 is 1 + 2 + 3 = 6, which is a perfect number.
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number to find if it is perfect number");
        int n=sc.nextInt();

        int sum = 0;
        for (int i=1; i<n; i++){
            if (n%i == 0){
                sum+=i;
            }
        }
        if (sum==n){
            System.out.println(n+" is perfect number");
        }else System.out.println(n+" is not perfect number");
    }
}
