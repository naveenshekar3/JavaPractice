package DSAlgo.SlidingWindow;

public class SumOfGivenNumberOfSubArrayIsMax {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2}; // output should be 9
        int k = 3; // Given ie. sum of 3 consecutive digits or subarray of digits should be max number.

        int sumOfNumbers = 0;
        int maxSum = 0;

        for (int i =0; i<=arr.length-1; i++){
            sumOfNumbers+=arr[i];

            if (i>=k-1){
                maxSum = Math.max(maxSum,sumOfNumbers);
                sumOfNumbers-=arr[i-(k-1)];
            }
        }
        System.out.println(maxSum);

    }
}
