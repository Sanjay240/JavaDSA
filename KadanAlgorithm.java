import java.util.*;

public class KadanAlgorithm{

    public static int KadanSum(int arr[]){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++) {
            currentSum += arr[i];
            if(currentSum < 0 ){
                currentSum = 0;
            }
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }

    public static void main(String arg[]){

        int inputArr[] = {-1,-2,4,-1,1,5,-3};
        int MaxSum = KadanSum(inputArr);
        System.out.println("Maximum sum of the subarray "+ MaxSum);
    }

}