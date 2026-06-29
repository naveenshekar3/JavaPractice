package javaPrograms;

import java.util.Arrays;

public class WiproFirstProgram {

    public static char[] a = {'a','b','c','d'};
    public static char[] b = {'c','d','e'};
    // output should be
    // union = ['a', 'b', 'c', 'd', 'e']
    // intersection = ['c','d']
    // difference = ['a', 'b']


    public static char[] union(char[] firstArray, char[] secondArray){
        String s = "";
        for (int i=0; i<= firstArray.length-1; i++){
            s+=firstArray[i];
        }
        for (int j=0; j<= secondArray.length-1; j++){
            if (s.indexOf(secondArray[j]) == -1)
                s+=secondArray[j];
        }
        return s.toCharArray();
    }

    public static char[] intersection(char[] firstArray, char[] secondArray){
        String s = "";
        String intersect = "";
        for (int i=0; i<= firstArray.length-1; i++){
            s+=firstArray[i];
        }
        for (int j=0; j<= secondArray.length-1; j++){
            if (s.indexOf(secondArray[j]) != -1)
                intersect+=secondArray[j];
        }
        return intersect.toCharArray();
    }

    public static char[] difference(char[] firstArray, char[] secondArray){
        String secondArrayString = "";
        String difference = "";
        for (int i=0; i<= secondArray.length-1; i++){
            secondArrayString+=secondArray[i];
        }
        for (int j=0; j<= firstArray.length-1; j++){
            if (secondArrayString.indexOf(firstArray[j]) == -1)
                difference+=firstArray[j];
        }
        return difference.toCharArray();
    }


    public static void main(String[] args) {

        System.out.println("UNION ---> " + Arrays.toString(union(a,b)));
        System.out.println("INTERSECTION ---> " + Arrays.toString(intersection(a,b)));
        System.out.println("DIFFERENCE ---> " + Arrays.toString(difference(a,b)));

    }
}
