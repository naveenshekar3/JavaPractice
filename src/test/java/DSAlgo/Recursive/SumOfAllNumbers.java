package DSAlgo.Recursive;

public class SumOfAllNumbers {
    static int[] arr = {12,2,30,13,5};

    public static int sum(int n){
        if (n==0)
            return arr[n];
        return arr[n]+sum(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sum(arr.length-1));
    }
}
