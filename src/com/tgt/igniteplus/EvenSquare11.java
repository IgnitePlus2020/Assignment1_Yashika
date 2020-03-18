package com.tgt.igniteplus;
import java.util.Scanner;
public class EvenSquare11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("enter value for n");
        n = in.nextInt();
        System.out.print("series = ");
        for (int i = 2; i <= n; i=i+2)
        {
            System.out.print((i*i)+"\t");
        }
    }
}

