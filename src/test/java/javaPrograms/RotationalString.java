package javaPrograms;

public class RotationalString {
    public static boolean rotate(String s1, String s2){
        for (int i=0; i<=s1.length()-1; i++){
            String revolve = s1.substring(i) + s1.substring(0,i);
            if (revolve.equals(s2)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s1 = "selenium";
        String s2 = "iumselen";
        System.out.println(rotate(s1,s2));
    }
}
