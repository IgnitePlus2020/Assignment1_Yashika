package com.tgt.igniteplus;
import java.util.*;
public class Pattern2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n,i,j;
        System.out.println("enter value for n");
        n=in.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=n-i;j>1;j--)
            {
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}