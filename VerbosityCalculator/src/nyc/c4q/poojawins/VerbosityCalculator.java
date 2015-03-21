package nyc.c4q.poojawins;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Calculate the verbosity of a text
 */
public class VerbosityCalculator {


    public static void main(String[] args) {

        File dickens = new File("/Users/pooja/IdeaProjects/VerbosityCalculator/resources/A-Tale-of-Two-Cities.txt");
        File melville = new File("/Users/pooja/IdeaProjects/VerbosityCalculator/resources/Moby-Dick.txt");

        double verbosityDickens = findVerbosity(dickens); //verbosity = 8.0
        double verbosityMelville = findVerbosity(melville); //verbosity = 9.0

        System.out.printf("Dickens verbosity: %2.2f \n", verbosityDickens);
        System.out.printf("Melville verbosity: %2.2f \n", verbosityMelville);

        if (verbosityDickens > verbosityMelville){
            System.out.println("Dickens is more verbose!");
        } else if (verbosityDickens < verbosityMelville) {
            System.out.println("Melville is more verbose!");
        } else {
            System.out.println("They are the same!");
        }
    }

    public static double findVerbosity(File file){

        int countSentences = 0;
        int countWords = 0;
        String line;

        try{
            Scanner sc = new Scanner(file);

            while(sc.hasNextLine()){
                line = sc.nextLine();
                countSentences++;

                for(String word : line.split("\\s+")) {
                    countWords++;
                }
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

        return ((double)countWords / countSentences);
    }

}
