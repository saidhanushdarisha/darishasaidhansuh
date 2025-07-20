package saidhanushdarisha;

import java.util.Scanner;

public class Problem2 {
    

    public static void printOddSeries(int a) {
        for (int i = 0; i < a; i++) {
            System.out.print((2 * i + 1));
            if (i < a - 1) {
                System.out.print(", ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a: ");
        int a = sc.nextInt();

        printOddSeries(a);
    }
}
