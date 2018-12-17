package com.leetcode.algorithm.medium.findthecelebrity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    solution.predicate = (Integer a, Integer b) -> {
      if (a == 1) {
        return false;
      }
      if (b == 1) {
        return true;
      }
      return true;
    };

    assertEquals(1, solution.findCelebrity(3));
  }
}
