package com.leetcode.algorithm.hard.similarstringgroups;

class Solution {
  public int numSimilarGroups(String[] arr) {
    int ans = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == null) {
        continue;
      }

      ans++;
      dfs(arr, i);
    }

    return ans;
  }

  private void dfs(String[] arr, int start) {
    String str = arr[start];
    arr[start] = null;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != null && isSimilar(str, arr[i])) {
        dfs(arr, i);
      }
    }
  }

  private boolean isSimilar(String s1, String s2) {
    int diff = 0;
    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) != s2.charAt(i)) {
        diff++;
      }
    }

    return diff == 2 || diff == 0;
  }
}
