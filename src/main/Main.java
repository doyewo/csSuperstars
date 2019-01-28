import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String tweet = "@Sarah hate #cats. Visit https://thecatsite.com now to buy cats";
        TweetParser tp = new TweetParser(tweet);

        System.out.println(Arrays.toString(tp.getMentions()));
        System.out.println(Arrays.toString(tp.getTopics()));
        System.out.println(Arrays.toString(tp.getReferences()));

    }
}