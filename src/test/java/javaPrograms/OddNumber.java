package javaPrograms;

import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        // 3,5,7,9,11,13
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of odd numbers required");
        int range = sc.nextInt();

        for (int i=2; i<=range+1; i++){
            if (i%2 !=0){
                System.out.println(i);
            }else range++;
        }
    }
}
