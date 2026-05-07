import java.util.*;

public class TrappingRainwater {

    public static int TrapRainwater(int arr[]){
        int n = arr.length; // length of input array
        //calculate the left max boundary - array

        int leftMaxBoundary[] = new int[n];
        leftMaxBoundary[0] = arr[0];
        for(int i =1; i<n; i++){
            leftMaxBoundary[i] = Math.max(arr[i], leftMaxBoundary[i-1]);
        }
        

        //calculate the right max boundary - array
        int rightMaxBoundary[] = new int[n];
        rightMaxBoundary[n-1] = arr[n-1];
        for(int i = n-2; i>= 0; i--){
            rightMaxBoundary[i] = Math.max(arr[i], rightMaxBoundary[i+1]);
        }
        int trappedWater = 0;
        //loop
        for(int i =0; i<n; i++){
            //calculate the water level - min(left max boundary , right max boundary);
            int waterLevel = Math.min(leftMaxBoundary[i],rightMaxBoundary[i]);
            // calculate the trapped water - (water level - height of bar);
            trappedWater += waterLevel - arr[i];
        }
         //return trapped water
        return trappedWater;
        

    }

    public static void main(String arg[]){

        int height[] = {4,2,0,6,3,2,5};
        System.out.println(TrapRainwater(height));

    }
}