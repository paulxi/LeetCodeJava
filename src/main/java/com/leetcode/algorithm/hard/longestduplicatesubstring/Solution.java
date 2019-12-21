package com.leetcode.algorithm.hard.longestduplicatesubstring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
  private long q = (1 << 31) - 1;
  private int r = 256;

  public String longestDupSubstring(String s) {
    int lo = 0;
    int hi = s.length();
    while (lo < hi) {
      int mid = lo + (hi - lo) / 2;
      int index = test(s, mid);
      if (index < 0) {
        hi = mid;
      } else {
        lo = mid + 1;
      }
    }

    int len = lo - 1;
    if (len <= 0) {
      return "";
    }
    int start = test(s, len);
    return s.substring(start, start + len);
  }

  // https://github.com/kevin-wayne/algs4/blob/master/src/main/java/edu/princeton/cs/algs4/RabinKarp.java
  private int test(String s, int len) {
    Map<Long, List<Integer>> map = new HashMap<>();
    long h = hash(s, len);
    map.put(h, new ArrayList<>());
    map.get(h).add(0);

    long rm = 1;
    for (int i = 1; i <= len - 1; i++) {
      rm = (r * rm) % q;
    }

    for (int i = len; i < s.length(); i++) {
//      h = (h - s.charAt(i - len)) / q;
//      h += (s.charAt(i) - 'a' + 1) * pow(q, len - 1);
      h = (h + q - rm * s.charAt(i - len) % q) % q;
      h = (h * r + s.charAt(i)) % q;

      int startIndex = i - len + 1;
      if (map.containsKey(h)) {
        for (int prev: map.get(h)) {
          if (compare(s, startIndex, prev, len)) {
            return startIndex;
          }
        }
      } else {
        map.put(h, new ArrayList<>());
      }
      map.get(h).add(startIndex);
    }

    return -1;
  }

//  private long hash(String key, int len) {
//    long h = 0;
//    for (int j = 0; j < len; j++) {
//      h += (key.charAt(j) - 'a' + 1) * pow(q, j);
//    }
//    return h;
//  }

  private long hash(String key, int len) {
    // From Algorithms 4th edition
    long h = 0;
    for (int j = 0; j < len; j++) {
      h = (r * h + key.charAt(j)) % q;
    }
    return h;
  }

  private boolean compare(String s, int i1, int i2, int len) {
    for (int i = 0; i < len; i++) {
      if (s.charAt(i1 + i) != s.charAt(i2 + i)) {
        return false;
      }
    }

    return true;
  }

  private long pow(long base, int p) {
    long result = 1;
    long num = base;
    for (long i = p; i > 0; i /= 2) {
      if (i % 2 == 1) {
        result *= num;
      }
      num *= num;
    }

    return result;
  }
}
