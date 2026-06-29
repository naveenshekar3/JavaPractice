package javaPrograms;

public class TekionSecondProgram {
    public static void main(String[] args) {
        int num = 3399;
        int nearestOddHundred = (int)(num / 200) * 200 + (100);

        System.out.println("The nearest odd hundred to " + num + " is " + nearestOddHundred);
    }
}
