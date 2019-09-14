package com.leetcode.algorithm.easy.singlerowkeyboard;

import java.util.HashMap;
import java.util.Map;

class Solution {
//  public int calculateTime(String keyboard, String word) {
//    Map<Character, Integer> map = new HashMap<>();
//    for (int i = 0; i < keyboard.length(); i++) {
//      map.put(keyboard.charAt(i), i);
//    }
//
//    int ans = 0;
//    int prev = 0;
//    for (char c: word.toCharArray()) {
//      ans += Math.abs(map.get(c) - prev);
//      prev = map.get(c);
//    }
//
//    return ans;
//  }

  public int calculateTime(String keyboard, String word) {
    int[] index = new int[26];
    for (int i = 0; i < keyboard.length(); i++) {
      index[keyboard.charAt(i) - 'a'] = i;
    }

    int ans = 0;
    int prev = 0;
    for (char c: word.toCharArray()) {
      ans += Math.abs(index[c - 'a'] - prev);
      prev = index[c - 'a'];
    }

    return ans;
  }
}
