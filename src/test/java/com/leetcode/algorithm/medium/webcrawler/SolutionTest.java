package com.leetcode.algorithm.medium.webcrawler;

import com.leetcode.algorithm.common.HtmlParser;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    HtmlParser parser =
        url -> {
          String[] urls =
              new String[]{
                  "http://news.yahoo.com",
                  "http://news.yahoo.com/news",
                  "http://news.yahoo.com/news/topics/",
                  "http://news.google.com",
                  "http://news.yahoo.com/us"
              };

          Map<String, Integer> map = new HashMap<>();
          map.put("http://news.yahoo.com", 0);
          map.put("http://news.yahoo.com/news", 1);
          map.put("http://news.yahoo.com/news/topics/", 2);
          map.put("http://news.google.com", 3);
          map.put("http://news.yahoo.com/us", 4);
          int[][] edges = new int[][]{{2, 0}, {2, 1}, {3, 2}, {3, 1}, {0, 4}};

          List<String> list = new ArrayList<>();
          if (map.containsKey(url)) {
            int p = map.get(url);
            for (int[] e : edges) {
              if (e[0] == p) {
                list.add(urls[e[1]]);
              }
            }
          }
          return list;
        };
    Solution solution = new Solution();
    assertEquals(
        Arrays.asList(
            "http://news.yahoo.com/news/topics/",
            "http://news.yahoo.com",
            "http://news.yahoo.com/news",
            "http://news.yahoo.com/us"),
        solution.crawl("http://news.yahoo.com/news/topics/", parser));
  }

  @Test
  public void testCase2() {
    HtmlParser parser =
        url -> {
          String[] urls =
              new String[]{
                  "http://news.yahoo.com",
                  "http://news.yahoo.com/news",
                  "http://news.yahoo.com/news/topics/",
                  "http://news.google.com"
              };

          Map<String, Integer> map = new HashMap<>();
          map.put("http://news.yahoo.com", 0);
          map.put("http://news.yahoo.com/news", 1);
          map.put("http://news.yahoo.com/news/topics/", 2);
          map.put("http://news.google.com", 3);
          int[][] edges = new int[][]{{0, 2}, {2, 1}, {3, 2}, {3, 1}, {3, 0}};

          List<String> list = new ArrayList<>();
          if (map.containsKey(url)) {
            int p = map.get(url);
            for (int[] e : edges) {
              if (e[0] == p) {
                list.add(urls[e[1]]);
              }
            }
          }
          return list;
        };
    Solution solution = new Solution();
    assertEquals(
        Arrays.asList("http://news.google.com"), solution.crawl("http://news.google.com", parser));
  }
}
