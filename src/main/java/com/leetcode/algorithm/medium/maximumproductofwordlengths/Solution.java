package com.leetcode.algorithm.medium.maximumproductofwordlengths;

class Solution {
  public int maxProduct(String[] words) {
    if (words.length == 0) {
      return 0;
    }

    int n = words.length;
    int[] value = new int[n];
    for (int i = 0; i < n; i++) {
      String word = words[i];
      for (int j = 0; j < word.length(); j++) {
        value[i] |= 1 << (word.charAt(j) - 'a');
      }
    }

    int ans = 0;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if ((value[i] & value[j]) == 0) {
          ans = Math.max(ans, words[i].length() * words[j].length());
        }
      }
    }

    return ans;
  }
}
