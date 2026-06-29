package javaPrograms;

public class PhonePe {
    public static void main(String[] args) {
//        Example 1:
//        Input: prices = [5, 2, 3, 10, 6, 4, 8, 1]
//        Output: 8

        int[] arr = {5, 2, 3, 10, 6, 4, 8, 1};
        int maxProfit = 0;

        for (int i=0; i<=arr.length-1; i++){
            for (int j=i+1; j<=arr.length-1; j++){
                if ((arr[j]-arr[i])>maxProfit)
                    maxProfit = arr[j]-arr[i];
            }
        }
        System.out.println(maxProfit);
    }
}
