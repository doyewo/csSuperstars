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

// TweetParser method takes String input (a tweet) and retrieves the mention, hashtag, and URL based on regex
public TweetParser(String tweet) {
this.tweet = tweet;

String mentionRegex = "/\\s([@][\\w_-]+)/g";
String hashtagRegex = "/\\s([#][\\w_-]+)/g ";
String urlRegex = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";

mentions = getMatches(mentionRegex, tweet);
topics = getMatches(hashtagRegex, tweet);
references = getMatches(urlRegex, tweet);
}

// getMatches method takes regex and tweet and adds it to list, returns the array's contents 
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

//return tweet
public String getTweet() {
return tweet;
}

//returns String array containing all mentions
public String[] getMentions() {
return mentions;
}

//returns String array containing allreferences or "URLs"
public String[] getReferences() {
return references;
}

//returns String array containing all hashtags
public String[] getTopics() {
return topics;
}

}