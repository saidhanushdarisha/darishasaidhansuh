package saidhanushdarisha;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a: ");
        int a = sc.nextInt();

        int count;
        if (a % 2 == 0) {
            count = a - 1; 
        } else {
            count = a;
        }

        int currentOdd = 1;
        for (int i = 1; i <= count; i++) {
            System.out.print(currentOdd);
            if (i < count) {
                System.out.print(", ");
            }
            currentOdd += 2;
        }
    }
}
