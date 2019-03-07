import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static boolean divisibleByEach(int[] arr, int target){
      for (int elem: arr){
        if (target % elem != 0){
          return false;    
        }    
      }
      return true;        
    }
    
    static boolean factorOfEach(int target, int[] arr){
      for (int elem: arr){
        if (elem % target != 0){
          return false;    
        }    
      }
      return true;   
    }
    
    static int getTotalX(int[] a, int[] b) {
        // Complete this function
        
        ArrayList<Integer> commonMultiples = new ArrayList<Integer>();
        
        int index = a[a.length - 1]; // find common multiples starting index at largest value of a
        int firstB = b[0];
        
        while (index <= firstB){
          if ( divisibleByEach(a, index) ){
            commonMultiples.add(index);    
          }
          index++;     
        }
        
        int numbersBetween = 0;
        
        for (int elem: commonMultiples){
          if ( factorOfEach(elem, b) ){
            numbersBetween++;    
          }   
        }
       
        return numbersBetween;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}