package com.leetcode.algorithm.easy.sentencesimilarity;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
  public boolean areSentencesSimilar(String[] words1, String[] words2, String[][] pairs) {
    if (words1.length != words2.length) {
      return false;
    }

    Set<List<String>> set = new HashSet<>();
    for (String[] p: pairs) {
      set.add(Arrays.asList(p[0], p[1]));
      set.add(Arrays.asList(p[1], p[0]));
    }

    for (int i = 0; i < words1.length; i++) {
      if (words1[i].equals(words2[i])) {
        continue;
      }
      if (!set.contains(Arrays.asList(words1[i], words2[i]))) {
        return false;
      }
    }

    return true;
  }
}
