package com.leetcode.algorithm.easy.mostcommonword;

import java.util.HashMap;
import java.util.HashSet;

class Solution {
  public String mostCommonWord(String paragraph, String[] banned) {
    HashSet<String> bannedSet = new HashSet<>();
    for (String str : banned) {
      bannedSet.add(str);
    }

    String[] splittedWords = paragraph.toLowerCase().split("[ !?',;.]");
    HashMap<String, Integer> map = new HashMap<>();
    String maxWord = "";
    int maxCount = 0;
    for (String word : splittedWords) {
      if (!bannedSet.contains(word) && word.length() > 0) {
        int count = map.getOrDefault(word, 0) + 1;
        map.put(word, count);
        if (count > maxCount) {
          maxCount = count;
          maxWord = word;
        }
      }
    }

    return maxWord;
  }
}
