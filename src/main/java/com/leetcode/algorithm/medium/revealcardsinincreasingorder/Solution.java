package com.leetcode.algorithm.medium.revealcardsinincreasingorder;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
  public int[] deckRevealedIncreasing(int[] deck) {
    int n = deck.length;
    Arrays.sort(deck);
    Queue<Integer> q = new LinkedList<>();
    for (int i = 0; i < n; i++) {
      q.offer(i);
    }

    int[] ans = new int[n];
    for (int i = 0; i < n; i++) {
      ans[q.poll()] = deck[i];
      q.offer(q.poll());
    }

    return ans;
  }
}
