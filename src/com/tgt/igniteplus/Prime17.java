package com.tgt.igniteplus;
import java.util.*;
public class Prime17 {
    public static void main(String[] args) {
        int n = 0, m = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the range:");
        n = in.nextInt();
        m = in.nextInt();
        for (int i = n; i <= m; i++) {
            int flag = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                System.out.print(i + "\t");
        }
    }
}


