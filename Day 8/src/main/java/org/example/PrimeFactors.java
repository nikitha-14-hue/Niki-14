package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class PrimeFactors {
    public static boolean isprime(int i)
    {
        boolean isprime=true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0)
                {
                    isprime = false;
                }
            }
        return isprime;
    }
    public static List<Integer> primefactors(int n)
    {
        if(n<0)
        {
            n = Math.abs(n);
        }
        List<Integer> listnum = new ArrayList<>();
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                if(isprime(i))
                {
                    listnum.add(i);
                }
            }
        }
        return listnum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        int n=sc.nextInt();
        System.out.println(primefactors(n));
    }
}
