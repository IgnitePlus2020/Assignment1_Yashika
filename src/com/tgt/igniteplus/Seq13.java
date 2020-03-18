package com.tgt.igniteplus;
import java.lang.Math.*;
import java.util.Scanner;
public class Seq13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("enter value for n");
        n = in.nextInt();
        System.out.print("series = ");
        for (int i = 1; i <= n; i++)
        {
            System.out.print(+(int)(Math.pow(i,i))+"\t");
        }
    }
}
