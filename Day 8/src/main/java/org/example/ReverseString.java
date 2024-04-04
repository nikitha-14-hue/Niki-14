package org.example;
import java.util.*;
public class ReverseString {
     public static String Reverse(String s)
     {
         String arr[]=null;
         arr=s.split("\\s+");
         StringBuilder reversed = new StringBuilder();
         for(int i=arr.length-1;i>=0;i--)
         {
             reversed.append(arr[i]).append(" ");
         }
         return reversed.toString().trim();
     }
     public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter string:");
         String S=sc.nextLine();
         System.out.println(S);

     }
}
