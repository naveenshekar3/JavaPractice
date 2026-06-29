package javaPrograms;

public class ConcatCharAtSameIndexFromStr {
    public static void main(String[] args) {
        String[] strArray = {"Java", "Microservices", "Springboot", "Techie"};
        //output should be -> JMSTaipevcrcarihonisgeebrovoitces

        int maxLength = 0;
        for (String s: strArray){
            maxLength = Math.max(s.length(),maxLength);
        }

        for (int i=0; i<=maxLength-1; i++){
            for (String s: strArray){
                if (s.length()>i)
                    System.out.print(s.charAt(i));
            }
        }
    }
}
