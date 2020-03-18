package com.tgt.igniteplus;
import java.util.Scanner;
public class Power24 {
    public static void main(String[] args) {
        int n, x, res = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n and its power:");
        n = in.nextInt();
        x = in.nextInt();
        for (int i = 1; i <= x; i++) {
            res=res*n;
        }
        System.out.println("Result=" + res);
    }
}
