package com.leetcode.algorithm.hard.guesstheword;

import com.leetcode.algorithm.common.Master;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
  public void findSecretWord(String[] wordlist, Master master) {
    List<String> words = Arrays.asList(wordlist);

    for (int i = 0; i < 10; i++) {
      String s = pickGuess(words);
      int overlap = master.guess(s);
      if (overlap == 6) {
        return;
      }
      List<String> list = new ArrayList<>();
      for (String word: words) {
        if (match(word, s) == overlap) {
          list.add(word);
        }
      }
      words = list;
    }
  }

  private String pickGuess(List<String> words) {
    int minMaxPeak = Integer.MAX_VALUE;
    String res = "";
    for (String word: words) {
      int curPeak = histogramPeak(word, words);
      if (curPeak < minMaxPeak) {
        minMaxPeak = curPeak;
        res = word;
      }
    }

    return res;
  }

  private int histogramPeak(String word, List<String> words) {
    int[] hist = new int[7];
    for (String s: words) {
      hist[match(s, word)]++;
    }
    int maxPeak = 0;
    for (int num: hist) {
      maxPeak = Math.max(maxPeak, num);
    }
    return maxPeak;
  }

  private int match(String word1, String word2) {
    int count = 0;
    for (int i = 0; i < word1.length(); i++) {
      if (word1.charAt(i) == word2.charAt(i)) {
        count++;
      }
    }
    return count;
  }
}
