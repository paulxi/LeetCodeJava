package com.leetcode.algorithm.hard.ksimilarstrings;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class Solution {
  public int kSimilarity(String a, String b) {
    if (a.equals(b)) {
      return 0;
    }
    Queue<String> queue = new LinkedList<>();
    Set<String> visited = new HashSet<>();
    queue.add(a);
    visited.add(a);
    int ans = 0;
    while (!queue.isEmpty()) {
      ans++;
      int size = queue.size();
      for (int k = 0; k < size; k++) {
        String s = queue.poll();
        int i = 0;
        while (s.charAt(i) == b.charAt(i)) {
          i++;
        }
        for (int j = i + 1; j < s.length(); j++) {
          if (s.charAt(j) == b.charAt(j) || s.charAt(i) != b.charAt(j)) {
            continue;
          }
          String temp = swap(s, i, j);
          if (temp.equals(b)) {
            return ans;
          }
          if (!visited.contains(temp)) {
            queue.offer(temp);
            visited.add(temp);
          }
        }
      }
    }
    return -1;
  }

  private String swap(String s, int i, int j) {
    char[] chars = s.toCharArray();
    char temp = chars[i];
    chars[i] = chars[j];
    chars[j] = temp;

    return new String(chars);
  }
}
