package nyc.c4q.poojawins;

/**
 * Class for returning a string of unique characters
 */
public class StringThing {
    public static void main(String[] args) {

        uniqueCharacters("abbcaabcaa"); //abc
        uniqueCharacters("apple"); //aple or aepl
        uniqueCharacters("microsoft"); //microsft
    }

    public static void uniqueCharacters(String S) {
        String S2 = "";
        for(int i = 0; i < S.length(); i++) {
            if (!S2.contains(S.charAt(i)+"")) {
                S2 += S.charAt(i);
            }
        }
        System.out.println(S2);
    }
}

