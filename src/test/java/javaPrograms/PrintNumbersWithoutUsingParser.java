package javaPrograms;

public class PrintNumbersWithoutUsingParser {
    public static void main(String[] args) {
        String digits = "1234";
        int number = 0;

        for (int i = 0; i<= digits.length()-1; i++){
            number = number * 10 + (digits.charAt(i) - '0');
        }

        System.out.println(number);
    }
}
