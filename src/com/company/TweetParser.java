package com.company;

import java.net.URL;
import java.util.Arrays;
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

        String mentionRegex = "(@[\\w_-]+)";
        String hashtagRegex = "(#[\\w_-]+)";
        String urlRegex = "(https?|ftp|file):\\/\\/[-a-zA-Z0-9+&@#\\/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#\\/%=~_|]";

        this.mentions = getMatches(mentionRegex, tweet);
        this.topics = getMatches(hashtagRegex, tweet);
        this.references = getMatches(urlRegex, tweet);
    }

    private String[] getMatches(String regex, String input) {
        List<String> list = new ArrayList<String>();
        Matcher m = Pattern.compile(regex).matcher(input);
        while (m.find()) {
            list.add(m.group());
        }
        String[] array = new String[list.size()];
        list.toArray(array);
        return array;
    }

    public String getTweet() {
        return tweet;
    }

    public String[] getMentions() {
        return mentions;
    }

    public int numberOfMentions() {
        return mentions.length;
    }

    public boolean hasMentions(String User) {
        return
    }



    public String[] getReferences() {
        return references;
    }


    public int numberOfReferences() {
        return references.length;
    }

    public String[] getTopics() {
        return topics;
    }

    public int numberOfTopics() {
        return topics.length;
    }

    public boolean hasTopics() {
        return
    }




}


//if (mentionRegex.matches("@")) {
            //System.out.println(tweet);
        //} else if (hashtagRegex.matches("#Cars")) {
            //System.out.println(tweet);
        //} else if (urlRegex.matches("http")) {
           // System.out.println(tweet);
        //}






















        //create a method that get URLS from tweet
        //get mentions from tweets
        //get Hashtags from tweets

        //then store the information in list (list of mentions)
        //mention list
        //URL list
        //hashtag list
        //put every mention in the list










