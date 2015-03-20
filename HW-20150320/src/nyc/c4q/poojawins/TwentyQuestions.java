package nyc.c4q.poojawins;

import java.lang.Math;
import java.util.Scanner;

public class TwentyQuestions {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Guess what X is (0 - 10000): ");
        int random = (int) (Math.random() * 10000);
        int count = 0;
        while (count < 20) {
            int guess = in.nextInt();
            while (guess < 0 || guess > 10000) {
                System.out.println("Guess must be between 0 and 10000!");
                guess = in.nextInt();
            }
            checkGuess(guess, random);
            count++;
        }
        System.out.println("You lose!");
    }

    public static void checkGuess(int guess, int answer) {
        if (guess > answer) {
            System.out.println("Input number is higher than X");
        } else if (guess < answer) {
            System.out.println("Input number is lower than X");
        } else {
            System.out.println("You Guessed X!");
            System.exit(0);
        }
    }

}

