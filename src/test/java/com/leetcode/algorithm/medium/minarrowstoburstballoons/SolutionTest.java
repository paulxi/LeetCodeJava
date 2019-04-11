package com.leetcode.algorithm.medium.minarrowstoburstballoons;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import com.leetcode.algorithm.common.Interval;
import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(2, solution.findMinArrowShots(new int[][] {
        {10, 16}, {2, 8}, {1, 6}, {7, 12}
    }));
  }
}
