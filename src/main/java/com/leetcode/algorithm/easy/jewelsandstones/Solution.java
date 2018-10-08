package com.leetcode.algorithm.easy.jewelsandstones;

import java.util.HashSet;

class Solution {
  public int numJewelsInStones(String jewels, String stones) {
    HashSet<Character> set = new HashSet<>();
    for (char j : jewels.toCharArray()) {
      set.add(j);
    }

    int result = 0;
    for (char s : stones.toCharArray()) {
      if (set.contains(s)) {
        result += 1;
      }
    }

    return result;
  }
}
