import java.io.*;
import java.util.*;

/** Cannot use a printf solution with right-justified notation, because %s can only use hardcoded
integer values (not actual staircase length from input) to denote space. This solution initializes
a char array and assigns the elements with spaces using a loop. In another loop, these values are
replaced with # until the desired output is attained.
*/

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner keyboard = new Scanner(System.in);
        
        int staircaseSize = keyboard.nextInt();
        char [] stairs = new char [staircaseSize];
        
        for (int i = 0; i < stairs.length; i++){
          stairs[i] = ' ';    
        }
        
        for (int i = 0; i < stairs.length; i++){
          stairs[stairs.length - 1 - i] = '#';  
          System.out.println(stairs);    
        }
    }
}