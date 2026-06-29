package javaPrograms;

import java.util.Arrays;

public class WarnerBrosFirstRound {
    public static void main(String[] args) {

//     if num[] = [2, 3, 5, 4, 5] make the output as palindrome
//     output = [2,3,5,3,2]

//        if num[] = [2, 3, 5, 4, 5, 3] if the input length is odd number consider lowest number among 2 middles number as middle 2 numbers
//        output = [2, 3, 4, 4, 3, 2]



        // Below is using 2 pointers
        int[] num = {2,3,5,3,6,5,2,4}; // {2, 3, 5, 3, 3, 5, 3, 2}
        int numLength = num.length;
        int middleNum = numLength/2;
        int[] result = new int[numLength];
        int middleNumber = 0;
        int i=middleNum;
        int j=middleNum;

        if (numLength%2 !=0 ){
            middleNumber = num[middleNum];
            result[middleNum] = middleNumber;
        }else {
            middleNumber = Math.min(num[middleNum], num[middleNum-1]);
            result[middleNum] = middleNumber;
            result[middleNum-1] = middleNumber;
            i=middleNum-2;
            j=middleNum+1;
        }

        while(i>=0 && j<=numLength-1){
            result[i] = num[i];
            result[j] = num[i];
            i--;
            j++;
        }
        System.out.println(Arrays.toString(result));


        // Below is by using 2 for loops
//        int[] num = {2,3,5,3,6,5,2,3,5};
//        int numLength = num.length;
//        int middleNum = numLength/2;
//        int[] result = new int[numLength];
//        int middleNumber = 0;
//
//        for(int i=0; i<=middleNum-1; i++){
//            result[i] = num[i];
//            if (numLength%2 != 0) {
//                middleNumber = num[middleNum];
//                result[middleNum] = middleNumber;
//            }
//            else {
//                middleNumber = Math.min(num[middleNum],num[middleNum-1]);
//                result[middleNum] = middleNumber;
//                result[middleNum-1] = middleNumber;
//            }
//        }
//
//        for (int j=middleNum+1; j<=numLength-1; j++){
//            if (numLength%2 != 0){
//                result[j] = num[middleNum-- - 1];
//            }else {
//                if (middleNum<0)
//                    break;
//                else result[j] = num[middleNum-- - 2];
//            }
//
//        }
//        System.out.println(Arrays.toString(result));



    }
}
