package javaPrograms;

import java.util.Scanner;

public class FindPalindromeWords {
    public static void main(String[] args) {
        //To find all the palindrome words in the given string
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter the String to know the number of palindrome words in it");
        String s=sc.nextLine();

        //abacdiridefgmadamg :- aba,dirid,iri,gmadamg,madam,ada
        //abadketet :- aba,ete,tet

        for (int i=0; i<=s.length()-1; i++){
            for (int j=i+1; j<=s.length()-1; j++){
                String word = s.substring(i,j+1);
                StringBuilder sb = new StringBuilder(word);
                String rev = sb.reverse().toString();
                if (word.equals(rev))
                    System.out.println(word);
            }
        }
    }
}
