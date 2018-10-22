package com.leetcode.algorithm.easy.reversestring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("olleh", solution.reverseString("hello"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals("amanaP :lanac a ,nalp a ,nam A", solution.reverseString("A man, a plan, a canal: Panama"));
  }
}
