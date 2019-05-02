package com.leetcode.algorithm.hard.studentattendancerecordii;

class Solution {
  //  static final int M = 1000000007;
  //
  //  public int checkRecord(int n) {
  //    long[] p = new long[n + 1];
  //    long[] porl = new long[n + 1];
  //
  //    p[0] = 1;
  //    porl[0] = 1;
  //    p[1] = 1;
  //    porl[1] = 2;
  //
  //    for (int i = 2; i <= n; i++) {
  //      p[i] = porl[i - 1];
  //      porl[i] = (p[i] + p[i -1] + p[i - 2]) % M;
  //    }
  //
  //    long res = porl[n];
  //    for (int i = 0; i < n; i++) {
  //      long s = (porl[i] * porl[n - i - 1]) % M;
  //      res = (res + s) % M;
  //    }
  //
  //    return (int) res;
  //  }

  //  When n = 1 we have:
  //
  //  A0L0: P
  //  A0L1: L
  //  A0L2:
  //  A1L0: A
  //  A1L1:
  //  A1L2:
  //  Done:
  //  When n = 2 we have:
  //
  //  A0L0: LP, PP
  //  A0L1: PL
  //  A0L2: LL
  //  A1L0: AP, LA, PA
  //  A1L1: AL
  //  A1L2:
  //  Done: AA
  //
  //  In general we have this transition table:
  //  	 -----+---------------
  //  INIT | A -- L -- P --
  //      -----+---------------
  //  A0L0 | A1L0 A0L1 A0L0
  //  A0L1 | A1L0 A0L2 A0L0
  //  A0L2 | A1L0 Done A0L0
  //  A1L0 | Done A1L1 A1L0
  //  A1L1 | Done A1L2 A1L0
  //  A1L2 | Done Done A1L0

  public int checkRecord(int n) {
    int[] dp = {1, 1, 0, 1, 0, 0};
    for (int i = 2; i <= n; i++) {
      dp = new int[] {sum(dp, 0, 2), dp[0], dp[1], sum(dp, 0, 5), dp[3], dp[4]};
    }

    return sum(dp, 0, 5);
  }

  private int sum(int[] arr, int l, int h) {
    int s = 0;
    for (int i = l; i <= h; i++) {
      s = (s + arr[i]) % 1000000007;
    }

    return s;
  }
}
