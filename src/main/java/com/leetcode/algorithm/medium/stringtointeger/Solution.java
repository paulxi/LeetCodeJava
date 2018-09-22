package com.leetcode.algorithm.medium.stringtointeger;

class Solution {
  public int myAtoi(String str) {
    final int posRemainder = Integer.MAX_VALUE % 10;
    final int negRemainder = Integer.MIN_VALUE % 10;
    int result = 0;
    boolean negative = false;

    int ptr = 0;
    while (ptr < str.length() && str.charAt(ptr) == ' ') {
      ptr++;
    }

    if (ptr == str.length()) {
      return result;
    }

    if (str.charAt(ptr) == '-') {
      negative = true;
      ptr++;
    } else if (str.charAt(ptr) == '+') {
      ptr++;
    }

    for (int i = ptr; i < str.length(); i++) {
      char c = str.charAt(i);

      if (c >= '0' && c <= '9') {
        int sub = negative ? '0' - c : c - '0';
        if (negative) {
          if (result < Integer.MIN_VALUE / 10
              || (result == Integer.MIN_VALUE / 10 && sub < negRemainder)) {
            result = Integer.MIN_VALUE;
            break;
          }
        } else {
          if (result > Integer.MAX_VALUE / 10
              || (result == Integer.MAX_VALUE / 10 && sub > posRemainder)) {
            result = Integer.MAX_VALUE;
            break;
          }
        }
        result = (result * 10) + sub;
      } else {
        break;
      }
    }

    return result;
  }
}
