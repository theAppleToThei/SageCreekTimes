package com.sagecreektimes.test;

import java.util.ArrayList;

import com.sagecreektimes.Feed;
import com.sagecreektimes.FeedMessage;
import com.sagecreektimes.RSSFeedParser;

public class SchoolNewsTest {
  public static void main(String[] args) {
    RSSFeedParser parser = new RSSFeedParser("http://sagecreektimes.weebly.com/2/feed");
    Feed feed = parser.readFeed();
    ArrayList<FeedMessage> messages = (ArrayList<FeedMessage>) feed.getMessages();
    System.out.println(feed);
    for (FeedMessage message : messages) {
      System.out.println(message);
    }
    System.out.println("\n\nTest Print Feed");
    System.out.println(feed.getTitle());
    System.out.println(feed.getDescription());
    System.out.println(feed.getPubDate());
    System.out.println(feed.getLink());
    System.out.println(feed.getCopyright());
    
    FeedMessage mostRecentMessage = messages.get(messages.size() - 1);
    System.out.println("\n\nTest Print Feed Message");
    System.out.println(mostRecentMessage.getTitle());
    System.out.println(mostRecentMessage.getDescription());
    mostRecentMessage.setAuthor("Sam Bodnar");
    System.out.println(mostRecentMessage.getAuthor());
    System.out.println(mostRecentMessage.getLink());
  }
} 