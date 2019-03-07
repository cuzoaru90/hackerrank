import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
        int max = 1;
        int result = 0;
        
        for (int i = 0; i < ar.length; i++){
          if (ar[i] > max){
            max = ar[i];      
          }    
        }
        
        for (int i: ar){
          if (i == max){
            result++;    
          }    
        }
        
        return result;    
       
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
