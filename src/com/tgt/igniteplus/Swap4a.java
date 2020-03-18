package com.tgt.igniteplus;
import java.util.*;
public class Swap4a{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x,y,z;
        System.out.println("enter the two no.s to be swapped");
        x = in.nextInt();
        y=in.nextInt();
        System.out.println("no.s before swapping: X="+x+" Y="+y);
        z=x;
        x=y;
        y=z;
        System.out.println("no.s after swapping: X=" +x+" Y="+y);

    }
}