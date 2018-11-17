package com.leetcode.algorithm.medium.subsets;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    List<List<Integer>> result = solution.subsets(new int[] {1, 2, 3});
    assertEquals(8, result.size());
  }
}
