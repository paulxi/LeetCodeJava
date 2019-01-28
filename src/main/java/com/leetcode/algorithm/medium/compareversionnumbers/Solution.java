package com.leetcode.algorithm.medium.compareversionnumbers;

class Solution {
  public int compareVersion(String version1, String version2) {
    String[] vers1 = version1.split("\\.");
    String[] vers2 = version2.split("\\.");

    int i = 0;
    while (i < vers1.length || i < vers2.length) {
      int num1 = i < vers1.length ? Integer.valueOf(vers1[i]) : 0;
      int num2 = i < vers2.length ? Integer.valueOf(vers2[i]) : 0;
      if (num1 != num2) {
        return Integer.compare(num1, num2);
      }
      i++;
    }

    return 0;
  }
}
