package com.leetcode.algorithm.medium.subarraysumsdivisiblebyk;

class Solution {
  public int subarraysDivByK(int[] arr, int k) {
    int[] count = new int[k];
    count[0] = 1;
    int prefix = 0;
    int res = 0;
    for (int num: arr) {
      prefix = (prefix + num % k + k) % k;
      res += count[prefix]++;
    }
    return res;
  }
}
