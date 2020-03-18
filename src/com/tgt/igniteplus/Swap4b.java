package com.tgt.igniteplus;
import java.util.*;
public class Swap4b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, y, z, temp1, temp2;
        System.out.println("enter the three no.s to be swapped");
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        System.out.println("no.s before swapping: X=" + x + " Y=" + y + " Z=" + z);
        temp1 = x;
        temp2 = y;
        x = temp2;
        System.out.println("no.s after swapping: X=" + x + " Y=" + y + " Z=" + z);
    }
}