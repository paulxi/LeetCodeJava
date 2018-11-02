package com.leetcode.algorithm.easy.addbinary;

class Solution {
  public String addBinary(String a, String b) {
    StringBuilder result = new StringBuilder();
    char carrier = '0';
    int index = 0;
    while (index < a.length() || index < b.length()) {
      char ca = '0';
      char cb = '0';

      if (index < a.length()) {
        ca = a.charAt(a.length() - index - 1);
      }
      if (index < b.length()) {
        cb = b.charAt(b.length() - index - 1);
      }

      if (ca == cb) {
        result.insert(0, carrier);
        carrier = ca;
      } else {
        if (carrier == '0') {
          result.insert(0, "1");
        } else {
          result.insert(0, "0");
        }
      }

      index += 1;
    }

    if (carrier == '1') {
      result.insert(0, "1");
    }

    return result.toString();
  }
}
