package javaPrograms;

import java.util.Scanner;

public class FibonaciSeries {
    public static void main(String[] args) {
        // 1,1,2,3,5,8,13
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the range you want Fibonacci series");
        int range = sc.nextInt();

        int firstNumber = 1;
        int secondNumber = 1;
        int thirdNumber = 0;

        System.out.println(firstNumber);
        for (int i=1; i<=range-1; i++){
            System.out.println(secondNumber);
            thirdNumber = firstNumber+secondNumber;
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
        }
    }
}
