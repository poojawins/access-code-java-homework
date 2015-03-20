package nyc.c4q.poojawins;

import java.util.Scanner;

public class PrettyTitle {
    public static void main(String[] args) {
        String word;
        String title = "a tale of two cities";
        char special = '*';

        Scanner in = new Scanner(title);

        while(in.hasNext()) {
            word = in.next();
            System.out.print(word.substring(0, 1).toUpperCase() + word.substring(1, word.length()) + " ");
        }
        System.out.println();
        printUnderline(title, special);
    }

    public static void printUnderline(String title, char special) {
        String word;

        Scanner in = new Scanner(title);

        while(in.hasNext()) {
            word = in.next();
            for (int i = 0; i < word.length(); i++) {
                System.out.print(special);
            }
            System.out.print(" ");
        }
    }

}
