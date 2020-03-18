package com.tgt.igniteplus;
import java.util.*;
public class OddEven5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("enter a no.");
        n = in.nextInt();
        if (n % 2 == 0) {
            System.out.println("the no. is even");
        } else {
            System.out.println("the no. is odd");
        }
    }
}
