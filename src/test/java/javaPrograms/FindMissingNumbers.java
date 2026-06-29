package javaPrograms;

public class FindMissingNumbers {
    public static void main(String[] args) {
        int[] arr = {1,2,6,7,9}; // 3,4,5,8
        int num;

        for (int i=0; i<arr.length-1; i++){
            if (arr[i]+1 != arr[i+1]){
                num = arr[i]+1;
                while (num<arr[i+1]){
                    System.out.println(num);
                    num++;
                }
            }
        }
    }
}
