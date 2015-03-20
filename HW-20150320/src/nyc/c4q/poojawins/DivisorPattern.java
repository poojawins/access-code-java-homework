package nyc.c4q.poojawins;

import java.util.Scanner;

public class DivisorPattern {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = in.nextInt();
        System.out.println("Enter a second number: ");
        int num2 = in.nextInt();
        printAts(num1 , num2);
    }

    public static void printAts(int m, int n) {
        for(int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if ((j % i == 0) || (i % j == 0)) {

                    System.out.print("@ ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}

