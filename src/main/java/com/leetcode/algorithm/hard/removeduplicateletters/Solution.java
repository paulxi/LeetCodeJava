package com.leetcode.algorithm.hard.removeduplicateletters;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
  public String removeDuplicateLetters(String s) {
    if (s.length() <= 1) {
      return s;
    }

    int[] cnt = new int[26];
    for (int i = 0; i < s.length(); i++) {
      cnt[s.charAt(i) - 'a'] += 1;
    }

    int pos = 0;

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) < s.charAt(pos)) {
        pos = i;
      }
      int index = s.charAt(i) - 'a';
      cnt[index] -= 1;
      if (cnt[index] == 0) {
        break;
      }
    }

    String c = s.substring(pos, pos + 1);

    return c + removeDuplicateLetters(s.substring(pos + 1).replace(c, ""));
  }

  public String removeDuplicateLetters2(String s) {
    int[] cnt = new int[26];
    for (int i = 0; i < s.length(); i++) {
      cnt[s.charAt(i) - 'a'] += 1;
    }
    boolean[] inQueue = new boolean[26];
    Deque<Integer> deque = new ArrayDeque<>();

    for (int i = 0; i < s.length(); i++) {
      int idx = s.charAt(i) - 'a';
      cnt[idx]--;
      if (inQueue[idx]) {
        continue;
      }

      while (!deque.isEmpty() && deque.peekLast() > idx && cnt[deque.peekLast()] > 0) {
        int last = deque.pollLast();
        inQueue[last] = false;
      }
      inQueue[idx] = true;
      deque.offer(idx);
    }

    StringBuilder sb = new StringBuilder();
    while (!deque.isEmpty()) {
      sb.append((char)(deque.pollFirst() + 'a'));
    }

    return sb.toString();
  }
}
