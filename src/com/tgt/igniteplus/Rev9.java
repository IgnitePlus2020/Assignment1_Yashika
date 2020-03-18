package com.tgt.igniteplus;
import java.util.Scanner;
public class Rev9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, n, r = 0;
        System.out.println("enter the value of n");
        num = in.nextInt();
        while (num != 0) {
            n = num % 10;
            r = r * 10 + n;
            num = num / 10;
        }
        System.out.println("reversed no.="+r);
    }
}
