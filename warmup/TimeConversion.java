import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        String time = s.substring(0, s.length() - 2);
        String period = s.substring(s.length() - 2);
       
        String[] fields = time.split(":");
        
        int hours = Integer.valueOf(fields[0]);
        
        if (period.equals("PM") && hours < 12){
          hours += 12;
          return hours + ":" + fields[1] + ":" + fields[2];    
        }
        else if (period.equals("AM") && hours == 12){
          return "00" + ":" + fields[1] + ":" + fields[2];     
        }
        else{
          return fields[0] + ":" + fields[1] + ":" + fields[2];    
        }
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}