import java.io.Console;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import com.sun.tools.javac.util.Assert;

import jdk.internal.jline.internal.TestAccessible;

public class TweetParserTester implements TweetParser{

    @test
    public void TweetParserTest() {

    }    

    @test
    public void getMatchesTest() {
        
    }

    @test
    public void getTweetTest() {
        final String expected = "@Sarah hate #cats. Visit https://thecatsite.com now to buy cats";
        final String actual = tweet.getTweet();
        Assert.assertEquals(actual, expected);
    }

    @test
    public void getMentionsTest() {
        final String expected = "@Sarah";
        final String actual = tweet.getMentions();
        Assert.assertEquals(actual, expected);
    }

    @test
    public void getReferencesTest() {
        final String expected = "https://thecatsite.com";
        final String actual = tweet.getReferences();
        Assert.assertEquals(actual, expected);
    }

    @test 
    public void getTopicsTest() {
        final String expected = "#cats";
        final String actual = tweet.getTopicsTest();
        Assert.assertEquals(actual, expected);
    }
}


/*
public class TweetParserTester {

    public static void main(String[] args){
        Console console = System.console();
        if (console == null) {
            System.err.println("No console.");
            System.exit(1);
        }
        while (true) {

            Pattern pattern = 
            Pattern.compile(console.readLine("%nEnter your regex: "));

            Matcher matcher = 
            pattern.matcher(console.readLine("Enter input string to search: "));

            boolean found = false;
            while (matcher.find()) {
                console.format("I found the text" +
                    " \"%s\" starting at " +
                    "index %d and ending at index %d.%n",
                    matcher.group(),
                    matcher.start(),
                    matcher.end());
                found = true;
            }
            if(!found){
                console.format("No match found.%n");
            }
        }
    }
}*/
