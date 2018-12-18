package com.leetcode.algorithm.medium.rand10usingrand7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    solution.rand7Supplier = () -> 5;
    assertEquals(3, solution.rand10());
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    solution.rand7Supplier = () -> 3;
    assertEquals(7, solution.rand10());
    solution.rand7Supplier = () -> 4;
    assertEquals(5, solution.rand10());
  }
}
