package nyc.c4q.poojawins;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * calculate the distribution of characters in the contents of a text file
 */
public class DistributionCalculator {

    public static int countLetters = 0;

    public static void main(String[] args) {
        File myFile = new File("Moby-Dick.txt");
        printResults(calculate(myFile));
    }

    /**
     * calculates how many times a character [a-z] appears in a given file
     */
    public static HashMap<String, Integer> calculate(File textFile) {
        String line;

        String str = "abcdefghijklmnopqrstuvwxyz";

        HashMap<String, Integer> myHashMap = new HashMap<String, Integer>();
        for (char c : str.toCharArray()) {
            myHashMap.put(c + "", 0);
        }

        try{
            Scanner sc = new Scanner(textFile);
            while(sc.hasNextLine()){
                line = sc.nextLine().toLowerCase();
                for (int i = 0; i < line.length(); i++) {
                    if (myHashMap.containsKey(line.charAt(i)+"")) {
                        myHashMap.put(line.charAt(i)+"", myHashMap.get(line.charAt(i)+"") + 1);
                        countLetters++;
                    }
                }
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

        return myHashMap;
    }

    /**
    * prints out result in correct format
    */
    public static void printResults(HashMap<String, Integer> resultHashMap) {
        for (String key : resultHashMap.keySet()) {
            System.out.printf(key + " = " + "%.2f",((double) resultHashMap.get(key) / countLetters * 100));
            System.out.print(" %\n");
        }
    }
    
}
