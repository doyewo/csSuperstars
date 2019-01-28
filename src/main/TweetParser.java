import java.net.URL;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.lang.String;

public class TweetParser {
private String[] mentions;
private String[] topics;
private String[] references;

private String tweet;

public TweetParser(String tweet) {
this.tweet = tweet;

String mentionRegex = "/\\s([@][\\w_-]+)/g";
String hashtagRegex = "/\\s([#][\\w_-]+)/g ";
String urlRegex = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";

mentions = getMatches(mentionRegex, tweet);
topics = getMatches(hashtagRegex, tweet);
references = getMatches(urlRegex, tweet);
}

private String[] getMatches(String regex, String input) {
List<String> list = new ArrayList<String>();
Matcher m = Pattern.compile(regex).matcher(input);
while (m.find()) {
list.add(m.group());
}
String[] array = new String[list.size()];
list.toArray(array); // fill the array
return array;
}

public String getTweet() {
return tweet;
}

public String[] getMentions() {
return mentions;
}

public String[] getReferences() {
return references;
}

public String[] getTopics() {
return topics;
}


}