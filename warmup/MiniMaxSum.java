import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void miniMaxSum(long[] arr) {
      long arrSum = 0;
        
      for (long i: arr){
        arrSum += i;    
      }
        
      long minSum = arrSum;
      long maxSum = 0; // input can only be positive
        
      for (int i = 0; i < arr.length; i++){    
        if (arrSum - arr[i] > maxSum){
          maxSum = arrSum - arr[i];
        }
        
        if (arrSum - arr[i] < minSum){
          minSum = arrSum - arr[i];
        }        
      }
        
      System.out.println(minSum + " " + maxSum);  
        
    }    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextLong();
        }
        miniMaxSum(arr);
        in.close();
    }
}
