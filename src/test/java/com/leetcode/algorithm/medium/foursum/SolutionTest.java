package com.leetcode.algorithm.medium.foursum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(
        Arrays.asList(-2, -1, 1, 2),
        Arrays.asList(-2,  0, 0, 2),
        Arrays.asList(-1,  0, 0, 1)
    ), solution.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0));
  }
}
