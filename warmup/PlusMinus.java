import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner keyboard = new Scanner(System.in);
        
        int arrElements = keyboard.nextInt();
        
        // nextLine completes actual N input
        String skipToIntegerInput = keyboard.nextLine();
        
        String inputLine = keyboard.nextLine();
        String [] integerArray = inputLine.split(" ");
        
        int positiveIntegers = 0;
        int negativeIntegers = 0;
        int zeroes = 0;
        
        for (int i = 0; i < integerArray.length; i++){
          int elemValue = Integer.parseInt(integerArray[i]);
          
          if (elemValue > 0){
            positiveIntegers++;    
          }  
          else if (elemValue == 0){
            zeroes++;  
          }
          else{
            negativeIntegers++;  
          }  
              
        }
        
        double positiveRatio = positiveIntegers * 1.0 / arrElements;  
        double negativeRatio = negativeIntegers * 1.0 / arrElements; 
        double zeroRatio = zeroes * 1.0 / arrElements;
        
        System.out.printf("%.6f\n", positiveRatio);
        System.out.printf("%.6f\n", negativeRatio);
        System.out.printf("%.6f\n", zeroRatio);
          
    }
}