package com.leetcode.algorithm.hard.specialbinarystring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
  public String makeLargestSpecial(String str) {
    int count = 0;
    int i = 0;
    List<String> res = new ArrayList<>();
    for (int j = 0; j < str.length(); j++) {
      if (str.charAt(j) == '1') {
        count++;
      } else if (str.charAt(j) == '0') {
        count--;
      }
      if (count == 0) {
        res.add('1' + makeLargestSpecial(str.substring(i + 1, j)) + '0');
        i = j + 1;
      }
    }

    Collections.sort(res, Collections.reverseOrder());
    return String.join("", res);
  }
}
