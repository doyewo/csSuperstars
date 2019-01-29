package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String tweet = scanner.nextLine();
        TweetParser tp = new TweetParser(tweet);

        System.out.println("Mentions:");
        System.out.println(Arrays.toString(tp.getMentions()));
        System.out.println();

        System.out.println("Topics:");
        System.out.println(Arrays.toString(tp.getTopics()));
        System.out.println();

        System.out.println("References:");
        System.out.println(Arrays.toString(tp.getReferences()));
        System.out.println();

    }
}