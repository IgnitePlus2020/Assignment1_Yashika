package com.tgt.igniteplus;
import java.util.Scanner;
public class Fact18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,fact=1;
        System.out.println("Enter the value of n:");
        n = in.nextInt();
        for(int i=n;i>=1;i--)
        {
            fact=fact*i;
        }
        System.out.println("factorial of n="+fact);
    }
}
