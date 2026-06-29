package javaPrograms;

import java.util.Scanner;

public class MultiplicationWithoutOperator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter First number");
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number");
        int secondNumber = sc.nextInt();

        int sum = 0;
        for (int i=0; i<=secondNumber-1; i++){
            sum+=firstNumber;
        }
        System.out.println(sum);

    }
}
