package com.leetcode.algorithm.medium.shortestwaytoformstring;

class Solution {
  public int shortestWay(String source, String target) {
    boolean[] check = new boolean[26];
    for (char c: source.toCharArray()) {
      check[c - 'a'] = true;
    }

    for (char c: target.toCharArray()) {
      if (!check[c - 'a']) {
        return -1;
      }
    }

    int i = 0;
    int j = 0;
    int count = 1;

    while (j < target.length()) {
      if (source.charAt(i) == target.charAt(j)) {
        i++;
        j++;
      } else {
        i++;
      }

      if (i == source.length() && j != target.length()) {
        i = 0;
        count++;
      }
    }

    return count;
  }
}
