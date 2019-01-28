import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.lang.String;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class TweetParser {

    Scanner scanner = new Scanner(System.in);

    String urlRegex = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
    Pattern pattern = Pattern.compile(urlRegex);

    String mentionRegex = "/\\s([@][\\w_-]+)/g";
    Pattern pattern1  = Pattern.compile(mentionRegex);

    String hashtagRegex = "/\\s([#][\\w_-]+)/g";
    Pattern pattern2 = Pattern.compile((hashtagRegex));

    /*
    Matcher matcher = pattern.matcher("@Sarah loves cars.");
    Matcher matcher1 = pattern1.matcher("#Cars are awesome");
    Matcher matcher2 = pattern2.matcher("Visit https://www.cars.com for more cars") ;
    */

    Matcher matcher = pattern.matcher("Visit https://www.cars.com for more cars");
    Matcher matcher1 = pattern1.matcher("@Sarah loves cars.");
    Matcher matcher2 = pattern2.matcher("#Cars are awesome") ;

    private String tweet;
    private String Info;

    public TweetParser(String tweet) {

        String mentions[] = pattern1.split(tweet);
        String url[] = pattern.split(tweet);
        String hashtag[] = pattern.split(tweet);


        if (mentionRegex.matches("@")) {
            System.out.println(tweet);
        } else if (hashtagRegex.matches("#Cars")) {
            System.out.println(tweet);
        } else if (urlRegex.matches("http")) {
            System.out.println(tweet);
        }
    }
}
