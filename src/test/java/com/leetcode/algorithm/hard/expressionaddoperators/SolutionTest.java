package com.leetcode.algorithm.hard.expressionaddoperators;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList("1+2+3", "1*2*3"), solution.addOperators("123", 6));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList("2+3*2", "2*3+2"), solution.addOperators("232", 8));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList("1*0+5","10-5"), solution.addOperators("105", 5));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList("0+0", "0-0", "0*0"), solution.addOperators("00", 0));
  }
}
