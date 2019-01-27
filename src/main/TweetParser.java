import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.lang.String;

public class TweetParser {

    String urlRegex = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
    Pattern pattern = Pattern.compile(urlRegex);

    String mentionRegex = "/^(?!.*\\bRT\\b)(?:.+\\s)?@\\w+/i";
    Pattern pattern1  = Pattern.compile(mentionRegex);

    String hashtagRegex = "\\B(\\#[a-zA-Z]+\\b)(?!;)";
    Pattern pattern2 = Pattern.compile((hashtagRegex));

    Matcher matcher = pattern.matcher("@Sarah loves cars.");
    Matcher matcher1 = pattern1.matcher("#Cars are awesome");
    Matcher matcher2 = pattern2.matcher("Visit https://www.cars.com for more cars") ;

    private String tweet;

    public TweetParser(String tweet) {
        if (mentionRegex.contains("@Sarah")) {
            System.out.println(pattern);
        }  else if(hashtagRegex.contains("#Cars")) {
            System.out.println(pattern1);
        } else if(urlRegex.contains("http")) {
            System.out.println(pattern2);
        }