package com.leetcode.algorithm.hard.findtheclosestpalindrome;

class Solution {
  public String nearestPalindromic(String n) {
    long num = Long.valueOf(n);

    if (num <= 10 || (n.charAt(0) == '1' && Long.valueOf(n.substring(1)) == 0)) {
      return String.valueOf(num - 1);
    }

    if (num == 11 || (n.charAt(0) == '1' && n.charAt(n.length() - 1) == '1' &&
        Long.valueOf(n.substring(1, n.length() - 1)) == 0)) {
      return String.valueOf(num - 2);
    }

    boolean allNine = true;
    for (char c: n.toCharArray()) {
      if (c != '9') {
        allNine = false;
        break;
      }
    }

    if (allNine) {
      return String.valueOf(num + 2);
    }

    String root = n.substring(0, (n.length() + 1) / 2);
    long rootNum = Long.valueOf(root);
    String cur = toPalindrome(rootNum, n.length() % 2 == 0);
    String pre = toPalindrome(rootNum - 1, n.length() % 2 == 0);
    String next = toPalindrome(rootNum + 1, n.length() % 2 == 0);

    long curNum = Long.valueOf(cur);
    long preNum = Long.valueOf(pre);
    long nextNum = Long.valueOf(next);

    long d1 = Math.abs(num - preNum);
    long d2 = Math.abs(num - curNum);
    long d3 = Math.abs(num - nextNum);

    if (num == curNum) {
      return d1 <= d3 ? pre : next;
    } else if (num > curNum) {
      return d2 <= d3 ? cur : next;
    } else {
      return d1 <= d2 ? pre : cur;
    }
  }

  String toPalindrome(long num, boolean isEven) {
    String left = String.valueOf(num);
    String right = new StringBuilder(left).reverse().toString();
    if (isEven) {
      return left + right;
    }

    return left + right.substring(1);
  }
}
