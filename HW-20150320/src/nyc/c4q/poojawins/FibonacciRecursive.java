package nyc.c4q.poojawins;

import java.util.Scanner;

public class FibonacciRecursive {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many fibonacci numbers do you want to see?");
        int fibs = in.nextInt();
        for(int i = 0; i < fibs; i++) {
            System.out.println(getFib(i));
        }
    }

    public static int getFib(int i) {
        if (i == 0) {
            return 0;
        } else if (i == 1) {
            return 1;
        } else {
            return getFib(i - 1) + getFib(i - 2);
        }
    }

}
