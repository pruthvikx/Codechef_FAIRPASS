package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for (int i = 0; i < t;i++){
            int friends = scan.nextInt();
            int pass = scan.nextInt();
            System.out.println((pass)>friends ? "YES":"NO");
        }
    }
}
