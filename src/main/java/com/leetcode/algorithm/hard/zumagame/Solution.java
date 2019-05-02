package com.leetcode.algorithm.hard.zumagame;

class Solution {
  static int MAXCOUNT = 6;

  public int findMinStep(String board, String hand) {
    int[] handCount = new int[26];
    for (int i = 0; i < hand.length(); i++) {
      handCount[hand.charAt(i) - 'A']++;
    }

    int rs = helper(board + "#", handCount);
    return rs == MAXCOUNT ? -1 : rs;
  }

  private int helper(String s, int[] h) {
    s = removeConsecutive(s);
    if (s.equals("#")) {
      return 0;
    }

    int rs = MAXCOUNT;
    int need = 0;
    for (int i = 0, j = 0; j < s.length(); j++) {
      if (s.charAt(j) == s.charAt(i)) {
        continue;
      }

      need = 3 - (j - i);
      if (h[s.charAt(i) - 'A'] >= need) {
        h[s.charAt(i) - 'A'] -= need;
        rs = Math.min(rs, need + helper(s.substring(0, i) + s.substring(j), h));
        h[s.charAt(i) - 'A'] += need;
      }
      i = j;
    }

    return rs;
  }

  private String removeConsecutive(String board) {
    for (int i = 0, j = 0; j < board.length(); j++) {
      if (board.charAt(j) == board.charAt(i)) {
        continue;
      }
      if (j - i >= 3) {
        return removeConsecutive(board.substring(0, i) + board.substring(j));
      } else {
        i = j;
      }
    }

    return board;
  }
}
