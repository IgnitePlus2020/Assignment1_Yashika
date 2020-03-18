package com.tgt.igniteplus;
import java.io.*;
import java.util.*;
public class Pattern1{

    public static void main(String[] args) {
        // write your code here
        Scanner in =new Scanner(System.in);
        int n,i,j;
        System.out.println("enter value for n");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");

            }
            System.out.println();
        }

    }
}