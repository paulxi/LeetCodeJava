package com.leetcode.algorithm.medium.findklengthsubstringswithnorepeatedcharacters;

import java.util.HashSet;
import java.util.Set;

class Solution {
  public int numKLenSubstrNoRepeats(String s, int k) {
    Set<Character> set = new HashSet<>();
    int res = 0;
    int i = 0;
    for (int j = 0; j < s.length(); j++) {
      while (set.contains(s.charAt(j))) {
        set.remove(s.charAt(i));
        i++;
      }
      set.add(s.charAt(j));
      res += j - i + 1 >= k ? 1 : 0;
    }
    return res;
  }
}
