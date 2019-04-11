package com.leetcode.algorithm.medium.openthelock;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(6, solution.openLock(new String[] {"0201","0101","0102","1212","2002"}, "0202"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(1, solution.openLock(new String[] {"8888"}, "0009"));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(-1, solution.openLock(new String[] {"8887","8889","8878","8898","8788","8988","7888","9888"}, "8888"));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertEquals(-1, solution.openLock(new String[] {"0000"}, "8888"));
  }
}
