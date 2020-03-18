package com.tgt.igniteplus;
import java.util.Scanner;
public class NumtoWord10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,i;
        System.out.print("enter the 5-digit number to be converted to word: ");
        n=in.nextInt();
        String one[]={"zero ","one","two","three","four","five","six","seven","eight","nine"};
        i=(n/10000);
        System.out.print(one[i]+" ");
        i=(n/1000)%10;
        System.out.print(one[i]+" ");
        i=(n/100)%10;
        System.out.print(one[i]+" ");
        i=(n/10)%10;
        System.out.print(one[i]+" ");
        i=n%10;
        System.out.print(one[i]);
    }
}

