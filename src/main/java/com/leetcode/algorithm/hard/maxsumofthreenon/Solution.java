package com.leetcode.algorithm.hard.maxsumofthreenon;

class Solution {
  public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
    if (nums.length < 3 * k) {
      return new int[0];
    }

    int n = nums.length;
    int maxsum = 0;
    int[] sum = new int[n + 1];
    int[] posLeft = new int[n];
    int[] posRight = new int[n];
    int[] ans = new int[3];

    for (int i = 0; i < n; i++) {
      sum[i + 1] = sum[i] + nums[i];
    }

    for (int i = k, tot = sum[k] - sum[0]; i < n; i++) {
      if (sum[i + 1] - sum[i + 1 - k] > tot) {
        posLeft[i] = i + 1 - k;
        tot = sum[i + 1] - sum[i + 1 - k];
      } else {
        posLeft[i] = posLeft[i - 1];
      }
    }

    posRight[n - k] = n - k;
    for (int i = n - k - 1, tot = sum[n] - sum[n - k]; i >= 0; i--) {
      if (sum[i + k] - sum[i] >= tot) {
        posRight[i] = i;
        tot = sum[i + k] - sum[i];
      } else {
        posRight[i] = posRight[i + 1];
      }
    }

    for (int i = k; i <= n - 2*k; i++) {
      int l = posLeft[i - 1];
      int r = posRight[i + k];
      int tot = sum[i + k] - sum[i] + sum[l + k] - sum[l] + sum[r + k] - sum[r];
      if (tot > maxsum) {
        maxsum = tot;
        ans[0] = l;
        ans[1] = i;
        ans[2] = r;
      }
    }

    return ans;
  }
}
