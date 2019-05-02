package com.leetcode.algorithm.medium.validtictactoestate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(false, solution.validTicTacToe(new String[] {"O  ", "   ", "   "}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(false, solution.validTicTacToe(new String[] {"XOX", " X ", "   "}));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(false, solution.validTicTacToe(new String[] {"XXX", "   ", "OOO"}));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertEquals(true, solution.validTicTacToe(new String[] {"XOX", "O O", "XOX"}));
  }
}
