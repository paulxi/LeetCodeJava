package com.leetcode.algorithm.hard.randompickwithblacklist;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution(1, new int[0]);
    assertEquals(0, solution.pick());
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution(2, new int[0]);
    assertEquals(true, Arrays.asList(0, 1).contains(solution.pick()));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution(3, new int[] {1});
    assertEquals(true, Arrays.asList(0, 2).contains(solution.pick()));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution(4, new int[] {2});
    assertEquals(true, Arrays.asList(0, 1, 3).contains(solution.pick()));
  }
}
