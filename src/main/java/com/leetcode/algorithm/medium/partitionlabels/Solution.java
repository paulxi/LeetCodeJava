package com.leetcode.algorithm.medium.partitionlabels;

import java.util.LinkedList;
import java.util.List;

class Solution {
  public List<Integer> partitionLabels(String str) {
    int[] last = new int[26];
    for (int i = 0; i < str.length(); i++) {
      last[str.charAt(i) - 'a'] = i;
    }

    int j = 0;
    int anchor = 0;
    List<Integer> result = new LinkedList<>();
    for (int i = 0; i < str.length(); i++) {
      j = Math.max(j, last[str.charAt(i) - 'a']);

      if (i == j) {
        result.add(j - anchor + 1);
        anchor = i + 1;
      }
    }

    return result;
  }
}
