package com.leetcode.algorithm.medium.findpermutation;

class Solution {
  public int[] findPermutation(String s) {
    int n = s.length();
    int[] res = new int[n + 1];
    for (int i = 1; i <= res.length; i++) {
      res[i - 1] = i;
    }

    for (int i = 0; i < n; i++) {
      if (s.charAt(i) == 'D') {
        int l = i;
        while (i < n && s.charAt(i) == 'D') {
          i++;
        }
        reverse(res, l, i);
      }
    }

    return res;
  }

  private void reverse(int[] arr, int l, int r) {
    while (l < r) {
      int temp = arr[l];
      arr[l] = arr[r];
      arr[r] = temp;

      l++;
      r--;
    }
  }
}
