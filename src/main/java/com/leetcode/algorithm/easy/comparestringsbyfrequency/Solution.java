package com.leetcode.algorithm.easy.comparestringsbyfrequency;

import java.util.Arrays;

class Solution {
  public int[] numSmallerByFrequency(String[] queries, String[] words) {
    int[] count = new int[11];
    for (String word: words) {
      count[frequency(word)]++;
    }

    for (int i = 9; i > 0; i--) {
      count[i] += count[i + 1];
    }

    int len = queries.length;
    int[] res = new int[len];
    for (int i = 0; i < len; i++) {
      int n = frequency(queries[i]);
      res[i] = n == 10 ? 0 : count[n + 1];
    }

    return res;
  }

  public int[] numSmallerByFrequency2(String[] queries, String[] words) {
    int[] q = new int[queries.length];
    int[] w = new int[words.length];
    for (int i = 0; i < q.length; i++) {
      q[i] = frequency(queries[i]);
    }
    for (int i = 0; i < w.length; i++) {
      w[i] = frequency(words[i]);
    }
    Arrays.sort(w);
    int[] res = new int[q.length];
    for (int i = 0; i < q.length; i++) {
      int l = 0;
      int r = w.length - 1;
      while (l <= r) {
        int mid = l + (r - l) / 2;
        if (w[mid] <= q[i]) {
          l = mid + 1;
        } else {
          r = mid - 1;
        }
      }
      res[i] = w.length - l;
    }
    return res;
  }

  private int frequency(String str) {
    int ans = 0;
    char cur = '~';
    for (char c: str.toCharArray()) {
      if (c == cur) {
        ans++;
      } else if (c < cur) {
        ans = 1;
        cur = c;
      }
    }
    return ans;
  }
}
