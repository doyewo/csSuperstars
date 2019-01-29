package com.company;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class test {

    class TweetParserTest {
        String tweet = "@Sarah hate #cats. Visit https://thecatsite.com now to buy cats";
        TweetParser tp = new TweetParser(tweet);

        @Test
        void testForMention() throws Exception {
            assertEquals(Arrays.asList(tp.getMentions()).contains("@Sarah"), true);
            assertEquals(Arrays.asList(tp.numberOfMentions()).contains("@Sarah"), 1);

        }

        @Test
        void testForTopic() throws Exception {
            assertEquals(Arrays.asList(tp.getTopics()).contains("#cats"), true);
            assertEquals(Arrays.asList(tp.numberOfTopics()).contains("#cats"), 1);

        }

        @Test
        void testForReferences() throws Exception {
            assertEquals(Arrays.asList(tp.getReferences()).contains("https://thecatsite.com"), true);
            assertEquals(Arrays.asList(tp.numberOfReferences()).contains("https://thecatsite.com"), 1);



        }}}
