package javaPrograms;

import java.util.Random;

public class GenerateRandomWord {
    public static String generateRandomWord(int length){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();

        StringBuilder word = new StringBuilder();
        for (int i=0; i<=length-1; i++){
            int index = random.nextInt(alphabet.length());
            word.append(alphabet.charAt(index));
        }
        return word.toString();
    }
    public static void main(String[] args) {
        System.out.println(generateRandomWord(3));
    }
}
