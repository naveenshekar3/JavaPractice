package javaPrograms;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        // 2,4,6,8,10,12
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range you need even numbers");
        int range = sc.nextInt();

        for (int i=1; i<=range; i++){
            if (i%2 == 0){
                System.out.println(i);
            }else range++;
        }
    }
}
