package com.leetcode.algorithm.medium.designtwitter;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwitterTest {
  @Test
  public void testCase1() {
    Twitter twitter = new Twitter();
    twitter.postTweet(1, 5);
    assertEquals(Arrays.asList(5), twitter.getNewsFeed(1));
    twitter.follow(1, 2);
    twitter.postTweet(2, 6);
    assertEquals(Arrays.asList(6, 5), twitter.getNewsFeed(1));
    twitter.unfollow(1, 2);
    assertEquals(Arrays.asList(5), twitter.getNewsFeed(1));
  }
}
