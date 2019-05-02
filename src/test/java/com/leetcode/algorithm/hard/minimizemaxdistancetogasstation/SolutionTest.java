package com.leetcode.algorithm.hard.minimizemaxdistancetogasstation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(0.5, solution.minmaxGasDist(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 9), 0.00001);
  }
}
