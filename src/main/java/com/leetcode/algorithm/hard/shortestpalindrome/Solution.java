package com.leetcode.algorithm.hard.shortestpalindrome;

class Solution {
  public String shortestPalindrome(String s) {
    int n = s.length();
    String rev = new StringBuilder(s).reverse().toString();
    for (int i = 0; i < n; i++) {
      if (s.substring(0, n - i).equals(rev.substring(i))) {
        return rev.substring(0, i) + s;
      }
    }

    return "";
  }

  public String shortestPalindrome2(String s) {
    int n = s.length();
    String rev = new StringBuilder(s).reverse().toString();
    int[] table = generateTable( s + "#" + rev);

    return rev.substring(0, n - table[table.length - 1]) + s;

  }

  private int[] generateTable(String p) {
    int len = p.length();
    int[] table = new int[len];
    int i = 1;
    int j = 0;
    while (i < len) {
      if (p.charAt(i) == p.charAt(j)) {
        table[i] = j + 1;
        i++;
        j++;
      } else {
        if (j > 0) {
          j = table[j - 1];
        } else {
          i++;
        }
      }
    }

    return table;
  }
}
