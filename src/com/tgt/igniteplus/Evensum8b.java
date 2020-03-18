package com.tgt.igniteplus;
import java.util.Scanner;
public class Evensum8b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0, n;
        System.out.println("enter the value of n");
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            if ((i % 2)== 0)
                sum = sum + i;
        }
        System.out.println("even sum=" + sum);
    }
}


