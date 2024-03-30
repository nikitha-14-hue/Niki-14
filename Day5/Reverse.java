package com.targetindia.programs;
import java.util.*;
public class Reverse {
    static String reversebywords(String s)
    {
        String arr[]=null;
        arr=s.split(" ");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
        return null;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        reversebywords(s);
    }
}
