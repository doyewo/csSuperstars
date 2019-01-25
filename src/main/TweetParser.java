import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TweetParser {

    // URL Pattern
    String urlRegex = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
    Pattern pattern = Pattern.compile(urlRegex);
    
    // Mention Pattern
    String mentionRegex = "/^(?!.*\\bRT\\b)(?:.+\\s)?@\\w+/i";
    Pattern pattern1  = Pattern.compile(mentionRegex);

    // Hashtag Pattern
    String hashtagRegex = "\\B(\\#[a-zA-Z]+\\b)(?!;)";
    Pattern pattern2 = Pattern.compile((hashtagRegex));

    private String tweet;

    public TweetParser(String tweet) {
        String input = "@Sarah love cars." ;
        String regex = "/^(?!.*\\bRT\\b)(?:.+\\s)?@\\w+/i";
        Matcher matchMention = Pattern.compile(regex).matchMention(input);
        if (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }
}

