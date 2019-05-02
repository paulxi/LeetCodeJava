package com.leetcode.algorithm.hard.specialbinarystring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("11100100", solution.makeLargestSpecial("11011000"));
  }
}
