package com.leetcode.algorithm.medium.repeateddnasequences;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
  public List<String> findRepeatedDnaSequences(String s) {
    Set<String> seen = new HashSet<String>();
    Set<String> repeated = new HashSet<>();
    for (int i = 0; i < s.length() - 9; i++) {
      String sub = s.substring(i, i + 10);
      if (seen.contains(sub)) {
        repeated.add(sub);
      } else {
        seen.add(sub);
      }
    }

    return new ArrayList<>(repeated);
  }
}
