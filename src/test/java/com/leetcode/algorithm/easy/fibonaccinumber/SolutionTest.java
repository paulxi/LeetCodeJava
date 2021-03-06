package com.leetcode.algorithm.easy.fibonaccinumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(1, solution.fib(2));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(2, solution.fib(3));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(3, solution.fib(4));
  }
}