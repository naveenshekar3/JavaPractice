package javaPrograms;

public class NumbersTrick {
    public static void main(String[] args) {
        int i = 12345;
        int j = 6789;
        int numOfDigits = 87654;

        System.out.println("To get Last Digit -> "+ i%10);
        System.out.println("remove last Digit -> " + i/10);
        double digits = Math.log10(numOfDigits)+1;
        System.out.println("To know the digits -> " + (int)digits);

        while (j>10){
            j=j/10;
        }
        System.out.println("To get the first digit -> " + j);

        int a = 'a';
        int z = 'z';
        int A = 'A';
        int Z = 'Z';
        System.out.println("a -> "+a);
        System.out.println("z -> "+z);
        System.out.println("A -> "+A);
        System.out.println("Z -> "+Z);
    }
}
