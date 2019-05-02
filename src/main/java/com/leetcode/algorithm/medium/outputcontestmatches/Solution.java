package com.leetcode.algorithm.medium.outputcontestmatches;

class Solution {
  public String findContestMatch(int n) {
    String[] team = new String[n];
    for (int i = 0; i < team.length; i++) {
      team[i] = String.valueOf(i + 1);
    }

    while (n > 1) {
      for (int i = 0; i < n / 2; i++) {
        team[i] = "(" + team[i] + "," + team[n - 1 - i] + ")";
      }
      n /= 2;
    }

    return team[0];
  }
}
