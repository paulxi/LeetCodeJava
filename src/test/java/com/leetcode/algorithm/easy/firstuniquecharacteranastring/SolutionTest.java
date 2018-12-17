package com.leetcode.algorithm.easy.firstuniquecharacteranastring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(0, solution.firstUniqChar("leetcode"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(2, solution.firstUniqChar("loveleetcode"));
  }
}
