package com.tgt.igniteplus;
import java.util.*;
public class ArmNum27 {
    public static void main(String[] args) {
        int n, arm_no = 0, temp, dig;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any value:\t");
        n = in.nextInt();
        temp = n;
        while (temp > 0) {
            dig = temp % 10;
            temp = temp / 10;
            arm_no = arm_no + (dig * dig * dig);
        }
        if (n == arm_no)
            System.out.println(n + " is an Armstrong number");
        else
            System.out.println(n + " is NOT an Armstrong number");
    }
}

