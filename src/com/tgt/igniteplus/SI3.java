package com.tgt.igniteplus;
import java.util.*;
public class SI3 {
    public static void main(String[] args) {
        float p,t,r,si;
        Scanner in =new Scanner(System.in);
        System.out.println("enter principal");
        p=in.nextFloat();
        System.out.println("enter time");
        t=in.nextFloat();
        System.out.println("enter rate");
        r=in.nextFloat();
        si=(p*t*r)/100;
        System.out.println("simple interest="+si);

    }
}