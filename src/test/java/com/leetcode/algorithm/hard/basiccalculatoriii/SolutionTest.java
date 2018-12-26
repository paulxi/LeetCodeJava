package com.leetcode.algorithm.hard.basiccalculatoriii;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    assertEquals(2, solution.calculate("1 + 1"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();

    assertEquals(4, solution.calculate(" 6-4 / 2 "));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();

    assertEquals(21, solution.calculate("2*(5+5*2)/3+(6/2+8)"));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();

    assertEquals(-12, solution.calculate("(2+6* 3+5- (3*14/7+2)*5)+3"));
  }
}
