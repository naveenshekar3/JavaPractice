package javaPrograms;

public class RegularExpressions {
    static String str = "mcNaveen03@gmail.com mysore";
    public static void main(String[] args) {
        // Remove special characters with spaces
        System.out.println(str.replaceAll("[^a-zA-Z0-9 ]",""));

        //Remove numbers
        System.out.println(str.replaceAll("[0-9]",""));
    }
}
