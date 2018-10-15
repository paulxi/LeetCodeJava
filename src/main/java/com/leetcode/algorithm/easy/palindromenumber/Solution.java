package com.leetcode.algorithm.easy.palindromenumber;

class Solution {
  public boolean isPalindrome(int x) {
    if (x < 0 || (x % 10 == 0 && x != 0)) {
      return false;
    }

    int num = x;
    int reversed = 0;
    while (num > reversed) {
      reversed = reversed * 10 + num % 10;
      num /= 10;
    }

    return num == reversed || num == reversed / 10;
  }
}
