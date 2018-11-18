package com.leetcode.algorithm.medium.permutationsii;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    List<List<Integer>> result = solution.permuteUnique(new int[] {1, 2, 2});
    assertEquals(3, result.size());
  }
}
