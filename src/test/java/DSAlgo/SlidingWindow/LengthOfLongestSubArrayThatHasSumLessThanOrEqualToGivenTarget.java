package DSAlgo.SlidingWindow;

public class LengthOfLongestSubArrayThatHasSumLessThanOrEqualToGivenTarget {
    public static void main(String[] args) {
        // nums = [3, 2, 1, 3, 1, 1] and k = 5. We need to find the length of the longest subarray that has a sum less than or equal to k
        int[] arr = {3, 2, 1, 3, 1, 1};
        int k = 5;
        int maxLength=0;

        for (int i=0; i<=arr.length-1; i++){
            int sum=0;
            for (int j=i; j<=arr.length-1; j++){
                sum+=arr[j];
                if (sum<=k){
                    maxLength = Math.max(maxLength,(j-i)+1);
                }
            }
        }
        System.out.println(maxLength);
    }
}
