package com.leetcode.algorithm.medium.threesumwithmultiplicity;

class Solution {
  public int threeSumMulti(int[] a, int target) {
    int MOD = 1_000_000_007;

    long[] count = new long[101];
    int uniq = 0;
    for (int x: a) {
      count[x]++;
      if (count[x] == 1) {
        uniq++;
      }
    }

    int t = 0;
    int[] keys = new int[uniq];
    for (int i = 0; i <= 100; i++) {
      if (count[i] > 0) {
        keys[t++] = i;
      }
    }

    long ans = 0;
    for (int i = 0; i < keys.length; i++) {
      int x = keys[i];

      int low = i;
      int high = keys.length - 1;

      int sum = target - keys[i];
      while (low <= high) {
        int y = keys[low];
        int z = keys[high];

        if (y + z == sum) {
          if (i < low && low < high) {
            ans += count[x] * count[y] * count[z];
          } else if (i == low && low < high) {
            ans += count[x] * (count[x] - 1) / 2 * count[z];
          } else if (i < low && low == high) {
            ans += count[x] * count[y] * (count[y] - 1) / 2;
          } else {
            ans += count[x] * (count[x] - 1) * (count[x] - 2) / 6;
          }

          ans %= MOD;
          low++;
          high--;
        } else if (y + z > sum) {
          high--;
        } else {
          low++;
        }
      }
    }

    return (int)ans;
  }
}
