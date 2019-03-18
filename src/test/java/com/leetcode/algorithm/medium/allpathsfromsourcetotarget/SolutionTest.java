package com.leetcode.algorithm.medium.allpathsfromsourcetotarget;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(
        Arrays.asList(0, 1, 3),
        Arrays.asList(0, 2, 3)
    ), solution.allPathsSourceTarget(new int[][] {
        {1, 2},
        {3},
        {3},
        {}
    }));
  }
}
