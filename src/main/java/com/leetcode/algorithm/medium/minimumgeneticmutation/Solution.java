package com.leetcode.algorithm.medium.minimumgeneticmutation;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class Solution {
  public int minMutation(String start, String end, String[] bank) {
    Set<String> set = new HashSet<>();
    for (String str: bank) {
      set.add(str);
    }

    if (!set.contains(end)) {
      return -1;
    }

    Queue<String> queue = new LinkedList<>();
    queue.offer(start);
    int ans = 0;

    while (!queue.isEmpty()) {
      ans++;
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        String str = queue.poll();
        Set<String> next = new HashSet<>();
        for (String gen: set) {
          if (isOneLetterDiff(str, gen)) {
            if (gen.equals(end)) {
              return ans;
            }
            queue.offer(gen);
            next.add(gen);
          }
        }

        set.removeAll(next);
      }
    }

    return -1;
  }

  private boolean isOneLetterDiff(String str1, String str2) {
    for (int i = 0; i < str1.length(); i++) {
      if (str1.charAt(i) != str2.charAt(i)) {
        return str1.substring(i + 1).equals(str2.substring(i + 1));
      }
    }

    return false;
  }
}
