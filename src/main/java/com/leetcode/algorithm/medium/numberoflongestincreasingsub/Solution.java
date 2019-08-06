package com.leetcode.algorithm.medium.numberoflongestincreasingsub;

class Solution {
  public int findNumberOfLIS(int[] nums) {
    int n = nums.length;
    int[] lens = new int[n];
    int[] cnt = new int[n];
    int ans = 0;
    int maxLen = 0;

    for (int i = 0; i < n; i++) {
      lens[i] = 1;
      cnt[i] = 1;

      for (int j = 0; j < i; j++) {
        if (nums[i] > nums[j]) {
          if (lens[i] < lens[j] + 1) {
            lens[i] = lens[j] + 1;
            cnt[i] = cnt[j];
          } else if (lens[j] + 1 == lens[i]) {
            cnt[i] += cnt[j];
          }
        }

      }

      if (maxLen == lens[i]) {
        ans += cnt[i];
      } else if (maxLen < lens[i]) {
        maxLen = lens[i];
        ans = cnt[i];
      }
    }

    return ans;
  }
}
