package javaPrograms;

public class ReverseOnlyNumbersInString {
    public static void main(String[] args) {
        String input = "GDP in 2016 has fallen from 6.8% to 4.5%";
        StringBuilder result = new StringBuilder();
        int i=0;

        while(i<=input.length()-1){
            char c = input.charAt(i);
            if(Character.isDigit(c)){
                StringBuilder sb = new StringBuilder();
                while(i<=input.length()-1 && (Character.isDigit(input.charAt(i)) || input.charAt(i) == '.')){
                    sb.append(input.charAt(i));
                    i++;
                }
                result.append(sb.reverse());
            }else{
                result.append(input.charAt(i));
                i++;
            }
        }
        System.out.println(result.toString());
    }
}
