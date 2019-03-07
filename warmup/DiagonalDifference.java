import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner keyboard = new Scanner(System.in);
        
        int matrixSize = keyboard.nextInt();
        int primarySum = 0;
        int secondarySum = 0;
        
        // nextLine() completes actual input for N
        String skipToMatrixInput = keyboard.nextLine();
        
        for (int i = 0; i < matrixSize; i++){
            
          String matrixInputLine = keyboard.nextLine();   
          String [] integers = matrixInputLine.split(" ");
               
          primarySum += Integer.parseInt( integers[i] ); 
          secondarySum += Integer.parseInt( integers[matrixSize - 1 - i] );  
        }
        
        System.out.print(Math.abs(primarySum - secondarySum));
        
    }
}