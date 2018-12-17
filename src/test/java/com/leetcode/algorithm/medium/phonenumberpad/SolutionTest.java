package com.leetcode.algorithm.medium.phonenumberpad;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    List<List<Integer>> result = solution.findValidNumbers(5, 1);
    assertEquals(Arrays.asList(Arrays.asList(5)), result);
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    List<List<Integer>> result = solution.findValidNumbers(1, 3);
    assertEquals(Arrays.asList(
        Arrays.asList(1, 4, 1),
        Arrays.asList(1, 4, 7),
        Arrays.asList(1, 4, 5),
        Arrays.asList(1, 2, 5),
        Arrays.asList(1, 2, 1),
        Arrays.asList(1, 2, 3)), result);
  }
}
