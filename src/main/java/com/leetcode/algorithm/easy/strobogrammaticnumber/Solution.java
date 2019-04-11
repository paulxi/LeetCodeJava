package com.leetcode.algorithm.easy.strobogrammaticnumber;

import java.util.HashMap;
import java.util.Map;

class Solution {
  public boolean isStrobogrammatic(String num) {
    Map<Character, Character> map = new HashMap<>();
    map.put('0', '0');
    map.put('1', '1');
    map.put('8', '8');
    map.put('6', '9');
    map.put('9', '6');

    int i = 0;
    int j = num.length() - 1;

    while (i <= j) {
      char c1 = num.charAt(i);
      char c2 = num.charAt(j);

      if (map.containsKey(c1)) {
        if (map.get(c1) != c2) {
          return false;
        }
      } else {
        return false;
      }

      i++;
      j--;
    }

    return true;
  }
}
