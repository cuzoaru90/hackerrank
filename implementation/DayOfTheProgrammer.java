import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getDays(int year){
      int result = 0;
        
      if (year >= 1700 && year <= 1917){
        result = julianDays(year); 
      }
      else if ( year >= 1919){
        result = gregorianDays(year);    
      }
      else{
        result = 230;    
      }  
        
      return result;  
        
    }
    
    static int julianDays(int year){
        
      if (year % 4 == 0){
        return 244;    
      } 
      else{
        return 243;    
      }  
        
    }
    
    static int gregorianDays(int year){
      if (year % 400 == 0){
        return 244;    
      } 
      else if (year % 4 == 0 && !(year % 100 == 0) ) {
        return 244;    
      }  
      else{
        return 243;    
      }  
        
    }
    
    static String solve(int year){
        // Complete this function
        int firstEightMonths = getDays(year);
        int programmerDay = 256 - firstEightMonths;
        
        return programmerDay + ".09." + year; 
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}