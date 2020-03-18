package com.tgt.igniteplus;
import java.util.Scanner;
public class RevStr25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str,rev="";
        int len;
        System.out.println("enter a string");
        str= in.nextLine();
        len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println("Original string: " + str);
        System.out.println("Reverse string: " + rev);
    }
}


