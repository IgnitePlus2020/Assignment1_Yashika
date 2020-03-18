package com.tgt.igniteplus;
import java.util.Scanner;
public class Seq22 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n = in.nextInt();
        System.out.print("Fibonacci series: ");
        int a = 0, b = 1, i;
        if (n < 1)
            return;
        for (i = 1; i <= n; i++)
        {
            System.out.print(b + "\t");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}


