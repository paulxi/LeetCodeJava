package com.leetcode.algorithm.hard.validnumber;

class Solution {
  public boolean isNumber(String s) {
    String str = s.toLowerCase().trim();

    boolean dotSeen = false;
    boolean eSeen = false;
    boolean numberBeforeE = false;
    boolean numberAfterE = false;

    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if ('0' <= c && c <= '9') {
        if (!eSeen) {
          numberBeforeE = true;
        }
        if (eSeen) {
          numberAfterE = true;
        }
      } else if (c == '-' || c == '+') {
        if (i != 0 && str.charAt(i - 1) != 'e') {
          return false;
        }
      } else if (c == '.') {
        if (eSeen || dotSeen) {
          return false;
        }
        dotSeen = true;
      } else if (c == 'e') {
        if (eSeen) {
          return false;
        }
        eSeen = true;
      } else {
        return false;
      }
    }

    return eSeen ? (numberAfterE && numberBeforeE) : numberBeforeE;
  }
}
