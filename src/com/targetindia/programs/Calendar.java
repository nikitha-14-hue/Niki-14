package com.targetindia.programs;
import java.util.*;
public class Calendar {
        static boolean isLeapYear(int year) {
            return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        }
        static int cal(int m, int y) {
            if (m < 1 || m > 12) {
                throw new IllegalArgumentException("Month must be between 1 and 12");
            }
            if (y < 1) {
                throw new IllegalArgumentException("Year must be >= 1");
            }
            int arr[] = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5}; // Common array for both leap and non-leap years
            int c = y - 1;
            int ly = c / 4;
            int ny = c - ly;
            int days = ly * 2 + ny + arr[m - 1];
            if (days >= 7) {
                days = days % 7;
            }
            return days;
        }
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter month (1-12):");
            int m = sc.nextInt();
            System.out.println("Enter year:");
            int y = sc.nextInt();
            int startingDay = cal(m, y);
            // Printing calendar header
            System.out.println("Su  Mo  Tu  We  Th  Fr  Sa");
            // Printing spaces for the starting day
            for (int i = 0; i < startingDay; i++) {
                System.out.print("    ");
            }
            // Printing dates
            int daysInMonth;
            if (m == 2) {
                daysInMonth = isLeapYear(y) ? 29 : 28;
            } else if (m == 4 || m == 6 || m == 9 || m == 11) {
                daysInMonth = 30;
            } else {
                daysInMonth = 31;
            }
            for (int day = 1; day <= daysInMonth; day++) {
                System.out.printf("%-4d", day);
                if ((day + startingDay) % 7 == 0 || day == daysInMonth) {
                    System.out.println();
                }
            }
        }
    }
