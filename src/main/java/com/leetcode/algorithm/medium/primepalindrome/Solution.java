package com.leetcode.algorithm.medium.primepalindrome;

class Solution {
  public int primePalindrome(int n) {
    if (8 <= n && n <= 11) {
      return 11;
    }

    for (int i = 1; i < 100000; i++) {
      String s = Integer.toString(i);
      String r = new StringBuilder(s).reverse().toString();
      int p = Integer.parseInt(s + r.substring(1));
      if (p >= n && isPrime(p)) {
        return p;
      }
    }
    return -1;
  }

  private boolean isPrime(int n) {
    if (n < 2 || n % 2 == 0) {
      return n == 2;
    }
    for (int i = 3; i * i <= n; i += 2) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
