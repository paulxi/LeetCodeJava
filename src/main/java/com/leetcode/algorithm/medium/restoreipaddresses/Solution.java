package com.leetcode.algorithm.medium.restoreipaddresses;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<String> restoreIpAddresses(String s) {
    String[] addresses = new String[4];
    List<String> result = new ArrayList<>();
    helper(s, addresses, 0, result);
    return result;
  }

  private void helper(String str, String[] addresses, int index, List<String> list) {
    if (index == 4) {
      if (str.length() == 0) {
        list.add(String.join(".", addresses));
      }

      return;
    }

    if (str.length() == 0) {
      return;
    }

    if (str.charAt(0) != '0') {
      if (str.length() >= 3 && Integer.valueOf(str.substring(0, 3)) <= 255) {
        addresses[index] = str.substring(0, 3);
        helper(str.substring(3), addresses, index + 1, list);
      }

      if (str.length() >= 2) {
        addresses[index] = str.substring(0, 2);
        helper(str.substring(2), addresses, index + 1, list);
      }
    }

    if (str.length() >= 1) {
      addresses[index] = str.substring(0, 1);
      helper(str.substring(1), addresses, index + 1, list);
    }
  }
}
