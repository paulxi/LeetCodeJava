package com.leetcode.algorithm.medium.friendsofappropriateages;

class Solution {
  public int numFriendRequests(int[] ages) {
    int[] count = new int[121];
    for (int age: ages) {
      count[age]++;
    }

    int[] sum = new int[121];
    for (int i = 1; i < sum.length; i++) {
      sum[i] = sum[i - 1] + count[i];
    }

    int ans = 0;
    for (int i = 15; i <= 120; i++) {
      if (count[i] == 0) {
        continue;
      }

      ans += (sum[i] - sum[i / 2 + 7]) * count[i] - count[i];
    }

    return ans;
  }
}
