package nyc.c4q.poojawins;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        int fib;
        int fib1 = 0;
        int fib2 = 1;

        Scanner in = new Scanner(System.in);
        System.out.println("How many fibonacci numbers do you want to see?");
        int fibs = in.nextInt();
        for(int i = 0; i < fibs; i++) {
            if (i == 0) {
                System.out.println(0);
            } else if (i == 1) {
                System.out.println(1);
            } else {
                fib = fib1 + fib2;
                fib1 = fib2;
                fib2 = fib;
                System.out.println(fib);
            }
        }
    }

}
