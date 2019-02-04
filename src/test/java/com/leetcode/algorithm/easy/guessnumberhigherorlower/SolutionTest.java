package com.leetcode.algorithm.easy.guessnumberhigherorlower;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    solution.function = (a) -> a == 6 ? 0 : a > 6 ? -1 : 1;
    assertEquals(6, solution.guessNumber(10));
  }
}
