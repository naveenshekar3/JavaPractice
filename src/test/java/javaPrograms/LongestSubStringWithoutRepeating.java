package javaPrograms;

public class LongestSubStringWithoutRepeating {
    public static void main(String[] args) {
        String s = "pwwkew"; // output:- wke
        String longestSubString = "";

        for (int i=0; i<=s.length()-1; i++){
            String tempString = "";
            tempString+=s.charAt(i);
            for (int j=i+1; j<=s.length()-1; j++){
                if (tempString.indexOf(s.charAt(j)) == -1)
                    tempString+=s.charAt(j);
                else break;
            }
            if (tempString.length()>longestSubString.length()){
                longestSubString = tempString;
            }
        }
        System.out.println(longestSubString);
    }
}
