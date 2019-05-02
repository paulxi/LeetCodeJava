package com.leetcode.algorithm.easy.buddystrings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
  public boolean buddyStrings(String str1, String str2) {
    if (str1.length() != str2.length()) {
      return false;
    }

    if (str1.equals(str2)) {
      Set<Character> set = new HashSet<>();
      for (char c : str1.toCharArray()) {
        set.add(c);
      }
      return set.size() < str1.length();
    }

    List<Integer> diff = new ArrayList<>();
    for (int i = 0; i < str1.length(); i++) {
      if (str1.charAt(i) != str2.charAt(i)) {
        diff.add(i);
      }
    }

    return diff.size() == 2
        && str1.charAt(diff.get(0)) == str2.charAt(diff.get(1))
        && str1.charAt(diff.get(1)) == str2.charAt(diff.get(0));
  }
}
