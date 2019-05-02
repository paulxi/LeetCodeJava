package com.leetcode.algorithm.medium.numberofmatchingsubsequences;

import java.util.ArrayList;
import java.util.List;

class Solution {
//  public int numMatchingSubseq(String s, String[] words) {
//    int ans = 0;
//    for (String word: words) {
//      int i = 0;
//      int j = 0;
//      while (i < s.length() && j < word.length()) {
//        if (s.charAt(i) == word.charAt(j)) {
//          j++;
//        }
//        i++;
//      }
//
//      if (j == word.length()) {
//        ans++;
//      }
//    }
//
//    return ans;
//  }

  public int numMatchingSubseq(String s, String[] words) {
    List<int[]>[] waiting = new List[128];
    for (int c = 0; c <= 'z'; c++) {
      waiting[c] = new ArrayList<>();
    }

    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      char c = word.charAt(0);
      waiting[c].add(new int[] {i, 1});
    }

    for (char c: s.toCharArray()) {
      List<int[]> advance = new ArrayList<>(waiting[c]);
      waiting[c].clear();

      for (int[] a: advance) {
        if (a[1] < words[a[0]].length()) {
          char next = words[a[0]].charAt(a[1]++);
          waiting[next].add(a);
        } else {
          waiting[0].add(a);
        }
      }
    }

    return waiting[0].size();
  }
}
