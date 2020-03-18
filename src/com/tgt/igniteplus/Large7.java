package com.tgt.igniteplus;
import java.util.*;
public class Large7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x,y,z,max1=0,max2=0;
        System.out.println("enter the three no.s");
        x=in.nextInt();
        y=in.nextInt();
        z=in.nextInt();
        if(x>y && x>z) {
            max1 = x;
            if (y > z)
                max2 = y;
            else
            max2 = z;
        }
        if(y>z && y>x) {
            max1 = y;
            if (x > z)
                max2 = x;
            else
            max2 = z;
        }
        if(z>y && z>x) {
            max1 = z;
            if (y > x)
                max2 = y;
            else
            max2 = x;
        }
        System.out.println("largest no="+max1+"second largest no="+max2);

    }
}
