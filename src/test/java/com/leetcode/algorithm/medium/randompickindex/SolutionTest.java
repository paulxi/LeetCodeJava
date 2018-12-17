package com.leetcode.algorithm.medium.randompickindex;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    int[] nums = new int[] {1,2,3,3,3};
    Solution solution = new Solution(nums);
    assertEquals(true, Arrays.asList(2, 3, 4).contains(solution.pick(3)));
    assertEquals(0, solution.pick(1));
  }
}
