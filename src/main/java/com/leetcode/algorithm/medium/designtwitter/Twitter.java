package com.leetcode.algorithm.medium.designtwitter;

import java.util.*;

class Twitter {
  Map<Integer, Set<Integer>> userFollow = new HashMap<>();
  Map<Integer, List<Integer>> userPost = new HashMap<>();
  List<Integer> posts = new ArrayList<>();
  Map<Integer, Integer> postPos = new HashMap<>();

  /** Initialize your data structure here. */
  public Twitter() {

  }

  /** Compose a new tweet. */
  public void postTweet(int userId, int tweetId) {
    if (!userPost.containsKey(userId)) {
      userPost.put(userId, new ArrayList<>());
    }
    userPost.get(userId).add(tweetId);
    posts.add(tweetId);
    postPos.put(tweetId, posts.size() - 1);
  }

  /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
  public List<Integer> getNewsFeed(int userId) {
    List<Integer> feed = getUserFeed(userId, 10);
    for (int followee: userFollow.getOrDefault(userId, new HashSet<>())) {
      feed.addAll(getUserFeed(followee, 10));
    }

    Collections.sort(feed, (a, b) -> postPos.get(b) - postPos.get(a));

    if (feed.size() <= 10) {
      return feed;
    } else {
      return feed.subList(0, 10);
    }
  }

  private List<Integer> getUserFeed(int userId, int max) {
    List list = userPost.getOrDefault(userId, Arrays.asList());
    if (list.size() <= max) {
      return new ArrayList<>(list);
    } else {
      int start = list.size() - max;
      return new ArrayList<>(list.subList(start, list.size()));
    }
  }

  /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
  public void follow(int followerId, int followeeId) {
    if (followerId == followeeId) {
      return;
    }
    if (!userFollow.containsKey(followerId)) {
      userFollow.put(followerId, new HashSet<>());
    }
    userFollow.get(followerId).add(followeeId);
  }

  /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
  public void unfollow(int followerId, int followeeId) {
    if (userFollow.containsKey(followerId)) {
      userFollow.get(followerId).remove(followeeId);
    }
  }
}
