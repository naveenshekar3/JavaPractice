package DSAlgo.SlidingWindow;

public class LengthOfSmallestSubArraySumGreaterOrEqualToGivenTarget {
    public static void main(String[] args) {
      int[] arr = {2, 1, 5, 2, 3, 2}; // output should be 2
//        int[] arr = {2, 1, 8, 2, 3, 2}; // output should be 1
        int target = 7;

        int slow = 0;
        int windowSum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int fast = 0; fast<= arr.length-1; fast++){
            windowSum+=arr[fast];

            while (windowSum>=target){
                minLength = Math.min(minLength, (fast-slow) +1);
                windowSum-=arr[slow];
                slow++;
            }
        }
        System.out.println(minLength);


        // Below is the code for the same above by using nested for loop
//        for (int i=0; i<=arr.length-1; i++){
//            int sum = 0;
//            for (int j=i; j<=arr.length-1; j++){
//                sum+=arr[j];
//                if(sum>=target){
//                    minLength = Math.min(minLength,(j-i)+1);
//                }
//            }
//        }
//        System.out.println(minLength);
    }
}
