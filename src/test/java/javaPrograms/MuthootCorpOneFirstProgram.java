package javaPrograms;

public class MuthootCorpOneFirstProgram {

    public static String removeK(String s, int k){
        if (s.length()<k){
            return s;
        }

        int count = 1;
        for (int i=1; i<=s.length()-1; i++){
            if (s.charAt(i) == s.charAt(i-1)){
                count++;
            }else count = 1;

            if (count == k){
                String newString = s.substring(0,(i-k)+1) + s.substring(i+1);
                return removeK(newString,k);
            }
        }
        return s;
    }

    public static void main(String[] args) {
        String s = "abdxxxdd"; // output:- ab
        int k=3;
        System.out.println(removeK(s,k));
    }
}
