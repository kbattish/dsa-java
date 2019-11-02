package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        quick_find qf = new quick_find(N);
        while(in.hasNextInt()){
            int p = in.nextInt();
            int q = in.nextInt();
            if (!qf.connected(p,q)){
                qf.union(p,q);
                System.out.println(p + " " + q);
            }
        }
    }
}
