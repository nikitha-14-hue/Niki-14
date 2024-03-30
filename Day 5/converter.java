package com.targetindia.programs;
import java.util.*;
public class converter {
    static String words(int num) {
        int x = num % 10;
        int y = num % 100;
        int z = num % 1000;
        String nums[] = {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String tens[] = {"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety","hundred"};
        if (num <= 19) {
            return nums[num];
        }
        else if (num >= 20 && num <= 100) {
            int ten = num / 10;
            String s = x == 0 ? tens[ten - 2] : tens[ten - 2] + " " + nums[x];
            return s;
        }
        else if (num > 100 && num <= 1000) {
            int hundred = num / 100;
            String S = y == 0 ? nums[hundred] + " hundred" : nums[hundred] + " hundred " + words(y);
            return S;
        }
        else if (num > 1000 && num <= 100000) {
            int thousand = num / 1000;
            String S = z == 0 ? words(thousand) + " thousand" : words(thousand) + " thousand " + words(z);
            return S;
        }
        else if (num < 10000000) {
            int lakh = num / 100000;
            String a = num % 100000 == 0 ? words(lakh) + " lakh" : words(lakh) + " lakh " + words(num % 100000);
            return a;
        }
        return words(num / 10000000) + " crore" + ((num % 10000000 != 0) ? " " + words(num % 10000000) : "");
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        System.out.println(words(num));
    }
}
