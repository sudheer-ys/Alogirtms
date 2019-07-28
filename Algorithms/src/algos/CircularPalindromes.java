package algos;


import java.io.*;
import java.util.*;

public class CircularPalindromes {

  public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int len = scn.nextInt();
        String input = scn.next();
        
        for (int i = 0; i < len; i++) 
        	System.out.println(subs(input.substring(i, len) +input.substring(0, i)));
    }
	  
   static boolean isPalindrome(String str){
       StringBuilder tempString = new StringBuilder(str);
       return str.equals(tempString.reverse().toString());
   }

   static int subs(String s){
       int max=0;
       for(int j = 0 ; j < s.length(); j++ ) {
           for (int i = 1; i <= s.length() - j; i++) {
               String sub = s.substring(j, j+i);
               if(isPalindrome(sub) && sub.length()>max){
                   max = sub.length();
               }
           }

       }
       return max;
   }  
}