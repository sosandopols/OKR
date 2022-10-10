package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        n = scanner.nextInt();
        String s = Integer.toString(n);
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (c == '1')
                System.out.print("one ");
            else if (c == '0')
                System.out.print("zero ");
            else
                System.out.print("I don't know ");
        }
        System.out.println();
        int k2 = 0, k3 = 0;
        for (int i = 1; i <= 10; i++){
            if (i % 2 == 0)
                k2++;
            if (i % 3 == 0)
                k3++;
        }
        System.out.println("делятся на 2 чисел "+k2);
        System.out.println("делятся на 3 чисел "+k3);

    }
}
