package javaPrograms;

public class ArintraFirstRound {
    public static void main(String[] args) {

        String input = "4(DO)3(RED)2(RID)"; // output = DODODODOREDREDREDRIDRID
        StringBuilder output = new StringBuilder();

        for (int i=0; i<=input.length()-1; i++){

            int count = 0;
            while (i<=input.length()-1 && Character.isDigit(input.charAt(i))){
                count = count * 10 + (input.charAt(i) - '0');
                i++;
            }

            while (i<=input.length()-1 && input.charAt(i) == '('){
                i++;
            }

            StringBuilder sb = new StringBuilder();
            while (i<=input.length()-1 && input.charAt(i) != ')'){
                sb.append(input.charAt(i));
                i++;
            }

            for (int j=0; j<=count-1; j++){
                output.append(sb);
            }
        }
        System.out.println(output);
    }
}
