package nyc.c4q.poojawins;

import java.util.Scanner;
import java.net.URL;

public class WebPageSanitizer {

    public static void main(String[] args) {
        System.out.println("Enter a url you want to analyze: ");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        URL url = HTTP.stringToURL(input);
        String thing = HTTP.get(url);
        System.out.println(thing);
        System.out.println(sanitize(thing));
//        stupid test string
        System.out.println(sanitize("i love <script>evil</script>things yesss <script>omg omg</script> hahahaha"));
    }

    public static String sanitize(String html) {
        String regex = "<script\\b[^>]*>([\\s\\S]*?)<\\/script>";
        return html.replaceAll(regex, "");
    }

}
