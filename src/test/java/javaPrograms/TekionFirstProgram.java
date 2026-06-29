package javaPrograms;

import java.util.ArrayList;

public class TekionFirstProgram {

    public static void main(String[] args) {
        String input2 = "i am raj";
//        String input2 = "iam raj kumar";
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0; i<=input2.length()-1; i++){
            if (input2.charAt(i) == ' '){
                list.add(i);
            }
        }
        System.out.println(list);
        StringBuilder sb = new StringBuilder(input2.replaceAll(" ",""));
        StringBuilder output = new StringBuilder();
        sb.reverse().toString();
        String revInput = sb.toString();
        System.out.println(sb);
        int index=0;
        for (int i=0; i<=input2.length()-1; i++){  //ram ukj armai
            if (list.contains(i)){
                output.append(" ");
            }
            else {
                output.append(revInput.charAt(index));
                index++;
            }
        }
        System.out.println(output);
    }
}