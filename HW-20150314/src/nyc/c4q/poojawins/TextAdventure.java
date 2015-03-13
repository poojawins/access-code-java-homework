package nyc.c4q.poojawins;

/**
 * Created by pooja on 3/13/15.
 */

import java.util.Scanner;

public class TextAdventure {

    private static Scanner in;
    private static int health;

    public static void main (String[] args) {

        in = new Scanner(System.in);
        health = 30;

        //game intro
        System.out.println("Welcome to my text adventure game!");
        System.out.println("Your health is at " + health + " out of 30.");
        System.out.println("Each wrong move will cost you 10 health.");

        //story intro
        System.out.println("You wake up in a dark room. You don't know how you got there.");
        System.out.println("The last thing you remember is driving down the road and seeing a bright flash of light.");
        System.out.println("You're having trouble breathing. You know there isn't much time left. You've got to get out of here!");

        //step 1
        System.out.println("You see a sliver of light coming from under the door. You feel the walls until you find a doorknob.");
        System.out.println("Open door? (Y/N)");
        checkConditions(in.next(), 'N');

        //step 2
        System.out.println("You walk into a hallway. There is a break in the floorboards.");
        System.out.println("You think you can make it if you jump.");
        System.out.println("Jump for it? (Y/N)");
        checkConditions(in.next(), 'Y');

        //step 3
        System.out.println("You notice a staircase behind you and take it downstairs.");
        System.out.println("You enter a kitchen. You see a sandwich on the counter. You are pretty hungry.");
        System.out.println("Eat sandwich? (Y/N)");
        checkConditions(in.next(), 'Y');

        //step 4
        System.out.println("You leave the kitchen and enter the study. There is a sudoku puzzle on the desk.");
        System.out.println("Solve the puzzle? (Y/N)");
        checkConditions(in.next(), 'Y');

        //step 5
        System.out.println("You're almost out! You just need to find a door out of here!");
        System.out.println("You notice a bookshelf. Something looks off.");
        System.out.println("You pull on a book that sticks out slightly. It reveals a door.");
        System.out.println("Open door? (Y/N)");
        checkConditions(in.next(), 'N');

        System.out.println("You are free!");
    }

    private static void checkConditions(String decision, char incorrect) {
        correctInput(decision);
        if (decision.charAt(0) == incorrect) {
            wrongDecision();
        }
    }

    private static void correctInput(String decision) {
        while (decision.charAt(0) != 'Y' && decision.charAt(0) != 'N'){
            System.out.println("Invalid. Enter again: ");
            Scanner two = new Scanner(System.in);
            decision = two.next();
        }
    }

    public static void wrongDecision() {
        health -= 10;
        System.out.println("Wrong move!");
        hasDied(health);
    }

    public static void hasDied(int health) {
        if (health < 1 ) {
            System.out.println("Oh no! You have died!");
            System.exit(0);
        }
        else {
            System.out.println("It's cool. You're still alive. Your health is at " + health);
        }
    }
}

