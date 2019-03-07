import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String kangaroo(int x1, int v1, int x2, int v2) {
          
        if ( ( (x1 == x2) && (v1 >= v2) ) || ( (x1 == x2) && (v2 > v1) ) ){
          return "NO";  
        }
        
        if ( (v1 < 1 && v1 > 10000) || (v2 < 1 && v1 > 10000) ){
          return "NO";    
        }
           
        do{
              
          if (x1 == x2){
            return "YES";     
          }
          else if ( (x1 > x2 && v1 >= v2) || (x2 > x1 && v2 >= v1) )
          {
            return "NO";    
          }  
           
          x1 += v1;
          x2 += v2;   
            
        } while (x1 != x2);
        
        return "YES";
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}