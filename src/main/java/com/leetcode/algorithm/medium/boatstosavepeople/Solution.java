package com.leetcode.algorithm.medium.boatstosavepeople;

import java.util.Arrays;

class Solution {
  public int numRescueBoats(int[] people, int limit) {
    Arrays.sort(people);

    int start = 0;
    int end = people.length - 1;
    int ans = 0;
    while (start <= end) {
      ans++;

      if (people[start] + people[end] <= limit) {
        start++;
      }
      end--;
    }

    return ans;
  }
}
