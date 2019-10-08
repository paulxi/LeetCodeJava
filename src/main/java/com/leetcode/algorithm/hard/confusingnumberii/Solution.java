package com.leetcode.algorithm.hard.confusingnumberii;

class Solution {
  static char[][] pairs = new char[][] {{'0', '0'}, {'1', '1'}, {'6', '9'}, {'8', '8'}, {'9', '6'}};
  public int confusingNumberII(int n) {
    String num = Integer.toString(n);
    int res = findTotal(num);
    for (int len = 1; len <= num.length(); len++) {
      char[] curr = new char[len];
      res -= dfs(curr, num, 0, len - 1);
    }
    return res;
  }

  private int findTotal(String s) {
    if (s.length() == 0) {
      return 1;
    }
    char first = s.charAt(0);
    int res = count(first) * (int)(Math.pow(5, s.length() - 1));
    if (first == '0' || first == '1' || first == '6' || first == '8' || first == '9') {
      res += findTotal(s.substring(1));
    }
    return res;
  }

  private int dfs(char[] curr, String num, int left, int right) {
    int res = 0;
    if (left > right) {
      String s = new String(curr);
      if (s.length() < num.length() || s.compareTo(num) <= 0) {
        res++;
      }
    } else {
      for (char[] p: pairs) {
        curr[left] = p[0];
        curr[right] = p[1];
        if ((curr[0] == '0' && curr.length > 1) || (left == right && p[0] != p[1])) {
          continue;
        }
        res += dfs(curr, num, left + 1, right - 1);
      }
    }

    return res;
  }

  private int count(char c) {
    int res = 0;
    for (char[] p: pairs) {
      if (p[0] < c) {
        res++;
      }
    }
    return res;
  }
}
