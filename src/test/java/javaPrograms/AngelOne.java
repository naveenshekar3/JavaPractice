package javaPrograms;

public class AngelOne {
    public static void main(String[] args) {
        String s = "QUALITY EDUCATION IS THE PRIDE OF COUNTRY";
        String[] str = s.split(" ");
        String rev = "";

        // without using any inbuilt functions like stringbuilder or stringbuffer
        for (int i= str.length-1; i>= 0; i--){
            char[] c = str[i].toCharArray();
            for (int j=c.length-1; j>=0; j--){
                rev+=c[j];
            }
            rev+=" ";
        }
        System.out.println(rev.trim());

        // Using StringBuilder or StringBuffer
//        for (int i= str.length-1; i>=0; i--){
//            StringBuilder sb = new StringBuilder(str[i]);
//            rev+=sb.reverse()+" ";
//        }
//        System.out.println(rev.trim());
    }
}
