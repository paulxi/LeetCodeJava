package com.leetcode.algorithm.medium.permutationinstring;

class Solution {
  public boolean checkInclusion(String s1, String s2) {
    int len1 = s1.length();
    int len2 = s2.length();
    if (len1 > len2) {
      return false;
    }

    int[] count = new int[26];

    for (int i = 0; i < len1; i++) {
      count[s1.charAt(i) - 'a']++;
      count[s2.charAt(i) - 'a']--;
    }

    if (isAllZero(count)) {
      return true;
    }

    for (int i = len1; i < len2; i++) {
      count[s2.charAt(i) - 'a']--;
      count[s2.charAt(i - len1) - 'a']++;

      if (isAllZero(count)) {
        return true;
      }
    }

    return false;
  }

  private boolean isAllZero(int[] count) {
    for (int i = 0; i < count.length; i++) {
      if (count[i] != 0) {
        return false;
      }
    }

    return true;
  }
}
