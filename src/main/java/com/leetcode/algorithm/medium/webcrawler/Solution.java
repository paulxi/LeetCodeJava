package com.leetcode.algorithm.medium.webcrawler;

import com.leetcode.algorithm.common.HtmlParser;

import java.util.*;

class Solution {
  public List<String> crawl(String startUrl, HtmlParser htmlParser) {
    Set<String> set = new HashSet<>(Arrays.asList(startUrl));
    String hostName = startUrl.split("/")[2];
    dfs(set, htmlParser, hostName, startUrl);
    return new ArrayList<>(set);
  }

  private void dfs(Set<String> visited, HtmlParser parser, String hostName, String currentUrl) {
    for (String url: parser.getUrls(currentUrl)) {
      if (url.contains(hostName) && visited.add(url)) {
        dfs(visited, parser, hostName, url);
      }
    }
  }
}
